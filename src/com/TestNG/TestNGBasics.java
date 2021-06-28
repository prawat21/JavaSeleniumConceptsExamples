package com.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
	// Pre-Conditions annotations -- Starting with @Before
	@BeforeSuite  //1
	public void setUp() {
		System.out.println("1. Setup System Property");
	}

	@BeforeTest  //2
	public void launchBrowser() {
		System.out.println("2.  Launch Browser");
	}

	@BeforeClass  //3
	public void enterURL() {
		System.out.println("Enter URL");
	}

	@BeforeMethod  //4
	public void login() {
		System.out.println("3. login Method");
	}
	
	// Test Cases----Starting with @Test
	@Test //5
	public void googleTitleTest() {
		System.out.println("Google Title Test");
	}

	// Post Conditions--starting with @After	
	@AfterMethod //6
	public void logOut() {
		System.out.println("Logout from App");
	}
	
	@AfterClass //7
	public void closeBrowser() {
		System.out.println("Close Browser");
	}

	@AfterTest //8
	public void deleteAllCookies() {
		System.out.println("Delete All Cookies");
	}

	@AfterSuite //9
	public void generateTestReport() {
		System.out.println("Test Report");
	}
}
