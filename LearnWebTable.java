package week2.day3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) {
		
//		Launch the browser
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://erail.in/");

//		Uncheck the checkbox "Sort on Date" --> To fetch the train name without any blank rows
		WebElement unselectCheckbox = driver.findElementByXPath("//input[@id='chkSelectDateOnly']");
		boolean isChecked = unselectCheckbox.isSelected();
		System.out.println(isChecked);
		
		if(isChecked) {
			unselectCheckbox.click();
		}
		
//		Enter From and To Station
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("SBC", Keys.TAB);
		
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("MAS", Keys.TAB);

		
//		Step 1: Find the table
//		'findElement' not 'findElements'
		WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
		
		
//		Step 2: Find the rows under one particular table
		List<WebElement> allRows = table.findElements(By.tagName("tr"));
		
		
//		Step 3: Get the count of rows
//		allRows.size(); -- local var
		int rowCount = allRows.size();
		System.out.println("Total Rows Count: " + rowCount);
		
		
//		Step 4: Pick 1st row from the list
//		allRows.get(0);  (local var)
		WebElement firstRow = allRows.get(0);

		
//		Step 5: Find the columns of 1st row under one particular table
		List<WebElement> allColumns = firstRow.findElements(By.tagName("td"));
		
//		Step 6: Get the count of columns
		int columnCount = allColumns.size();
		System.out.println("Total Columns Count: " + columnCount);
		
		
//		Step 7: Pick 2nd column from the entire column lists
//		allColumns.get(1); --> here, get(1) refers to 2nd column
		WebElement secondColumn = allColumns.get(1);
		
		
//		Step 8: Read the train name
//		secondColumn.getText(); --> local var
		String trainName = secondColumn.getText();
		System.out.println("Train Name of 1st row, 2nd column: " + trainName);
		
		
//		Print All Train Names
		
		for (int i = 0; i < rowCount; i++) {
			List<WebElement> allRows1 = table.findElements(By.tagName("tr"));
			WebElement firstRow1 = allRows1.get(i);
			List<WebElement> allColumns1 = firstRow1.findElements(By.tagName("td"));
			WebElement secondColumn1 = allColumns1.get(1);
			String trainNames = secondColumn1.getText();
			System.out.println(trainNames);
		} 
		
		
		driver.close();
		
	}

}
