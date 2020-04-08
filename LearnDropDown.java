package week2.day3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) {
		
//		Launch the browser
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/Dropdown.html");
		

//		Step 1: Find the dropdown --> WebElement
		WebElement dropdown1 = driver.findElementById("dropdown1");
		
		
//		Step 2: Convert the WebElement --> Select class object
//		Select obj = new Select(); --> creating object
		Select dd = new Select(dropdown1);

		
//		Step 3. Interact with dropdown using method
		dd.selectByVisibleText("UFT/QTP");
//		Visible Text --> use data for specific language (EN)

		
//		If you are using multilingual application, then preferred to use "value"
//		{OR} Step 3.
		dd.selectByValue("2");
		
		
//		Using Index
//		Choose any
//		{OR} Step 3.
		dd.selectByIndex(4);
		
		
//		visibleText (black color inside the option tag) --> String
//		value (Orange color --> attribute of the option tag) --> String
//		index (number starting from 0 --> count of option tags inside the Select)

		
//		I want to pick the last drop down item
//		How to find how many options are available
//		dd.getOptions(); --> local variable
		List<WebElement> options = dd.getOptions();
		
		
//		Find the count of the list item --> size()
		int size = options.size();
		
//		Pick the last one in the drop down
		dd.selectByIndex(size-1);
		
		
	}

}
