package c_14C2_WindowHandles.java;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles24 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/met_win_open.asp");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//Click on- Try it Yourself
		driver.findElement(By.linkText("Try it Yourself »")).click();


		//1. getWindowHandle()-return only current/1st window reference(it is not required for switching window)
		String FirstWindow24 = driver.getWindowHandle();
		System.out.println("1st window reference = " + FirstWindow24);



		//Or Get current/first window reference
		//String CurrentWin = driver.getWindowHandle();
		//System.out.println(CurrentWin);

		//2. getWindowHandles()-returns all window reference
		Set<String> allWin24 = driver.getWindowHandles();
		System.out.println("all windon reference = " + allWin24);

		// switching 1st window to 2nd window
		for (String eachWin : allWin24) {
			//System.out.println(eachWin);
			driver.switchTo().window(eachWin);
			//get all window titles
			System.out.println(driver.getTitle());
		
			//driver.close();
		}
		// After switch to 2nd window click on "Try it" button

		//For click on "Try it" button, need to Switch a frame, because "Try it" is design under a frame.

		driver.switchTo().frame("iframeResult");
		// Click on Try it button
		driver.findElement(By.linkText(FirstWindow24));
		/*		
				// After switch to 2nd window click on "Try it" button

				//For click on "Try it" button, need to Switch a frame, because "Try it" is design under a frame.

			//	driver.switchTo().frame("iframeResult");

				// Click on Try it button
				driver.findElement(By.partialLinkText("Try it Yourself »")
				//driver.findElementByXPath("//button[text()='Try it']").click();

				//switch back to primary window/First window (see above code of getWindowHandle() for FirstWindow)
				driver.switchTo().window(FirstWindow);

				//Get title of First window (after back to first window)
				System.out.println(driver.getTitle());

				//closing all the windows which open in this session/in this run
				driver.quit(); */


	}

}
