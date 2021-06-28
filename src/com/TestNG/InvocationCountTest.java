package com.TestNG;

import org.testng.annotations.Test;

public class InvocationCountTest {
	
	// InvocationCount is used when a test case want to run multiple times
	@Test(invocationCount = 10)
	public void sum() {
		int a = 20;
		int b = 30;
		int c = a+b;
		System.out.println("Sum is=====" +c);
	}

}
