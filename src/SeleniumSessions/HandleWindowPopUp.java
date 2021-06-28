package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopUp {
	
	//1. Alerts----Javascript Pop Up(accet, dismiss)
	//2. FileUpload Pop up --browse/fileupload button
	//3. Browser Window PopUp-- Advertisement pop up(windowHandler API - getwindowHandles())

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:/Users/Puneet.Rawat/Downloads/chromedriver1/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Launch Chrome Driver
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html"); // Enter URL
		driver.findElement(By.xpath("//a[contains(text(),'Follow On Twitter')]")).click();

		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		String parentWindowId = it.next();
		System.out.println("Parent Window Id is: " + parentWindowId);

		String childWindowId = it.next();
		System.out.println("Child Window Id is: " + childWindowId);

		driver.switchTo().window(childWindowId);
		System.out.println("child window pop up title: " + driver.getTitle());
		driver.findElement(By.xpath("//*[contains(text(), 'Sign up for Twitter')]")).click();

		driver.close();

		driver.switchTo().window(parentWindowId);
		System.out.println("parent window pop up title: " + driver.getTitle());

		driver.quit();

	}

}
