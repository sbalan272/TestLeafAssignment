package week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LeafGroundMultipleAssignment {

	public static void main(String[] args) {
		
//		Launch the browser
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/Link.html");

//		Click on the last "Go to home page" link
		List<WebElement> eles = driver.findElementsByLinkText("Go to Home Page");
		eles.get(eles.size()-1).click();

//		Click on Image
		driver.findElementByXPath("//h5[text()='Image']/following-sibling::img").click();
		
//		1.Go to images, Find out how many images are available
		List<WebElement> imageCount = driver.findElementsByTagName("img");
		System.out.println("Total Images: " + imageCount.size());
		
		
//		2.Click the last image by using the key board buttons
//		imageCount.size()-1; -- local variable
//		Size -- int is return type
//		imageCount.get(count); -- local variable
		int count = imageCount.size()-1;
		WebElement clickImage = imageCount.get(count);
		System.out.println(clickImage.getAttribute("src"));
		Actions builder = new Actions(driver);
		builder.moveToElement(clickImage).click().perform();


	
//		3.Go to radio buttons, find how many radio buttons
		driver.navigate().to("http://leafground.com/home.html");
		driver.findElementByXPath("//h5[text()='Radio Button']/following-sibling::img").click();
		List<WebElement> buttonCount = driver.findElementsByTagName("input");
		System.out.println("Total Radio Buttons: " + buttonCount.size());
		
		
//		4.Go to the check box, check all the check box(Mark/select all the check box ) using findElement
		driver.navigate().to("http://leafground.com/home.html");
		driver.findElementByXPath("//h5[text()='Checkbox']/following-sibling::img").click();
		List<WebElement> els = driver.findElementsByTagName("input");
		for ( WebElement el : els ) {
		    if ( !el.isSelected() ) {
		        el.click();
		    }
		}
		
		
	}

}
