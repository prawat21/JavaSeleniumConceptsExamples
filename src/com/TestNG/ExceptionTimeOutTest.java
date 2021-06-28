package com.TestNG;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {
	// Used for terminating the infinite loop
	@Test(invocationTimeOut=2000)
	//@Test(timeOut=1000)
	public void infiniteLoopTest() {
		int i =1;
		while(i==2) {
			System.out.println(i);
			
		}
	}
	@Test(expectedExceptions=NumberFormatException.class)
	public void test1() {
		String x = "100A";
		int a = Integer.parseInt(x);
		System.out.println(a);
	}

}
