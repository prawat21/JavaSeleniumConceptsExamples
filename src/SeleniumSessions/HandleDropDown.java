package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Puneet.Rawat/Downloads/chromedriver1/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Launch Chrome Driver
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html"); // Enter URL
		// Handling dropdown
		
		Select select = new Select(driver.findElement(By.id("select-demo")));
		//select.selectByVisibleText("Tuesday");
		select.selectByIndex(4);
		String actualText = driver.findElement(By.className("selected-value")).getText();
		System.out.println(actualText);
		
		// Handle dynamic dropdown at Runtime
		
		driver.get("https://www.spicejet.com/"); // Enter URL
		driver.findElement(By.xpath("//*[@id = 'ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		
		
		
		
		
		
		
		

	}

}
