package week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnMultipleExercise {

	public static void main(String[] args) {
		
//		Launch the browser
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/Link.html");
	
	
//		1. How many hyper links are available?
//		Links have something in common "tagName"
		List<WebElement> allLinks = driver.findElementsByTagName("a");
		System.out.println("Hyperlink Size: " + allLinks.size());
		
//		2. Click on the first link
//		get(0) --> points to the first match
		allLinks.get(0).click();
		
		driver.close();

	}

}
