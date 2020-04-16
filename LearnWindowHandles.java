package week3.day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandles {

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
		
		System.out.println("2nd Window Title: " + driver.getTitle());

//		Closing both the browsers
		driver.quit();
		

//		*** To move from 2nd window to 1st window / any window to 1st window ***
		
//		String firstWindow = driver.getWindowHandle();
//		System.out.println(firstWindow);
		

	}

}
