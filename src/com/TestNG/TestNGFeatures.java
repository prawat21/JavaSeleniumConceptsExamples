package com.TestNG;

import org.testng.annotations.Test;

public class TestNGFeatures {
	
	@Test
	public void loginTest() {
		System.out.println("Login Test");
		//int i = 9/0;
	}
	@Test(dependsOnMethods = "loginTest")
	public void homepageTest() {
		System.out.println("HomePage Test");
	}
	@Test(dependsOnMethods = "loginTest")
	public void searchPageTest() {
		System.out.println("SearchPage Test");
	}
	@Test(dependsOnMethods = "loginTest")
	public void regisPage() {
		System.out.println("Registration Page Test");
	}

}
