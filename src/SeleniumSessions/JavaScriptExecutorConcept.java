package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {

	// Creating a custom function
	public void highLighterMethod(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Puneet.Rawat/Downloads/chromedriver1/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Launch Chrome Driver
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://www.freecrm.com");
		driver.findElement(
				By.xpath("//*[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
		WebElement ele = driver.findElement(By.xpath("//*[@name='email']"));
		JavaScriptExecutorConcept hlm = new JavaScriptExecutorConcept();
		hlm.highLighterMethod(driver, ele);
		ele.sendKeys("puneetrawat852@gmail.com");

		// driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Selenium@123");
		// driver.findElement(By.xpath("//*[@class= 'ui fluid large blue submit
		// button']")).click();

	}

}
