package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Puneet.Rawat/Downloads/chromedriver1/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Launch Chrome Driver
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//Thread.sleep(30);// Hard wait, if 30sec is given and page loads in 5sec, still it will be wait for 30sec 
		//dynamic wait: If page will load in 10sec then, 20sec will be ignored
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		//dynamic wait: If any element loads in 5sec rest 10sec will be ignored
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://www.ebay.com/"); // Enter URL
		//1. get the total count of links on the page
		List <WebElement> linkList = driver.findElements(By.tagName("a"));
		System.out.println(linkList.size());
		
		
		//2. get the text of each link on the page
		
		for(int i = 0; i< linkList.size();i++)
		{
			String linkText = linkList.get(i).getText();
			System.out.println(linkText);
		}
		
				
		driver.quit();

	}

}
