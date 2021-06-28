package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/Users/Puneet.Rawat/Downloads/chromedriver1/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Launch Chrome Driver
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// dynamic wait: If page will load in 10sec then, 20sec will be ignored
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		// dynamic wait: If any element loads in 5sec rest 10sec will be ignored
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.google.com/"); // Enter URL
		driver.navigate().to("https://www.amazon.com");
		driver.navigate().back();// to move back button on browser
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().refresh();

		driver.quit();
	}

}
