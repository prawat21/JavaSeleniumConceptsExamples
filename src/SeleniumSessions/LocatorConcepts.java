package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcepts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Puneet.Rawat/Downloads/chromedriver1/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Launch Chrome Driver
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.get("https://signup.ebay.com/pa/crte?"); // Enter URL
		
		// 1. Using Xpath
		driver.findElement(By.xpath("//*[@id = 'firstname']")).sendKeys("TestUser1");
		driver.findElement(By.xpath("//*[@id = 'lastname']")).sendKeys("Demo1");
		
		
		
		// 2. Using ID
		//driver.findElement(By.id("firstname")).sendKeys("TestUser");
		//driver.findElement(By.id("lastname")).sendKeys("Demo");
		driver.findElement(By.id("Email")).sendKeys("puneetrawat852@gmail.com");
		//driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.id("showpassword")).click();
		driver.findElement(By.id("EMAIL_REG_FORM_SUBMIT")).click();
		
		
		// 3. Using Name
		driver.findElement(By.name("password")).sendKeys("Selenium@123");
		
		// 4. LinkText
		driver.findElement(By.linkText("Create a business account")).click();
		
		// 5. Partial LinkText not recommend to use
		//driver.findElement(By.partialLinkText("Create a ")).click();
		
		// 6.CSS Selector
		
		//driver.findElement(By.cssSelector("#lastname")).sendKeys("Demo");
		
		driver.quit();
	}

}
