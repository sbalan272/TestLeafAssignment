package week1.day2;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTapsLogin {

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
				driver.get("http://leaftaps.com/opentaps/control/main");
				
				// Step 3: Print the title
				String title = driver.getTitle();
				System.out.println(title);
				
				
				// Step 4: Enter the Username
				// local var --> driver.findElementById("username");
				
//				WebElement eleUserName = driver.findElementById("username");
//				eleUserName.sendKeys("DemoSalesManager");
				
				// or
				driver.findElementById("username").sendKeys("DemoSalesManager");
				
				
				// Step 4: Enter the password
				// local var --> driver.findElementById("password")
				
//				WebElement elePassword = driver.findElementById("password");
//				elePassword.sendKeys("crmsfa");
				
				// or
				driver.findElementById("password").sendKeys("crmsfa");
				
				
				// Step 5: Click Login button
				driver.findElementByClassName("decorativeSubmit").click();
				Thread.sleep(3000);
				
				// Click on hyperlink "CRM/SFA"
				driver.findElementByLinkText("CRM/SFA").click();
				
				Thread.sleep(3000);
				driver.findElementByLinkText("Logout").click();
				
				Thread.sleep(3000);
				driver.close();
				

	}

}
