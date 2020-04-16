package week3.day3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandles3 {

	public static void main(String[] args) {
		
//		Launch the Browser:
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//		1st Window:
		driver.get("http://leafground.com/pages/Window.html");

		driver.findElementById("home").click();
		
		System.out.println("1st Window Title: " + driver.getTitle());


//		*** Way 3 to Switch to 5th Window (Suppose if we have 10 windows) ***

//		After foreach loop -- it ends with 2nd window -- Hence no need to use List for get(index)
		
		Set<String> allWindows = driver.getWindowHandles();
		
		int i = 1;
		for (String eachWind : allWindows) {
			driver.switchTo().window(eachWind);
			if(i==5) {
				break;
			}
			i++;
		}
		
		
//		Closing both the browsers
		driver.quit();
		

	}

}
