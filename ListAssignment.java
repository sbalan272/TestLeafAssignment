package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListAssignment {

	public static void main(String[] args) {
		
//			1) https://erail.in/trains-between-stations/mgr-chennai-ctr-MAS/ksr-bengaluru-SBC
//			2) Click on Sort on Date
//			3) Get all the Train Names
//			   Xpath: //div[@id='divTrainsList']//td[@class=''][2] 
//			   findElements -> List<WebElement>
//			4) Create another List using ArrayList (trainNames)
//			5) for each loop : List<WebElement>
//			6) You will get each WebElement : get its text 
//			7) Add the text to your created list (trainNames.add())
//			8) After the loop ends, sort it
//			9) Print it with the loop!!
		

//		Launch the Browser:
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
//		1) https://erail.in/trains-between-stations/mgr-chennai-ctr-MAS/ksr-bengaluru-SBC
		driver.get("https://erail.in/trains-between-stations/mgr-chennai-ctr-MAS/ksr-bengaluru-SBC");

		
//		2) Uncheck the checkbox "Sort on Date"
		WebElement checkboxIsSelected = driver.findElementByXPath("//input[@id='chkSelectDateOnly']");
		boolean selected = checkboxIsSelected.isSelected();
		System.out.println("Checkbox: " + selected);
		
		if (selected==true) {
			checkboxIsSelected.click();
		}
		

//		3) Get all the Train Names
		List<WebElement> getTrainNames = driver.findElementsByXPath("//div[@id='divTrainsList']//td[@class=''][2]");
		int trainCount = getTrainNames.size();
		System.out.println("Train Count: " + trainCount);
		
		for( int i = 0; i < 23; i++) {
			System.out.println(getTrainNames.get(i).getText());
		}
		System.out.println("********************************");
		

//		4) Create another List using ArrayList (trainNames)
		List<String> trainNames = new ArrayList<String>();
		trainNames.add("Amtrak 1");
		trainNames.add("Amtrak 2");
		trainNames.add("Amtrak 3");
		trainNames.add("Amtrak 2");	

//		5) for each loop : List<WebElement>
//		6) You will get each WebElement : get its text 
//		7) Add the text to your created list (trainNames.add())

		for (WebElement trainNames1 : getTrainNames) {
			trainNames.add(trainNames1.getText());
		}
		
//		8) After the loop ends, sort it
		Collections.sort(trainNames);
		
//		9) Print it with the loop!!		
		for (String finalTrainNameList : trainNames) {
			System.out.println(finalTrainNameList);
		}
		
		driver.close();
	
	}



}
