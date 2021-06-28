package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Puneet.Rawat/Downloads/chromedriver1/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Launch Chrome Driver
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.ebay.com/"); // Enter URL
		//driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Java");
		//driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("java");
		driver.findElement(By.xpath("//input[contains(@name, '_nkw')]")).sendKeys("java");
		
		//Dynamic ID: input
		//id = test_123, test_456, test_789
		//driver.findElement(By.xpath("//input[contains(@id, 'test_')]")).sendKeys("java");
		//driver.findElement(By.xpath("//input[starts-with(@id, 'test_')]")).sendKeys("java");
		//id = 1234_test_t, 3456_test_t, 5678_test_t
		//driver.findElement(By.xpath("//input[ends-with(@id, '_test_t')]")).sendKeys("java");
		
		// for links: custom xpath:
		// All the links are represented by <a> html tag:
		
		driver.findElement(By.xpath("//a[contains(text(),'Help & Contact')]")).click();
		
		
		
		
		driver.quit();

	}

}
