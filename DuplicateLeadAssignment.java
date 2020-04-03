package week1.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLeadAssignment {

	public static void main(String[] args) throws InterruptedException {
		
//		Assignment:
			
//		http://leaftaps.com/opentaps/control/main
//			 
//			Duplicate Lead:
//			1	Launch the browser
//			2	Enter the username
//			3	Enter the password
//			4	Click Login
//			5	Click crm/sfa link
//			6	Click Leads link
//			7	Click Find leads
//			8	Click on Email
//			9	Enter Email
//			10	Click find leads button
//			11	Capture name of First Resulting lead
//			12	Click First Resulting lead
//			13	Click Duplicate Lead
//			14	Verify the title as 'Duplicate Lead'
//			15	Click Create Lead
//			16	Confirm the duplicated lead name is same as captured name
//			17	Close the browser (Do not log out)

		
//		1	Launch the browser
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		2	Enter the username
//		3	Enter the password
//		4	Click Login
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
//		5	Click crm/sfa link
		driver.findElementByLinkText("CRM/SFA").click();
		Thread.sleep(3000);
		
//		6	Click Leads link
//		driver.findElementByLinkText("Leads").click();
		driver.findElementByXPath("//a[contains(text(),'Leads')]").click();
		
//		7	Click Find leads
		driver.findElementByLinkText("Find Leads").click();
		Thread.sleep(3000);
		
//		8	Click on Email
		driver.findElementByXPath("//span[contains(text(),'Email')]").click();
		
//		9	Enter Email
		driver.findElementByName("emailAddress").sendKeys("saravana272@gmail.com");
		
//		10	Click find leads button
		// Absolute Xpath
		driver.findElementByXPath("/html[1]/body[1]/div[6]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/em[1]/button[1]").click();
		Thread.sleep(2000);
		
		
//		11	Capture name of First Resulting lead
		WebElement findTable = driver.findElementByXPath("/html[1]/body[1]/div[6]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]");
		String text = findTable.getText();
		System.out.println("Table Name: " + text);
		
		WebElement findElement = findTable.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody[1]/tr[1]/td[16]/div[1]/a[1]"));
		String text2 = findElement.getText();
		System.out.println("Email ID: " + text2);
		
//		WebElement findElement2 = findElement.findElement(By.xpath("//table[@class='x-grid3-row-table']/following::table/tbody[1]/tr[1]/td[3]/div[1]/a[1]"));
//		String text3 = findElement2.getText();
//		System.out.println("FirstName: " + text3);
		
		WebElement firstName = driver.findElementByXPath("//table[@class='x-grid3-row-table']/tbody[1]/tr[1]/td[3]/div[1]/a[1]");
		String text4 = firstName.getText();
		System.out.println("FirstName: " + text4);
		Thread.sleep(2000);
		
//		12	Click First Resulting lead
		driver.findElementByXPath("//table[@class='x-grid3-row-table']/tbody[1]/tr[1]/td[3]/div[1]/a[1]").click();
		Thread.sleep(2000);
		
		
//		13	Click Duplicate Lead
		driver.findElementByLinkText("Duplicate Lead").click();
		
				
//		14	Verify the title as 'Duplicate Lead'
		WebElement getTitle = driver.findElementByXPath("//div[@class='x-panel-header sectionHeaderTitle']");
		String text3 = getTitle.getText();
		System.out.println("Page Title: " + text3);
		
		if(text3.equals("Duplicate Lead")) {
			System.out.println("Title Matched");
		}else {
			System.out.println("Title Not Matching");
		}
		
//		15	Click Create Lead
		driver.findElementByXPath("//input[@name='submitButton']").click();
		
//		16	Confirm the duplicated lead name is same as captured name
		WebElement findDupName = driver.findElementById("viewLead_firstName_sp");
		String text5 = findDupName.getText();
		System.out.println("Duplicate Name: " + text5);
			
		if(text4.equals(text5)) {
			System.out.println("Duplicate and Captured Name are Same");
		}else {
			System.out.println("Duplicate and Captured Name are not Same");
		}
		
//		17	Close the browser (Do not log out)
		driver.close();
		
		
		
		
	}

}
