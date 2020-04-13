package week3.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) {
		
//		Launch the Browser:
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
//		1) Open the URL
		driver.get("http://www.leafground.com/pages/Alert.html");
		
//		Click alert box 
		driver.findElementByXPath("//button[text()='Alert Box']").click();
		
		
//		Switch to Alert
//		driver.switchTo().alert(); -- local variable
//		Alert is an Interface implemented by "RemoteAlert" class
		Alert alert = driver.switchTo().alert();
		
//		Implemented by which Class --> RemoteAlert
		String text = alert.getText();
		System.out.println(text);
		
//		Close the alert
		alert.accept();
		
//		
		
		
	}

}
