package week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnMultiple {

	public static void main(String[] args) {
		
//		1	Launch the browser
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps/control/main");
	
//		2	Enter the username
//		3	Enter the password
//		4	Click Login
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();		
	
//		5	Click crm/sfa link
		driver.findElementByLinkText("CRM/SFA").click();
		
//		6	Click Leads link
		driver.findElementByXPath("//a[contains(text(),'Leads')]").click();
	
//		7	Click Find leads
		driver.findElementByLinkText("Find Leads").click();
		
//		8. Find all First Names
//		driver.findElementsByXPath("//label[text()='First name:']"); --> local variables
		List<WebElement> allFirstNames = driver.findElementsByXPath("//label[text()='First name:']");
		
//		2 Methods in List
//		1. to get the count : size() --> int (the count of list items)
//		2. to pick one item from the list: get(index) --> WebElement
		
		
//		Print the count of all first names
//		allFirstNames.get(0); --> local variables
		WebElement firstMatch = allFirstNames.get(0);
		System.out.println(firstMatch.getText());
		
		
		
		
		

	}

}
