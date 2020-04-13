package week3.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnPromptBox {

	public static void main(String[] args) {
		
//		Launch the Browser:
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
//		1) Open the URL
		driver.get("http://www.leafground.com/pages/Alert.html");
		
//		Click Prompt Box button
		driver.findElementByXPath("//button[text()='Prompt Box']").click();
		
//		Switch to Alert
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("KForce");
		
//		Click on Ok in the alert box
		alert.accept();
		

	}

}
