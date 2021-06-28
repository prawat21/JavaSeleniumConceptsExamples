package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Puneet.Rawat/Downloads/chromedriver1/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Launch Chrome Driver
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://html.com/input-type-file/"); // Enter URL
		 // type='file' should be present for browse/Attachfile/uploadfile buttons
		driver.findElement(By.xpath("//*[@id ='fileupload']")).sendKeys("C:/Users/Puneet.Rawat/Downloads/PolicyCopy.pdf");
		driver.quit();

	}

}
