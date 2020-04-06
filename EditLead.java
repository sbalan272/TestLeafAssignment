package week1.day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

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
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();		
		
//			5	Click crm/sfa link
		driver.findElementByLinkText("CRM/SFA").click();
				
//			6	Click Leads link
		driver.findElementByXPath("//a[contains(text(),'Leads')]").click();
		
//			7	Click Find leads
		driver.findElementByLinkText("Find Leads").click();
				
//			8	Enter first name
		driver.findElementById("ext-gen248").sendKeys("Saravanan");
		Thread.sleep(1000);
		
//			9	Click Find leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(1000);	
		
//			10	Click on first resulting lead
		driver.findElementByXPath("//table[@class='x-grid3-row-table']/tbody[1]/tr[1]/td[3]/div[1]/a[1]").click();
		
//			11	Verify title of the page
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("View Lead | opentaps CRM")) {
			System.out.println("Title is Matching");
		}else {
			System.out.println("Title is Not Matching");
		}
		
//			12	Click Edit
		driver.findElementByLinkText("Edit").click();
		
//			13	Change the company name
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("JKL");
		
//			14	Click Update
		driver.findElementByClassName("smallSubmit").click();
		
//			15	Confirm the changed name appears
		WebElement findElementById = driver.findElementById("viewLead_companyName_sp");
		String text = findElementById.getText();
		System.out.println("Updated Company Name Is : " + text);
		
		if(text.equals("JKL (10125)")) {
			System.out.println("Company Name Updated Successfully");
		}else {
			System.out.println("Company Name is Mismatching");
		}
		
//			16	Close the browser (Do not log out)
		driver.close();
		
	}

}
