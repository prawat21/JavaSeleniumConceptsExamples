package com.parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	
	WebDriver driver;
	
	@Test
	@Parameters({"url", "emailId"})
	public void yahooLoginTest(String url, String emailId) {
		System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver1/chromedriver.exe");
		driver = new ChromeDriver(); // Launch Chrome Driver
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.id("login-username")).clear();
		driver.findElement(By.id("login-username")).sendKeys(emailId);
		driver.findElement(By.xpath("//*[@id = 'login-signin']")).click();
	}
	

}
