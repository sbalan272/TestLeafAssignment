package week3.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnNotification {

	public static void main(String[] args) {
		
		
//		Notification is not a Selenium Alert
//		Chrome Options --> https://peter.sh/experiments/chromium-command-line-switches/ -- Get all the Syntax from this website
		
//		Launch the Browser:
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		
//		ChromeOptions
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver();
		
//		Maximize the Browser
		driver.manage().window().maximize();
		
//		Wait for the element to appear for the max time: 30)
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
//		Load the URL:
		driver.get("https://www.redbus.in/");
		

		
		

	}

}
