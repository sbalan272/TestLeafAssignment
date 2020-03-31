package week1.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class LoginUsingWd {

	public static void main(String[] args) {
		
		// add system property --> webdriver.chrome.driver
		// System is a Java Class
		// SetProperty is a Method Name
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		
		// Step 1:
		// Open the Chrome Browser
		// ChromeDriver is a Java Class --> Written by Selenium Team
		// Maven Dependencies > selenium-chrome-driver-3.141.59.jar > ChromeDriver.class
		
		ChromeDriver driver = new ChromeDriver();
		
		// Step 2:
		// Load the URL :: get --> get is a Method, driver is a reference variable
		// ref var.methodName
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		// Print the title
		// driver is ref variable
		// get title is a methodName
		// local variable
		String title = driver.getTitle();
		System.out.println(title);
		
		// Refresh the screen / page
		driver.navigate().refresh();
		
		
//		driver.get("https://google.co.in");
		driver.navigate().to("https://google.co.in");
		
		// Close the browser
		driver.close();
	}

}
