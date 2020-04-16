package week3.day3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSnapshot {

	public static void main(String[] args) throws IOException {
		
//		Launch the Browser:
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//		1st Window:
		driver.get("http://leafground.com/pages/Window.html");

		driver.findElementById("home").click();
		
		System.out.println("1st Window Title: " + driver.getTitle());


//		*** Way 1 to Switch Windows ***
		
//		driver.getWindowHandles(); -- local var
//		getWindowHandles() returns LinkedHashSet 
//		1st using Set, because it will ignore duplicates
//		2nd using List, because only through List we can use the method get(index) to get the 2nd window details to switch
		Set<String> allWindows = driver.getWindowHandles();
		List<String> lst = new ArrayList<String>(allWindows);
		String secondWindow = lst.get(1);		
		
//		Switch to Window 2
		driver.switchTo().window(secondWindow);
		
//		Take Snapshot
//		driver.getScreenshotAs(OutputType.FILE); -- local variable
//		// snaps is a directory which will be created during run time. After refreshing the project should see the folder.
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/img.png"); 
		FileUtils.copyFile(src, dest);
		
//		Closing both the browsers
		driver.quit();
		

	}

}
