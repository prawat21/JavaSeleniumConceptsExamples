package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Launch Chrome Driver
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html"); // Enter URL
		driver.findElement(By.xpath("//*[@id='easycont']/div/div[2]/div[1]/div[2]/button")).click();
		Thread.sleep(3000);
		//Switch to Alert
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		String actualText = alert.getText();
		if (actualText.equals("I am an alert box!")) 
		{
			System.out.println("Test Case Pass");
		}
		else
		{
			System.out.println("Test Case fail");
		}
		alert.accept(); // click ok button
		//alert.dismiss();// click cancel button
		
		driver.quit();

	}

}
