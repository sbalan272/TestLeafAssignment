package week2.day3;

import java.util.List;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		
		//Open the Chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		//1. load the URL - http://leaftaps.com/opentaps/control/main
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//2. Login as user -> DemoSalesManager & password -> crmsfa
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		//3. Click on CRM/SFA
		driver.findElementByLinkText("CRM/SFA").click();
		
		//4. Click on Create Lead
		driver.findElementByLinkText("Create Lead").click();
		
//		5. Choose the dropdown source --> using one of the text
//		Step 1: Find the dropdown --> WebElement
		WebElement dropdown2 = driver.findElementById("createLeadForm_dataSourceId");
		
//		Step 2: Convert the WebElement --> Select class object
//		Select obj = new Select(); --> creating object
		Select bb = new Select(dropdown2);
		
//		Step 3. Interact with dropdown using method
		bb.selectByVisibleText("Direct Mail");
		
//		6. choose industry dropdown --> last one index
//		Step 1: Find the dropdown --> WebElement
		WebElement dropdown3 = driver.findElementById("createLeadForm_industryEnumId");

		
//		Step 2: Convert the WebElement --> Select class object
//		Select obj = new Select(); --> creating object
		Select cc = new Select(dropdown3);

		
//		Step 3. Interact with dropdown using method
		List<WebElement> options = cc.getOptions();
		
//		Step 3.1: Find the count of the list item --> size()
		int size = options.size();
		
//		Pick the last one in the drop down
		cc.selectByIndex(size-1);
		
	}

}
