package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Puneet.Rawat/Downloads/chromedriver1/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Launch Chrome Driver
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com"); // Enter URL
		
		String title = driver.getTitle(); // Get Title
		System.out.println(title);
		
		// Validations
		if (title.equals("Google"))
		{
			System.out.println("Correct Title: Passed");
		}
		else {
			System.out.println("InCorrect Title: Failed");
		}
		
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();// quit the browser
	}

}
