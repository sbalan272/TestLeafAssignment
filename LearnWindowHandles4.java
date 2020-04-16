package week3.day3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandles4 {

	public static void main(String[] args) {
		
//		Launch the Browser:
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//		1st Window:
		driver.get("http://leafground.com/pages/Window.html");

		driver.findElementById("home").click();
		
		

//		*** Way 4 to Switch to 2nd Window ***
//		Iterator -- is used to traverse a collection object elements one by one.
//		Iterator is Collections Super Interface
		
		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> iterator = allWindows.iterator();
		iterator.next();
		System.out.println("1st Window Title: " + driver.getTitle());
		iterator.next();
		System.out.println("2nd Window Title: " + driver.getTitle());

		
		
//		Closing both the browsers
		driver.quit();
		

	}

}
