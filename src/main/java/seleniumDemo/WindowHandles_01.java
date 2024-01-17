package seleniumDemo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles_01 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/jsref/met_win_open.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementByLinkText("Try it Yourself »").click();
		
		String FirstWindow = driver.getWindowHandle();
		System.out.println("Ist window reference = " + FirstWindow);
		
	Set<String> allWin = driver.getWindowHandles();
		
		//System.out.println(allWin);
		

	// switching 1st window to 2nd window
		
	for (String eachWin : allWin) {
		
		driver.switchTo().window(eachWin);
	}	
	// After switch to 2nd window click on "Try it" button
	
 //For click on "Try it" button, need to Switch a frame because "Try it" is design under a frame.
	
	driver.switchTo().frame("iframeResult");
	
	// Click on Try it button
	driver.findElementByXPath("//button[text()='Try it']").click();
	
	
	//switch back to primary window/First window (see above code of getWindowHandle() for FirstWindow)
	driver.switchTo().window(FirstWindow);
	
	//Get title of First window (after back to first window)
	System.out.println(driver.getTitle());
	
	//closing all the windows which open in this session/in this run
	driver.quit();
	
		
	}

}
