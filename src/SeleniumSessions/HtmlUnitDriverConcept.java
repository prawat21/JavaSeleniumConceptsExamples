package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Puneet.Rawat/Downloads/chromedriver1/chromedriver.exe");
		//WebDriver driver = new ChromeDriver(); // Launch Chrome Driver
		
		// HtmlUnitDriver is not available in selenium 3.xx
		// HtmlUnitDriver--- To use this concept, we have to download HtmlUnitDriver JAR file.
		// Advantages--1. Testing is done behind the scene--no browser launch
		//2. It's very fast-- Execution is fast---very fast--performance of the script
		//3. Not suitable for actions classes--user actions-- mousemovement--doubleclick--drag and driver
		//4. Ghost Driver-- Headless browser:- HtmlUnitDriver--Java and PhantomJS--JavaScript
		WebDriver driver = new HtmlUnitDriver();
	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://www.freecrm.com");
		System.out.println("Before Login Title is:: " + driver.getTitle());
		
		/*
		 * // Register Page driver.findElement (By.
		 * xpath("//a[@class= 'btn btn-sm btn-white btn-icon btn-icon-left btn-shadow btn-border btn-rect offset-sm-top-60"
		 * + " offset-top-30']")).click();
		 * driver.findElement(By.xpath("//*[@name='email']")).sendKeys(
		 * "puneetrawat852@gmail.com");
		 * driver.findElement(By.xpath("//*[@name='phone']")).sendKeys("9286986242");
		 * driver.findElement(By.xpath("//*[@name='terms']")).click();
		 * driver.findElement(By.xpath("//*[@class='recaptcha-checkbox-border']")).click
		 * (); driver.findElement(By.xpath("//*[@name='action']")).click();
		 */
		driver.findElement(By.xpath
				("//*[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys("puneetrawat852@gmail.com");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//*[@class= 'ui fluid large blue submit button']")).click();

		System.out.println("After Login Title is:: " + driver.getTitle());

		driver.close();

	}

}
