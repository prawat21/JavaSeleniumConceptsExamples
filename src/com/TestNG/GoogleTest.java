package com.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver1/chromedriver.exe");
		driver = new ChromeDriver(); // Launch Chrome Driver
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
	}
	
	@Test(priority = 1, groups = "Title")
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@Test(priority = 2, groups = "Logo")
	public void googleLogoTest() throws InterruptedException {
		driver.switchTo().frame("backgroundImage");
		Thread.sleep(5000);
		Boolean logo = driver.findElement(By.xpath("//*[@id ='logo']")).isDisplayed();
		System.out.println("Logo is Displayed:" +logo);
	}
	
	@Test(priority = 3, groups = "Test")
	public void test3() {
		System.out.println("Test3");
	}
	@Test(priority = 4, groups = "Test")
	public void test4() {
		System.out.println("Test4");
	}
	@Test(priority = 5, groups = "Test")
	public void test5() {
		System.out.println("Test5");
	}
	@Test(priority = 6, groups = "Test")
	public void test6() {
		System.out.println("Test6");
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
