package com.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {
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

	@Test
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google", "Title is not matched");

	}

	@Test(priority = 2, groups = "Logo")
	public void googleLogoTest() throws InterruptedException {
		driver.switchTo().frame("backgroundImage");
		Thread.sleep(3000);
		Boolean logo = driver.findElement(By.xpath("//*[@id ='logo']")).isDisplayed();
		Assert.assertTrue(logo);
		//Assert.assertEquals(logo, true);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
