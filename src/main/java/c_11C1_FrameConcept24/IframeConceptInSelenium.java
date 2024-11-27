package c_11C1_FrameConcept24;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeConceptInSelenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shabu\\OneDrive\\Documents\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();


		// way#1
		driver.get("https://jqueryui.com/droppable//selectable/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByXPath("//a[text()='Selectable']").click();


	/*	//driver.findElementByLinkText("Selectable").click(); //outside of frame 
		driver.switchTo().frame(0);
		driver.findElementByXPath("//ol[@id='selectable']/li[3]").click();
		driver.findElementByXPath("//ol[@id='selectable']/li[4]").click();
		//  driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		driver.findElementByLinkText("Demos").click(); */

		// swithcing to iframe
	/*	driver.switchTo().frame(0);     //using index number -(Note-in java index starts from Zero)
		// clicking Item 3 , 4
		driver.findElementByXPath("//ol[@id='selectable']/li[3]").click();
		driver.findElementByXPath("//ol[@id='selectable']/li[4]").click();*/

		//switch back to main HTML page
		driver.switchTo().parentFrame();
		// driver.switchTo().defaultContent();
		// driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		Thread.sleep(3000);
	/*	driver.findElementByLinkText("Demos").click(); */

		//*************************





		/*	driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit"); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		//way #1 Enter into the frame
		//driver.switchTo().frame("iframeResult");
		driver.switchTo().frame("iframeResult");

		System.out.println("successfully enter into the frame");  

	//remove/clear john from first name field
	//	driver.findElementByXPath("//input[@value='John']").clear();
		driver.findElementByXPath("//input[@value='John']").clear();
		driver.findElementByXPath("//input[@value='John']").sendKeys("rawshan"); */
		/*		// enter first name
		driver.findElementByXPath("//input[@value='John']").sendKeys("rawshan");
		drive

		//remove/clear doe from last name field
		driver.findElementByXPath("//input[@value='Doe']").clear();
		// enter last name
		driver.findElementByXPath("//input[@value='Doe']").sendKeys("ara");
		driver.findElementByXPath("//input[@value='Submit']").click(); 
		Thread.sleep(3000);
		driver.close(); */


		//**********************               
		
       //switching to frame-way-3
        // WebElement iframe = driver.findElementByClassName("demo-frame");  //select web element
       //  driver.switchTo().frame(iframe);
        //or
         // driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
      // clicking Item 3 , 4
         driver.findElementByXPath("//ol[@id='selectable']/li[3]").click();
         driver.findElementByXPath("//ol[@id='selectable']/li[4]").click();

           //switch back to main HTML page
         driver.switchTo().parentFrame();
       // driver.switchTo().defaultContent();
       // driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
         Thread.sleep(3000);
         driver.findElementByLinkText("Demos").click(); 
         //way #3
     //    WebElement iframe1 = driver.findElementByClassName("demo-frame");

		 


	}

}
