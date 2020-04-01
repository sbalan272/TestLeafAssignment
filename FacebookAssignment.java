package week1.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElementById("email").sendKeys("XXX@gmail.com");
		driver.findElementById("pass").sendKeys("YYY");
		driver.findElementById("loginbutton").click();
		Thread.sleep(3000);
		driver.findElementByLinkText("Account Settings").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//span[contains(text(),'Log Out')]").click();
		
		
	}

}
