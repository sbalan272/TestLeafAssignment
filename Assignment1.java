package week3.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		
//		Launch the Browser:
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
//		Open the URL
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		
		
//		Switch to the frame
		driver.switchTo().frame("iframeResult");
		
		
//		click "Try it"
		driver.findElementByXPath("//button[text()='Try it']").click();
		
		
//		Click Ok in the Alert Box
		Alert alert = driver.switchTo().alert();
		
		String text = alert.getText();
		System.out.println("Alert Box Text: " + text);
		
//		Click OK button in the Alert box
		alert.accept();

	}

}
