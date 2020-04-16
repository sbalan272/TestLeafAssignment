package week3.day3;

import java.util.List;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentWindowHandleAlert {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
//		*** Create Lead *** (Assignment for Window Handle + Alert)
		
//		1. load the URL - http://leaftaps.com/opentaps/control/main
		driver.get("http://leaftaps.com/opentaps/control/main");

		
//		2. Login as user -> DemoSalesManager & password -> crmsfa
		driver.findElementById("username").sendKeys("DemoSalesManager",Keys.TAB);
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();		

		
//		3. Click on CRM/SFA
		driver.findElementByLinkText("CRM/SFA").click();
		
		
//		4. Click on Leads
		driver.findElementByXPath("//a[text()='Leads']").click();
		
		
//		5. Click on Merge Leads
		driver.findElementByXPath("//a[text()='Merge Leads']").click();
		
		
//		6. Click on "From Lead" icon
		driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();

		
//		7. New Window will open. Use Window Handle to move to 2nd Window
		Set<String> objSet = driver.getWindowHandles();
		List<String> objList = new ArrayList<String>(objSet);
		String firstWindow = objList.get(0);
		String secondWindow = objList.get(1);
		
		driver.switchTo().window(secondWindow);
		
	
//		8. 2nd Window -- Click on FirstName and send the values
		driver.findElementByXPath("(//div[@class='x-form-element']/input)[2]").sendKeys("Natarajan");
		
		
//		9. 2nd Window -- Click on Find Leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		
		
//		10. 2nd Window -- Find and Click the 1st Lead
		WebElement findTable = driver.findElementByXPath("//span[text()='Lead List']");
		String tableText = findTable.getText();
		System.out.println("Table Name 1: " + tableText);
		
		WebElement fromFirstLead = findTable.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		String text = fromFirstLead.getText();
		System.out.println("First Lead ID: " + text);
		
		fromFirstLead.click();
		
		
//		11. Navigate back to 1st Window (Parent)
		driver.switchTo().window(firstWindow);
		
		
//		12. Click on "To Lead" icon
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		
		
//		13. Move to 2nd Window
		Set<String> objSet1 = driver.getWindowHandles();
		List<String> objList1 = new ArrayList<String>(objSet1);
		String firstWindow1 = objList1.get(0);
		String secondWindow1 = objList1.get(1);
		
		driver.switchTo().window(secondWindow1);
		
		
//		14. 2nd Window -- Click on FirstName and send the values
		driver.findElementByXPath("(//div[@class='x-form-element']/input)[2]").sendKeys("Vasanthi");


//		15. 2nd Window -- Click on Find Leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		
		
//		16. 2nd Window -- Find and Click the 1st Lead
		WebElement findTable1 = driver.findElementByXPath("//span[text()='Lead List']");
		String tableText1 = findTable1.getText();
		System.out.println("Table Name 2: " + tableText1);
		
		WebElement findFirstName = findTable1.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]"));
		String text5 = findFirstName.getText();
		System.out.println("FirstName from Table: " + text5);
		
		
		WebElement toFirstLead = findTable1.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		String text1 = toFirstLead.getText();
		System.out.println("To Lead ID: " + text1);
		
		toFirstLead.click();
		
		
//		17. Navigate back to 1st Window (Parent)
		driver.switchTo().window(firstWindow1);
		
		
//		18. Click on Merge
		driver.findElementByXPath("//a[text()='Merge']").click();
		
		
//		19. 
		Alert alert = driver.switchTo().alert();
		String text2 = alert.getText();
		System.out.println("Alert Text: " + text2);

		
//		Clicking on OK button to close the alert
		alert.accept();
		Thread.sleep(5000);
		
		
//		20. Get the page Title
		String title = driver.getTitle();
		System.out.println("After Merge Page Title: " + title);
		
		
//		21. Compare the "FirstName" with "To Lead" First Name and verify it matches
		WebElement verifyFirstName = driver.findElementById("viewLead_firstName_sp");
		String text3 = verifyFirstName.getText();
		System.out.println("First Name After Merge: " + text3);
		
		if(text3.equals(text5)) {
			System.out.println("Merge is successful");
		} else {
			System.out.println("Merge is not success");
		}
		
		
//		22. Click on Find Leads
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		
		
//		23. Click on Lead ID and enter the "From Lead ID"
		driver.findElementByXPath("(//label[text()='Lead ID:']/following::input)[1]").sendKeys(text);
		
		
//		24. Click on Find Leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		
		
//		25. Verify the message
		WebElement findTable2 = driver.findElementByXPath("//span[text()='Lead List']");
		String tableText2 = findTable2.getText();
		System.out.println("Table Name 3: " + tableText2);
		
		WebElement verifyMessage = findTable2.findElement(By.xpath("//div[text()='No records to display']"));
		String text4 = verifyMessage.getText();
		System.out.println("Message: " + text4);
		
		
		if (text4.equals("No records to display")) {
			System.out.println("Message is Verified Successfully");
		} else {
			System.out.println("Message is not matching");
		}
		
		
//		26. Take a Snapshot
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/img1.png");
		FileUtils.copyFile(src, dest);
		System.out.println("Snapshot is success");
		
		
//		27. Close the browser
		driver.close();
		
	
	}

}
