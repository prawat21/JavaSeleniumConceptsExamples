package SeleniumSessions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShotConcept {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Puneet.Rawat/Downloads/chromedriver1/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Launch Chrome Driver
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// dynamic wait: If page will load in 10sec then, 20sec will be ignored
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		// dynamic wait: If any element loads in 5sec rest 10sec will be ignored
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.google.com/"); // Enter URL
		
		// Takes screenshot and store as a file format
		File scrfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// now copy the screenshot to desired location using copyfile method
		FileHandler.copy(scrfile, new File
				("C:/Users/Puneet.Rawat/MyAutomationProjects/JavaSeleniumConceptsExamples/src/SeleniumSessions/screenshot.png"));

	}

}
