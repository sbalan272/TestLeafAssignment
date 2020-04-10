package week2.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDroppable {

	public static void main(String[] args) {
		
//		Launch the browser
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://leafground.com/");
		
//		Click on Droppable
		driver.findElementByXPath("//h5[text()='Droppable']/following-sibling::img").click();
		
//		Collect the elements references
		WebElement draggable = driver.findElementById("draggable");
		WebElement droppable = driver.findElementById("droppable");
		
//		Actions is the class --> to interact only with Keyboard and Mouse
		
//		Actions builder = new Actions() --> ctrl + space
//		Green circle with Strike (Deprecated) --> Do not use it. So here, "driver" is valid
//		perform() -- it is mandatory --> to execute the Actions
		
//		builder --> building a collection of action into single action
		Actions builder = new Actions(driver);
		builder.dragAndDrop(draggable, droppable).perform();

	}

}
