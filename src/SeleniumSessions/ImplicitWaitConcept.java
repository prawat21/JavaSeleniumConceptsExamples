package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {

	public static void main(String[] args) {
		
		//It only checks the presence of element on WebPage that’s all if elements are hidden or any other condition
		// then it will not handle and it will fail your script. It is applicable for all the element after initialization
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Puneet.Rawat/Downloads/chromedriver1/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Launch Chrome Driver
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.com"); // Enter URL
		//Thread.sleep(30);// Hard wait, if 30sec is given and page loads in 5sec, still it will be wait for 30sec 
		
		//dynamic wait: If page will load in 10sec then, 20sec will be ignored
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		//dynamic wait: If any element loads in 5sec rest 10sec will be ignored
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.close();

	}

}
