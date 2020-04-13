package week3.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnConfirmBox {

	public static void main(String[] args) {
		
//		Launch the Browser:
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
//		1) Open the URL
		driver.get("http://www.leafground.com/pages/Alert.html");
		
//		Click Confirm Box button
		driver.findElementByXPath("//button[text()='Confirm Box']").click();
		
//		Switch to Alert
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		
//		Click on Cancel in the alert box
		alert.dismiss();
		

	}

}
