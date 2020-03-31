package week1.day2;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginGmail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
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
				
				// Both ways we can write it
				// driver.get("https://google.co.in");
				// driver.navigate().to("https://google.co.in");
				
				driver.get("https://accounts.google.com/servicelogin");
				
				// Print the title
				// driver is ref variable
				// get title is a methodName
				// local variable
				String title = driver.getTitle();
				System.out.println("Title of the screen: " + title);
				
				
				// Find the method to print the full URL
				// driver.getCurrentUrl(); --> local variable
				String currentUrl = driver.getCurrentUrl();
				System.out.println("URL Link: " + currentUrl);
			
				
				// Print the browser
				// driver.getCapabilities().getBrowserName(); --> local variable
				String browserName = driver.getCapabilities().getBrowserName();
				System.out.println("Browser Used: " + browserName);
				
				// Print the Version
				// driver.getCapabilities().getVersion(); --> local variable
				String version = driver.getCapabilities().getVersion();
				System.out.println("Chrome Version: " + version);
				
				
				// Print the Platform
				// driver.getCapabilities().getPlatform(); --> local variable
				Platform platform = driver.getCapabilities().getPlatform();
				System.out.println("Platform Used: " + platform);
				Thread.sleep(3000);
				
				
				// Refresh the screen / page
				driver.navigate().refresh();
				Thread.sleep(5000);
				
				
				// Close the browser
				driver.close();

	}

}
