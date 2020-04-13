package week3.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSweetAlert {

	public static void main(String[] args) {
		
//		Sweet Alert (Html Alert) --> Not a Selenium Alert
		
		
//		Launch the Browser:
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
//		1) Open the URL
		driver.get("http://www.leafground.com/pages/Alert.html");
		
//		Click Sweet Alert Button
		driver.findElementByXPath("//button[text()='Sweet Alert']").click();
		
//		Switch to Alert
//		It is not a Selenium Alert -- It is basically HTML Alert.
		
//		Click on Ok in the alert box
		driver.findElementByXPath("//button[text()='OK']").click();
		

	}

}
