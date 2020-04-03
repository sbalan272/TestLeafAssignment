package week1.day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusBooking {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
//		1. Launch URL: https://www.redbus.in/
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
//			2. Enter 'from' place as 'Chennai'
		driver.findElementById("src").sendKeys("Chennai");
		Thread.sleep(5000);
		driver.findElementById("src").sendKeys(Keys.TAB);
		
		
//			3. Enter 'to' place as 'Bangalore'
		driver.findElementById("dest").sendKeys("Bangalore");
		Thread.sleep(1000);
				
//			4. Pick onward date as today
		driver.findElementByXPath("//label[text()='Onward Date']").click();
		driver.findElementByXPath("(//td[text()='30'])[2]").click();
		
//			5. Click on 'Search Buses'
		driver.findElementById("search_btn").click();
		
//			6. Check 'After 6 pm' under 'DEPARTURE TIME'
		driver.findElementByXPath("(//label[text()='After 6 pm'])[1]").click();
				
//			7. Check 'Sleeper' under 'BUS TYPE'
		driver.findElementByXPath("//label[text()='SLEEPER']").click();
				
//			8. Click on 'Seats Available' to sort
		driver.findElementByXPath("(//div[text()='View Seats'])[1]").click();
		
		
	}

}
