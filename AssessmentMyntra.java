package week2.day5;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AssessmentMyntra {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

//			1) Open https://www.myntra.com/
//			2) Mouse over on WOMEN
//			3) Click Jackets & Coats
//			4) Find the total count of item (top)
//			5) Validate the sum of categories count matches
//			6) Check Coats
//			7) Click + More option uder BRAND
//			8) Type MANGO and click checkbox
//			9) Close the pop-up x
//			10) Confirm all the Coats are of brand MANGO
//			11) Sort by Better Discount
//			12) Find the price of first displayed item
//			13) Mouse over on size of the first item
//			14) Click on WishList Now
//			15) Close Browser
		

//			Launch the Browser:
			System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
//			1) Open https://www.myntra.com/
			driver.get("https://www.myntra.com/");
			
		
//			2) Mouse over on WOMEN
			WebElement overWomen = driver.findElementByXPath("(//a[text()='Women'])[1]");
			Actions builder = new Actions(driver);
			builder.moveToElement(overWomen).perform();
		
		
//			3) Click Jackets & Coats
			driver.findElementByXPath("//a[text()='Jackets & Coats']").click();
		
		
//			4) Find the total count of item (top)
			String itemCount = driver.findElementByClassName("title-count").getText();
			String replace = itemCount.replaceAll("\\D", "");
			int toInt = Integer.parseInt(replace);
			System.out.println("Overall Counts: " + toInt);
					
		
//			5) Validate the sum of categories count matches
			String countJacket = driver.findElementByXPath("(//span[@class='categories-num'])[1]").getText();
			String replace1 = countJacket.replaceAll("\\D", "");
			int toInt1 = Integer.parseInt(replace1);
			System.out.println("Jacket Counts: " + toInt1);
			
			String countCoat = driver.findElementByXPath("(//span[@class='categories-num'])[2]").getText();
			String replace2 = countCoat.replaceAll("\\D", "");
			int toInt2 = Integer.parseInt(replace2);
			System.out.println("Coat Counts: " + toInt2);
			
			int sum = toInt1 + toInt2;
			System.out.println("Both Jacket, Coat Counts: " + sum);
			
			if (sum==toInt) {
				System.out.println("Value Matches with Overall Count");
			} else {
				System.out.println("Value is not matching");
			}
			
						
//			6) Check Coats
			driver.findElementByXPath("//label[text()='Coats']").click();

		
//			7) Click + More option under BRAND
			WebElement findBrand = driver.findElementByXPath("//span[text()='Brand']");
			String tableText = findBrand.getText();
			System.out.println("Table Name: " + tableText);
			
			WebElement clickMore = findBrand.findElement(By.xpath("//div[@class='brand-more']"));
			clickMore.click();
			
			
//			8) Type MANGO and click checkbox
			driver.findElementByXPath("//div[@class='FilterDirectory-titleBar']/input").sendKeys("MANGO");
			driver.findElementByXPath("(//label[text()='MANGO'])[2]").click();
		
		
//			9) Close the pop-up x
			driver.findElementByXPath("//span[@class='myntraweb-sprite FilterDirectory-close sprites-remove']").click();

		
//			10) Confirm all the Coats are of brand MANGO
			List<WebElement> courtBrand = driver.findElementsByXPath("//h3[text()='MANGO']");
			int size = courtBrand.size();
			System.out.println("Brand Count: " + size);
			
			int count = 0;
			for (int i = 0; i < size; i++) {
			WebElement match = courtBrand.get(i);
			String text2 = match.getText();
			if (text2.equals("MANGO")) {
				count = count + 1;
			} 
		}
			
			if (size==count) {
				System.out.println("Brand Name is Matching");
			} else {
				System.out.println("Brand Name is not matching");
			}
			

			
//			11) Sort by Better Discount
			WebElement overSort = driver.findElementByXPath("//div[text()='Sort by : ']");
			builder.moveToElement(overSort).perform();
			
			List<WebElement> clickText = driver.findElementsByXPath("//label[@class='sort-label ']");
			clickText.get(2).click();
			Thread.sleep(3000);

			
//			12) Find the price of first displayed item
			List<WebElement> courtBrand1 = driver.findElementsByXPath("//span[@class='product-discountedPrice']");
			String pText = courtBrand1.get(0).getText();
			String pReplace = pText.replaceAll("\\D", "");
			int pInt = Integer.parseInt(pReplace);
			System.out.println("First Item Price: " + pInt);
			Thread.sleep(2000);
			
			
//			13) Mouse over on size of the first item
			WebElement overSize = driver.findElementByXPath("(//span[@class='product-discountedPrice'])[1]");
			builder.moveToElement(overSize).perform();
					
			
//			14) Click on WishList Now
			driver.findElementByXPath("(//span[text()='wishlist now'])[1]").click();
		
		
//			15) Close Browser
			driver.close();

	}

}
