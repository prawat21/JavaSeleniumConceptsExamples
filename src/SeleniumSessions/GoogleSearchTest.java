package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Puneet.Rawat/Downloads/chromedriver1/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Launch Chrome Driver
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com"); // Enter URL
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.className("iblpc")).sendKeys("Testing");

	}

}
