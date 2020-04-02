package week1.day3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StringExercise {

	public static void main(String[] args) {
		
		
		/* Access http:leaftaps.com/opentaps/control/main
		 * Enter Username and password and click login
		 * Element - h2 --> Welcome
		   					Demo Sales Manager
		 * Print only "Demo Sales Manager" using String
		 */
		
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http:leaftaps.com/opentaps/control/main");
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		
		// driver.findElementByTagName("h2"); -- local variable
		// findElementByTagName.getText(); -- local variable
		WebElement findElementByTagName = driver.findElementByTagName("h2");
		String text = findElementByTagName.getText();
		System.out.println(text.substring(7, 26));
		
		//driver.close();

	}

}
