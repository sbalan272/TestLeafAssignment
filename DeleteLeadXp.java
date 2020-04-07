package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLeadXp {

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
		

//			8	Click on Phone
		driver.findElementByXPath("//span[text()='Phone']").click();
		
//			9	Enter phone number
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("6365442537");
		
		
//			10	Click find leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(1000);
		
//			11	Capture lead ID of First Resulting lead
		WebElement leadId = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		String text = leadId.getText();
		System.out.println("Lead Id Captured: " + text);
		
//			12	Click First Resulting lead
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
		
//			13	Click Delete
		driver.findElementByXPath("//a[text()='Delete']").click();
		
//			14	Click Find leads
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		
//			15	Enter captured lead ID
		driver.findElementByXPath("//input[@name='id']").sendKeys(text);
		
//			16	Click find leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(1000);
		
//			17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		WebElement verifyMessage = driver.findElementByXPath("//div[contains(text(),'to display')]");
		String text2 = verifyMessage.getText();
		System.out.println("Verification Message: " + text2);
		
		if(text2.equals("No records to display")) {
			System.out.println("Successful Deletion");
		}else {
			System.out.println("Not a successful deletion");
		}
		
//			18	Close the browser (Do not log out)
		driver.close();
	}

}
