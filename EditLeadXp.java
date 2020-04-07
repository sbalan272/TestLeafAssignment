package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLeadXp {

	public static void main(String[] args) throws InterruptedException {
		
//		Assignment 1:
//
//			http://leaftaps.com/opentaps/control/main
//			 
//			Edit Lead:
//			1	Launch the browser
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps/control/main");
		
//			2	Enter the username
//			3	Enter the password
//			4	Click Login
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");  // Based on Attribute
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa"); 			// Based on Attribute
		driver.findElementByXPath("//input[contains(@class,'tiveSubmit')]").click();		// Based on Partial Attribute
		
//			5	Click crm/sfa link
//			"Parent to Child"
		driver.findElementByXPath("//div[@id='label']/a").click();
				
//			6	Click Leads link
//			Based on Text
		driver.findElementByXPath("//a[text()='Leads']").click();
		
//			7	Click Find leads
//			Based on Text
		driver.findElementByXPath("//a[text()='Find Leads']").click();
						
//			8	Enter first name
//		Based on Collection / Count / Index
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Saravanan");
		
//			9	Click Find leads button
//		 	Based on Text
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(1000);	
		
//			10	Click on first resulting lead
//		(Parent to Child) -- Syntax: (parentTagNameXpath)[index]/childTagName
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
		
//			11	Verify title of the page
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("View Lead | opentaps CRM")) {
			System.out.println("Title is Matching");
		}else {
			System.out.println("Title is Not Matching");
		}
		
//			12	Click Edit
//			Based on Text
		driver.findElementByXPath("//a[text()='Edit']").click();
		
//			13	Change the company name
//			Based on Attribute
		driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").clear();
		driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").sendKeys("TEst");
		
//			14	Click Update
//			Based on Attribute
		driver.findElementByXPath("//input[@value='Update']").click();
		
//			15	Confirm the changed name appears
		WebElement companyName = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']");
		String text = companyName.getText();
		System.out.println("Updated Company Name Is : " + text);
		
		if(text.equals("TEst (10125)") ) {
			System.out.println("Company Name Updated Successfully");
		}else {
			System.out.println("Company Name is Mismatching");
		}
		
//			16	Close the browser (Do not log out)
		driver.close();
		
	}

}
