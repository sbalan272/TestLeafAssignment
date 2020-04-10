package week2.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnSelectableAssignment {

	public static void main(String[] args) {


//		Launch the browser
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/selectable.html");

		
//		Scenario: select the last 4
//		Collect all the element references
		WebElement item4 = driver.findElementByXPath("//ol[@id='selectable']/li[4]");
		WebElement item5 = driver.findElementByXPath("//ol[@id='selectable']/li[5]");
		WebElement item6 = driver.findElementByXPath("//ol[@id='selectable']/li[6]");
		WebElement item7 = driver.findElementByXPath("//ol[@id='selectable']/li[7]");
		
		Actions builder = new Actions(driver);
		builder.keyDown(Keys.CONTROL).click(item4).click(item5).click(item6).click(item7).perform();

	}

}
