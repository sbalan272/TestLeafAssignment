package week2.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnSelectable2 {

	public static void main(String[] args) {


//		Launch the browser
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/selectable.html");

		
//		Scenario: click on item1 + hold + release on item4 on particular webelement
//		Collect all the element references
		WebElement item1 = driver.findElementByXPath("//ol[@id='selectable']/li[1]");
		WebElement item4 = driver.findElementByXPath("//ol[@id='selectable']/li[4]");
		
		Actions builder = new Actions(driver);
		builder.clickAndHold(item1).release(item4).perform();

	}

}
