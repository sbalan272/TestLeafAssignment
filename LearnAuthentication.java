package week3.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAuthentication {

	public static void main(String[] args) {
		
//		Not a Selenium Alert
//		Authentication --> Server alert (For example: Asking for credentials to login to website)
		
//		Launch the Browser:
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

//		Maximize the Browser
		driver.manage().window().maximize();
		
//		Wait for the element to appear for the max time: 30)
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
//		Syntax for URL: https://username:password@URL)
//		URL is --> driver.get("http://the-internet.herokuapp.com/basic_auth");
//		Enter the URL with both Username and Password
//		Here admin:admin@ --> Username:Password@
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");

	}

}
