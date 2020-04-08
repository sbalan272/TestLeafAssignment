package week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnMultipleExercise2 {

	public static void main(String[] args) {
		
//		Launch the browser
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/Link.html");
	
	
//		1. Click on the last "Go to home page" link
		List<WebElement> eles = driver.findElementsByLinkText("Go to Home Page");
		System.out.println(eles.size());
		eles.get(eles.size()-1).click();

	}

}
