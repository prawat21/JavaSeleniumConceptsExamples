package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Puneet.Rawat/Downloads/chromedriver1/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Launch Chrome Driver
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.openemr.io/openemr/interface/login/login.php?site=default"); // Enter URL
		driver.findElement(By.xpath("//input[@id='authUser']")).sendKeys("admin"); //Enter UserName
		driver.findElement(By.xpath("//input[@id='clearPass']")).sendKeys("pass"); // Enter Password
		
		  Select select = new Select(driver.findElement(By.name("languageChoice"))); // Handling dropdown
		  select.selectByVisibleText("English (Indian)");
		  driver.findElement(By.xpath("//*[@type='submit']")).click();// click on login button
		  driver.switchTo().frame("logoutinnerframe"); 
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[contains(text(),'Patient/Client')]")).click(); // Navigate to Patient/Client dropdown 
		  Select select1 = new Select(driver.findElement(By.xpath("//*[contains(text(),'Patient/Client')]")));
		  select1.selectByVisibleText("Patients");
		 
		
		
		driver.quit();
	}

}
