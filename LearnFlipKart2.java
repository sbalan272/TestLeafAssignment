package week2.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnFlipKart2 {

	public static void main(String[] args) throws InterruptedException {


//		Launch the browser
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");

//		***Handle the pop up***
		driver.findElementByXPath("//button[text()='✕']").click();
		Thread.sleep(1000);
		
//		"TVs & Appliances" tab
		WebElement tv = driver.findElementByXPath("//span[text()='TVs & Appliances']");
	
//		Mouse over to "TVs & Appliances" tab
		Actions builder = new Actions(driver);
		builder.moveToElement(tv).perform();
		
		Thread.sleep(2000);

//		Under "TVs & Appliances" tab -- click on "LG" to get the LG mobiles
		driver.findElementByXPath("(//a[text()='LG'])[2]").click();

		
//		Get the first search link text
		WebElement firstLink = driver.findElementByXPath("(//div[contains(text(),'Split Dual Inverter')])[1]");
		String text = firstLink.getText();
		System.out.println(text);


	}

}
