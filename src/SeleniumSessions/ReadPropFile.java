package SeleniumSessions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadPropFile {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("./src/SeleniumSessions/config.properties");
		prop.load(ip); // Load all properties which are in config file
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		System.out.println(prop.getProperty("Name"));
		String url = prop.getProperty("URL");
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:/Users/Puneet.Rawat/Downloads/chromedriver1/chromedriver.exe");
			driver = new ChromeDriver(); // Launch Chrome Driver
		}
		else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.get(url);
		driver.findElement(By.xpath(prop.getProperty("firstname_xpath"))).sendKeys(prop.getProperty("firstName"));
		driver.findElement(By.xpath(prop.getProperty("lastname_xpath"))).sendKeys(prop.getProperty("lastName"));
		driver.findElement(By.xpath(prop.getProperty("City_xpath"))).sendKeys(prop.getProperty("city"));
		
		
	}

}
