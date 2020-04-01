package week1.day2;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.html5.LocalStorage;

public class LeafAssignment {
	
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
		
		//5. Enter mandatory fields - Company Name, First Name & Last Name
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		driver.findElementById("createLeadForm_firstName").sendKeys("Saravanan");
		driver.findElementById("createLeadForm_lastName").sendKeys("Balan");
		
		//6. Click on Create Lead (button)
		driver.findElementByClassName("smallSubmit").click();
				
		//7. Verify lead has been created using title
		String titleName = driver.getTitle();
		System.out.println("TitleName: " + titleName);
		Thread.sleep(3000);
		
		//8. Close browser Assignment
		driver.close();
		

	}

}
