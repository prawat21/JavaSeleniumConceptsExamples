package com.parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	
	WebDriver driver;
	
	@Test
	@Parameters({"browser", "url", "emailId"})
	public void yahooLoginTest(String browser, String url, String emailId) {
		
		if(browser.equals("chrome")) {
			
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver(); // Launch Chrome Driver
		}
		else if(browser.equals("chrome")){
			System.setProperty("webdriver.gecko.driver", "driver/geckodriver");
			driver = new FirefoxDriver();
			
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.id("login-username")).clear();
		driver.findElement(By.id("login-username")).sendKeys(emailId);// enter user-name
		driver.findElement(By.xpath("//*[@id = 'login-signin']")).click();//click on next button
	}
	

}
