package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class IframeConcept {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.switchTo().frame("iframeResult"); //way-1 web element (id or name valu )
		
		System.out.println("Successfully enter into the frame");
		//remove/clear John from first name field
		driver.findElementByXPath("//input[@value='John']").clear();
		//enter first name [any name]
		driver.findElementByXPath("//input[@value='John']").sendKeys("Shewlee")	;
		Thread.sleep(3000);
		//remove/clear Doe from last name field
		driver.findElementByXPath("//input[@id='lname']").clear();
		//enter last name [any name]
		driver.findElementByXPath("//input[@id='lname']").sendKeys("Hassan");
		//click submit //input[@value='Submit']
		driver.findElementByXPath("//input[@value='Submit']").click();
		//Back to main/parent page
		driver.switchTo().parentFrame();
		Thread.sleep(3000);
		//driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Frame in Selenium:
1. 
package seleniumDemo;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameInSelenium {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		
		//driver.get("https://jqueryui.com/selectable/");
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//way-1 -Enter into the frame using ID or Name value
			
		driver.switchTo().frame("iframeResult");
		
		//way-2- using Index
		//driver.switchTo().frame(0);
		
		//way-3 - using WebElement concept (means any web element value like Id, Name, Class, Type etc.)
		//driver.switchTo().frame(driver.findElementByXPath("//iframe[@id='iframeResult']"));
		
		//OR (we can do it other way)
		WebElement iframe = driver.findElementByXPath("//iframe[@id='iframeResult']");
		driver.switchTo().frame(iframe);
		
		System.out.println("Successfully enter into the frame");
		
		//remove/clear John from first name field
		driver.findElementByXPath("//input[@value='John']").clear();
		
		//enter first name [any name]
		driver.findElementByXPath("//input[@value='John']").sendKeys("Tushar");
		
		//remove/clear Doe from last name field		
		Thread.sleep(3000);
		driver.findElementByXPath("//input[@id='lname']").clear();
		
		//enter last name [any name]
		driver.findElementByXPath("//input[@id='lname']").sendKeys("Hasan");
		
		//click submit
		driver.findElementByXPath("//input[@value='Submit']").click();
		
		//Back to main/parent page	
		driver.switchTo().parentFrame();
		
		Thread.sleep(3000);
		driver.close(); */
		
		//remove/clear John from first name field
		//enter first name [any name]
		//remove/clear Doe from last name field	
		//enter last name [any name]
		//Back to main/parent page
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
