package week1.day4;

import org.openqa.selenium.chrome.ChromeDriver;

public class ExerciseTwo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Link.html");
		
		// 1. For the Green Link, Find the Locator --> Without clicking, Find the URL
		// driver.findElementByPartialLinkText("Find where am").getAttribute("href"); -- local var
		String attribute = driver.findElementByPartialLinkText("Find where am").getAttribute("href");
		System.out.println("URL Without Clicking: " + attribute);
		
		
		// 2. Check Blue Link --> Broken or not?
		driver.findElementByXPath("//a[contains(text(),'Verify am I broken?')]").click();
		
		// 1st way: ***
		// driver.findElementByTagName("h1").isEnabled(); -- local var
		// boolean enabled = driver.findElementByTagName("h1").isEnabled();
		// System.out.println("Is 404: " + enabled);
		
		//2nd Way ***
		// driver.getTitle(); -- local variable
		String title = driver.getTitle();
		if (title.contains("404")) {
			System.out.println("Broken");
		}else {
			System.out.println("Looks Good");
		}
		
		
		driver.close();
	}

}
