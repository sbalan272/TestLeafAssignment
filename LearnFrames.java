package week3.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {

	public static void main(String[] args) {
		
//		Launch the Browser:
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
//		1) Open the URL
		driver.get("https://dev49243.service-now.com/");
		
//		Switch to the frame -- Find it by inspecting -- <iframe> or <frame>
//		To switch to the frame there are 3 methods -- .frame (ctrl + space)
//		driver.switchTo().frame(nameOrId) --> Picked this because using the ID
		driver.switchTo().frame("gsft_main");
		
//		Enter the User Name
		driver.findElementById("user_name").sendKeys("admin");
		
//		Go out of the Frame
//		driver.switchTo().defaultContent(); -- take you out of the frame. Because title is out of the frame.
		driver.switchTo().defaultContent();
		
//		To move back from Frame 1 to Frame 0
		driver.switchTo().parentFrame();
		
//		Get the text of the tab
		String text = driver.findElementByXPath("//span[text()='Service Management']").getText();
		System.out.println("Page Tab: " + text);
		
		
		
		

	}

}
