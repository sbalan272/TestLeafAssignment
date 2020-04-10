package week2.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnFlipKart {

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
		
//		"Electronics" tab
		WebElement elec = driver.findElementByXPath("//span[text()='Electronics']");
	
//		Mouse over to "Electronics" tab
		Actions builder = new Actions(driver);
		builder.moveToElement(elec).perform();
		
		Thread.sleep(2000);

//		Under "Electronics" tab click on "Mi" to get the MI mobiles
		driver.findElementByLinkText("Mi").click();
		
		WebElement findTitle = driver.findElementByXPath("(//h1[text()='Mi Mobiles'])[last()]");
		String text = findTitle.getText();
		System.out.println(text);
		
		if (text.equals("Mi Mobiles")) {
			System.out.println("Title Verified");
		} else {
			System.out.println("Title is not verified");
		}
			
		
//		driver.close();
		
	}

}
