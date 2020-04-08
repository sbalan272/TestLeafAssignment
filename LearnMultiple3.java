package week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnMultiple3 {

	public static void main(String[] args) {
		
//		Launch the browser
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/Link.html");
	
	
//		1. In "Go to Home Page (Interact with same link name)" --> get the text value of "Interact with same link name"
//		WebElement lastText = driver.findElementByXPath("//a[text()='Go to Home Page'][last()]/following-sibling::label");
//		{OR}
		WebElement lastText = driver.findElementByXPath("//a[text()='Go to Home Page']/following-sibling::label");
		System.out.println(lastText.getText());
		
		driver.close();
		
	}

}
