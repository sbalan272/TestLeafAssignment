package week3.day3;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSetRail {

	public static void main(String[] args) throws InterruptedException {

		
//		*** Verify there is no duplicate using SET interface ***
		
//		Launch the Browser:
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//		Load the URL
		driver.get("https://erail.in/trains-between-stations/mgr-chennai-ctr-MAS/ksr-bengaluru-SBC");
		
//		Uncheck the checkbox "Sort on Date"
		driver.findElementById("chkSelectDateOnly").click();
		Thread.sleep(3000);
		
		List<WebElement> allTrains = driver.findElementsByXPath("//div[@id='divTrainsList']//td[@class=''][1]");
		
		Set<String> trainNumbers = new HashSet<String>();
		
		for(WebElement eachTrain : allTrains) {
			trainNumbers.add(eachTrain.getText()); // all Train Numbers will be added to Set
		}
		System.out.println("Train Numbers: " + trainNumbers);
		
		
//		How to confirm there is no duplicate
		if (trainNumbers.size()==allTrains.size()) {
			System.out.println("No Duplicate");
		}
		
		
		
		
		
		
		
	}

}
