package com.dynatrace.openkit.core.communication;

import com.dynatrace.openkit.core.SessionImpl;

/**
 * Un this state open sessions are finished. After that all sessions are sent tot the server.
 * <p>
 * <p>
 * Transition to:
 * <ul>
 * <li>{@link BeaconSendingTerminalState}</li>
 * </ul>
 * </p>
 */
class BeaconSendingFlushSessionsState extends AbstractBeaconSendingState {

    BeaconSendingFlushSessionsState() {
        super(false);
    }

    @Override
    void doExecute(BeaconSendingContext context) {

        // end open sessions -> will be flushed afterwards
        SessionImpl[] openSessions = context.getAllOpenSessions();
        for (SessionImpl openSession : openSessions) {
            openSession.end();
        }

        // flush already finished (and previously ended) sessions
        SessionImpl finishedSession = context.getNextFinishedSession();
        while (finishedSession != null) {
            finishedSession.sendBeacon(context.getHTTPClientProvider());
            finishedSession = context.getNextFinishedSession();
        }

        // make last state transition to terminal state
        context.setNextState(new BeaconSendingTerminalState());
    }

    @Override
    AbstractBeaconSendingState getShutdownState() {
        return new BeaconSendingTerminalState();
    }
}
