package com.datadriven.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HalfEbayTest {

WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver1/chromedriver.exe");
		driver = new ChromeDriver(); // Launch Chrome Driver
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.ebay.com/");
	}
	
	@DataProvider
	public void getTestData() {
		
		
	}
	
	@Test
	public void halfEbayRegPageTest(String firstname, String lastname, String email, String password) {
		
		//enter data
		driver.findElement(By.xpath("//*[@id = 'firstname']")).clear();
		driver.findElement(By.xpath("//*[@id = 'firstname']")).sendKeys(firstname);
		
		driver.findElement(By.xpath("//*[@id = 'lastname']")).clear();
		driver.findElement(By.xpath("//*[@id = 'lastname']")).sendKeys(lastname);
		
		driver.findElement(By.xpath("//*[@id = 'Email']")).clear();
		driver.findElement(By.xpath("//*[@id = 'Email']")).sendKeys(email);
		
		driver.findElement(By.xpath("//*[@id = 'password']")).clear();
		driver.findElement(By.xpath("//*[@id = 'password']")).sendKeys(password);
		
		
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
}
