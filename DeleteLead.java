package week1.day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
//		Assignment 2:
//
//			http://leaftaps.com/opentaps/control/main
//			 
//			Delete Lead:
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
		Thread.sleep(2000);
		
//			8	Click on Phone
		driver.findElementByLinkText("Phone").click();
		
//			9	Enter phone number
		driver.findElementByName("phoneNumber").sendKeys("6365442537");
		Thread.sleep(2000);
		
//			10	Click find leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(1000);


//			11	Capture lead ID of First Resulting lead
		WebElement findLeadId = driver.findElementByXPath("//span[text()='Lead List']");
		String text = findLeadId.getText();
		System.out.println("Lead ID: " + text);
				
		WebElement captureLeadId = findLeadId.findElement(By.xpath("(//a[@class='linktext'])[4]"));
		String text2 = captureLeadId.getText();
		System.out.println("Lead ID Captured: " + text2);
		
//			12	Click First Resulting lead
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		
//			13	Click Delete
		driver.findElementByLinkText("Delete").click();
		Thread.sleep(2000);
		
//			14	Click Find leads
		driver.findElementByLinkText("Find Leads").click();
		Thread.sleep(2000);
		
//			15	Enter captured lead ID
		driver.findElementById("ext-gen246").sendKeys(text2);
		Thread.sleep(2000);
		
//			16	Click find leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(1000);
		
//			17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		WebElement findLeadId1 = driver.findElementByXPath("//span[text()='Lead List']");
		String text3 = findLeadId1.getText();
		System.out.println("Lead ID: " + text3);
		Thread.sleep(3000);
		
		WebElement findElement = findLeadId1.findElement(By.xpath("//div[text()='No records to display']"));
		String text4 = findElement.getText();
		System.out.println("Message: " + text4);

		if(text4.equals("No records to display")) {
			System.out.println("Successful Deletion");
		}else {
			System.out.println("Not a successful deletion");
		}
				
				
//			18	Close the browser (Do not log out)
		driver.close();
		
	}

}
