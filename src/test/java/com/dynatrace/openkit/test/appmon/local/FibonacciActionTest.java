/***************************************************
 * (c) 2016-2017 Dynatrace LLC
 *
 * @author: Christian Schwarzbauer
 */
package com.dynatrace.openkit.test.appmon.local;

import java.util.ArrayList;

import org.junit.Test;

import com.dynatrace.openkit.test.TestHTTPClient.Request;
import com.dynatrace.openkit.test.shared.FibonacciActionTestShared;

public class FibonacciActionTest extends AbstractLocalAppMonTest {

	@Test
	public void test() {
		FibonacciActionTestShared.test(openKit, TEST_IP);

		ArrayList<Request> sentRequests = openKitTestImpl.getSentRequests();
		String expectedBeacon = "vv=3&va=7.0.0000&ap=" + TEST_APPLICATION_ID + "&an=" + TEST_APPLICATION_NAME + "&pt=1&vi=" + testConfiguration.getVisitorID() + "&sn=1&ip=" + TEST_IP + "&tv=1004000&ts=1003000&tx=1131000&et=12&na=Fibonacci+No.+1&it=1&pa=5&s0=6&t0=7000&vl=1&et=12&na=Fibonacci+No.+0&it=1&pa=7&s0=10&t0=11000&vl=0&et=12&na=Fibonacci+No.+1&it=1&pa=8&s0=13&t0=14000&vl=1&et=12&na=Fibonacci+No.+2&it=1&pa=6&s0=15&t0=16000&vl=1&et=12&na=Fibonacci+No.+3&it=1&pa=4&s0=17&t0=18000&vl=2&et=12&na=Fibonacci+No.+0&it=1&pa=11&s0=22&t0=23000&vl=0&et=12&na=Fibonacci+No.+1&it=1&pa=12&s0=25&t0=26000&vl=1&et=12&na=Fibonacci+No.+2&it=1&pa=10&s0=27&t0=28000&vl=1&et=12&na=Fibonacci+No.+1&it=1&pa=14&s0=31&t0=32000&vl=1&et=12&na=Fibonacci+No.+0&it=1&pa=16&s0=35&t0=36000&vl=0&et=12&na=Fibonacci+No.+1&it=1&pa=17&s0=38&t0=39000&vl=1&et=12&na=Fibonacci+No.+2&it=1&pa=15&s0=40&t0=41000&vl=1&et=12&na=Fibonacci+No.+3&it=1&pa=13&s0=42&t0=43000&vl=2&et=12&na=Fibonacci+No.+4&it=1&pa=9&s0=44&t0=45000&vl=3&et=12&na=Fibonacci+No.+5&it=1&pa=3&s0=46&t0=47000&vl=5&et=12&na=Fibonacci+No.+0&it=1&pa=21&s0=52&t0=53000&vl=0&et=12&na=Fibonacci+No.+1&it=1&pa=22&s0=55&t0=56000&vl=1&et=12&na=Fibonacci+No.+2&it=1&pa=20&s0=57&t0=58000&vl=1&et=12&na=Fibonacci+No.+1&it=1&pa=24&s0=61&t0=62000&vl=1&et=12&na=Fibonacci+No.+0&it=1&pa=26&s0=65&t0=66000&vl=0&et=12&na=Fibonacci+No.+1&it=1&pa=27&s0=68&t0=69000&vl=1&et=12&na=Fibonacci+No.+2&it=1&pa=25&s0=70&t0=71000&vl=1&et=12&na=Fibonacci+No.+3&it=1&pa=23&s0=72&t0=73000&vl=2&et=12&na=Fibonacci+No.+4&it=1&pa=19&s0=74&t0=75000&vl=3&et=12&na=Fibonacci+No.+1&it=1&pa=30&s0=79&t0=80000&vl=1&et=12&na=Fibonacci+No.+0&it=1&pa=32&s0=83&t0=84000&vl=0&et=12&na=Fibonacci+No.+1&it=1&pa=33&s0=86&t0=87000&vl=1&et=12&na=Fibonacci+No.+2&it=1&pa=31&s0=88&t0=89000&vl=1&et=12&na=Fibonacci+No.+3&it=1&pa=29&s0=90&t0=91000&vl=2&et=12&na=Fibonacci+No.+0&it=1&pa=36&s0=95&t0=96000&vl=0&et=12&na=Fibonacci+No.+1&it=1&pa=37&s0=98&t0=99000&vl=1&et=12&na=Fibonacci+No.+2&it=1&pa=35&s0=100&t0=101000&vl=1&et=12&na=Fibonacci+No.+1&it=1&pa=39&s0=104&t0=105000&vl=1&et=12&na=Fibonacci+No.+0&it=1&pa=41&s0=108&t0=109000&vl=0&et=12&na=Fibonacci+No.+1&it=1&pa=42&s0=111&t0=112000&vl=1&et=12&na=Fibonacci+No.+2&it=1&pa=40&s0=113&t0=114000&vl=1&et=12&na=Fibonacci+No.+3&it=1&pa=38&s0=115&t0=116000&vl=2&et=12&na=Fibonacci+No.+4&it=1&pa=34&s0=117&t0=118000&vl=3&et=12&na=Fibonacci+No.+5&it=1&pa=28&s0=119&t0=120000&vl=5&et=12&na=Fibonacci+No.+6&it=1&pa=18&s0=121&t0=122000&vl=8&et=12&na=Fibonacci+No.+7&it=1&pa=2&s0=123&t0=124000&vl=13&et=19&it=1&pa=0&s0=126&t0=127000&et=1&na=CalculateAction&it=1&ca=5&pa=4&s0=5&t0=6000&s1=7&t1=2000&et=1&na=CalculateAction&it=1&ca=7&pa=6&s0=9&t0=10000&s1=11&t1=2000&et=1&na=CalculateAction&it=1&ca=8&pa=6&s0=12&t0=13000&s1=14&t1=2000&et=1&na=CalculateAction&it=1&ca=6&pa=4&s0=8&t0=9000&s1=16&t1=8000&et=1&na=CalculateAction&it=1&ca=4&pa=3&s0=4&t0=5000&s1=18&t1=14000&et=1&na=CalculateAction&it=1&ca=11&pa=10&s0=21&t0=22000&s1=23&t1=2000&et=1&na=CalculateAction&it=1&ca=12&pa=10&s0=24&t0=25000&s1=26&t1=2000&et=1&na=CalculateAction&it=1&ca=10&pa=9&s0=20&t0=21000&s1=28&t1=8000&et=1&na=CalculateAction&it=1&ca=14&pa=13&s0=30&t0=31000&s1=32&t1=2000&et=1&na=CalculateAction&it=1&ca=16&pa=15&s0=34&t0=35000&s1=36&t1=2000&et=1&na=CalculateAction&it=1&ca=17&pa=15&s0=37&t0=38000&s1=39&t1=2000&et=1&na=CalculateAction&it=1&ca=15&pa=13&s0=33&t0=34000&s1=41&t1=8000&et=1&na=CalculateAction&it=1&ca=13&pa=9&s0=29&t0=30000&s1=43&t1=14000&et=1&na=CalculateAction&it=1&ca=9&pa=3&s0=19&t0=20000&s1=45&t1=26000&et=1&na=CalculateAction&it=1&ca=3&pa=2&s0=3&t0=4000&s1=47&t1=44000&et=1&na=CalculateAction&it=1&ca=21&pa=20&s0=51&t0=52000&s1=53&t1=2000&et=1&na=CalculateAction&it=1&ca=22&pa=20&s0=54&t0=55000&s1=56&t1=2000&et=1&na=CalculateAction&it=1&ca=20&pa=19&s0=50&t0=51000&s1=58&t1=8000&et=1&na=CalculateAction&it=1&ca=24&pa=23&s0=60&t0=61000&s1=62&t1=2000&et=1&na=CalculateAction&it=1&ca=26&pa=25&s0=64&t0=65000&s1=66&t1=2000&et=1&na=CalculateAction&it=1&ca=27&pa=25&s0=67&t0=68000&s1=69&t1=2000&et=1&na=CalculateAction&it=1&ca=25&pa=23&s0=63&t0=64000&s1=71&t1=8000&et=1&na=CalculateAction&it=1&ca=23&pa=19&s0=59&t0=60000&s1=73&t1=14000&et=1&na=CalculateAction&it=1&ca=19&pa=18&s0=49&t0=50000&s1=75&t1=26000&et=1&na=CalculateAction&it=1&ca=30&pa=29&s0=78&t0=79000&s1=80&t1=2000&et=1&na=CalculateAction&it=1&ca=32&pa=31&s0=82&t0=83000&s1=84&t1=2000&et=1&na=CalculateAction&it=1&ca=33&pa=31&s0=85&t0=86000&s1=87&t1=2000&et=1&na=CalculateAction&it=1&ca=31&pa=29&s0=81&t0=82000&s1=89&t1=8000&et=1&na=CalculateAction&it=1&ca=29&pa=28&s0=77&t0=78000&s1=91&t1=14000&et=1&na=CalculateAction&it=1&ca=36&pa=35&s0=94&t0=95000&s1=96&t1=2000&et=1&na=CalculateAction&it=1&ca=37&pa=35&s0=97&t0=98000&s1=99&t1=2000&et=1&na=CalculateAction&it=1&ca=35&pa=34&s0=93&t0=94000&s1=101&t1=8000&et=1&na=CalculateAction&it=1&ca=39&pa=38&s0=103&t0=104000&s1=105&t1=2000&et=1&na=CalculateAction&it=1&ca=41&pa=40&s0=107&t0=108000&s1=109&t1=2000&et=1&na=CalculateAction&it=1&ca=42&pa=40&s0=110&t0=111000&s1=112&t1=2000&et=1&na=CalculateAction&it=1&ca=40&pa=38&s0=106&t0=107000&s1=114&t1=8000&et=1&na=CalculateAction&it=1&ca=38&pa=34&s0=102&t0=103000&s1=116&t1=14000&et=1&na=CalculateAction&it=1&ca=34&pa=28&s0=92&t0=93000&s1=118&t1=26000&et=1&na=CalculateAction&it=1&ca=28&pa=18&s0=76&t0=77000&s1=120&t1=44000&et=1&na=CalculateAction&it=1&ca=18&pa=2&s0=48&t0=49000&s1=122&t1=74000&et=1&na=CalculateAction&it=1&ca=2&pa=1&s0=2&t0=3000&s1=124&t1=122000&et=1&na=FibonacciAction&it=1&ca=1&pa=0&s0=1&t0=2000&s1=125&t1=124000";
		validateDefaultRequests(sentRequests, expectedBeacon);
	}

}
