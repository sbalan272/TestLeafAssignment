package week1.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExerciseOne {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// 1. Leaftaps Login --> Background color
		driver.get("http:leaftaps.com/opentaps/control/main");
		//driver.findElementByXPath("//h2[contains(text(),'Leaftaps Login')]").getCssValue("background-color") -- local var
		String color = driver.findElementByXPath("//h2[contains(text(),'Leaftaps Login')]").getCssValue("background-color");
		System.out.println("The BG Color is: " + color);
		
		// 2. Find the font size of the username
		// driver.findElementByXPath("//label[contains(text(),'Username')]").getCssValue("font-size"); -- local var
		String size = driver.findElementByXPath("//label[contains(text(),'Username')]").getCssValue("font-size");
		System.out.println("Font Size: " + size);
		
		// 3. Find the width of the login button
		// driver.findElementByClassName("decorativeSubmit").getSize().getWidth(); -- local var
		int width = driver.findElementByClassName("decorativeSubmit").getSize().getWidth();
		System.out.println("Width: " + width);
		
		// 4. Find the X position of the User Name text box
		// driver.findElementByXPath("//label[contains(text(),'Username')]"); -- local var
		WebElement elePosition = driver.findElementByXPath("//label[contains(text(),'Username')]");
		// elePosition.getLocation(); -- local var
		Point location = elePosition.getLocation();
		System.out.println("X Location: " + location.getX());
		// System.out.println(location); -- Print both X and Y
		
		driver.close();
		
	}

}
