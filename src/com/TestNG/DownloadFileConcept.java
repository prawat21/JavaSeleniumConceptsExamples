package com.TestNG;

import java.io.File;
import java.util.UUID;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class DownloadFileConcept {
	
	WebDriver driver;
	File folder;
	
	@BeforeMethod
	public void setUp() {
		// 88889-890089-09909
		folder = new File(UUID.randomUUID().toString()); 
		folder.mkdir();
		System.setProperty("webdriver.chrome.driver", "C:/Users/Puneet.Rawat/Downloads/chromedriver1/chromedriver.exe");
		
		
		
		WebDriver driver = new ChromeDriver(); // Launch Chrome Driver
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	

}
