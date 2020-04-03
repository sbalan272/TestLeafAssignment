package week1.day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AcmeTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
//		Step 1: Launch the URL: https://acme-test.uipath.com/account/login
		driver.get("https://acme-test.uipath.com/account/login");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
//		Step 2: Enter UserName (kumar.testleaf@gmail.com) and TAB
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
		driver.findElementById("email").sendKeys(Keys.TAB);
				
//		3. Enter Password (leaf@12)
		driver.findElementById("password").sendKeys("leaf@12");
				
//		4. Click Login
		driver.findElementById("buttonLogin").click();
		
//		5) Mouse Over on Vendors
		
//		Mouse Over Syntax:
//		================
//		WebElement ele = driver.findElementByXPath("//button[text()[normalize-space()='Vendors']]");
//		Actions builder = new Actions(driver);
//		builder.moveToElement(ele).perform();
			
		WebElement mouseOver = driver.findElementByXPath("(//button[contains(@class,'btn btn-default')])[5]");
		Actions builder = new Actions(driver);
		builder.moveToElement(mouseOver).perform();
				
//		6) Click Search Vendor
		driver.findElementByXPath("//a[@href='/vendors/search']").click();
				
//		7) Enter Vendor Name (Blue Lagoon)
		driver.findElementById("vendorName").sendKeys("Blue Lagoon");
				
//		8) Click Search
		driver.findElementById("buttonSearch").click();
				
//		9) Find the Country Name based on the Vendor
		WebElement countryName = driver.findElementByXPath("//table[@class='table']/tbody[1]/tr[2]/td[5]");
		String text = countryName.getText();
		System.out.println("Country Name: " + text);
		
//		10) Click Log Out
		driver.findElementByXPath("//a[contains(text(),'Log Out')]").click();
		
//		11) Close browser
		
		driver.close();

	}

}
