package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Puneet.Rawat/Downloads/chromedriver1/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Launch Chrome Driver
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		//1. isDisplayed--return true if element is displayed otherwise false 
		boolean b1 = driver.findElement(By.xpath("//*[@id = 'SubmitCreate']")).isDisplayed();
		System.out.println(b1); // true
		
		//2. isEnabled--
		boolean b2 = driver.findElement(By.xpath("//*[@id = 'SubmitCreate']")).isEnabled();
		System.out.println(b2); // true
		
		//3. isSelected-- only applicable for Radio Button, checkbox and dropdown
		
		driver.findElement(By.xpath("//*[@class='login']")).click();
		driver.findElement(By.xpath("//*[@id= 'email']")).sendKeys("puneetrawat852@gmail.com");
		driver.findElement(By.xpath("//*[@id= 'passwd']")).sendKeys("Selenium12345");
		driver.findElement(By.xpath("//*[@id= 'SubmitLogin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'My personal information')]")).click();
		
		driver.findElement(By.xpath("//*[@id='newsletter']")).click();//click checkbox
		boolean b3 = driver.findElement(By.xpath("//*[@id='newsletter']")).isSelected();
		System.out.println(b3);
		
		// de-select the checkbox
		driver.findElement(By.xpath("//*[@id='newsletter']")).click();//click checkbox
		boolean b4 = driver.findElement(By.xpath("//*[@id='newsletter']")).isSelected();
		System.out.println(b4);
		
		driver.close();

	}

}
