package c_18C1_C2_TestNG_Demo;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAndAfterMethod24 {
		
	ChromeDriver driver;

		@BeforeMethod
		public void browserSetup() {

			System.out.println(" beforeMethod : " +" I am inside browserSetup");
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

			driver = new ChromeDriver(); // For Chrome
			//driver.get("http://leaftaps.com/opentaps");
			driver.manage().window().maximize();
			//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
		}

		@Test
		public void createLead() throws InterruptedException {
			// load URL
			driver.get("http://leaftaps.com/opentaps");

			// Enter Username - (Element level)
			driver.findElementById("username").sendKeys("DemoSalesManager");

			// driver.findElement(By.id("username")).sendKeys("DemoSalesManager");

			// Enter Password - (Element level)
			driver.findElementById("password").sendKeys("crmsfa");

			// Click Login Button - (Element level)
			driver.findElementByClassName("decorativeSubmit").click();

			// click crm/sfa link
			driver.findElementByLinkText("CRM/SFA").click();

			// click leads
			driver.findElementByLinkText("Leads").click();


			// click create lead link

			driver.findElementByLinkText("Create Lead").click();

			// company name
			driver.findElementById("createLeadForm_companyName").sendKeys("TCS");

			// enter firstName

			try {
				driver.findElementByCssSelector("input#createLeadForm_firstName").sendKeys("Hema");
			} catch (NoSuchElementException e) {
				System.out.println("The element not found");
			}
			Thread.sleep(2000);
			// throw new RuntimeException();

			// enter lastName
			driver.findElementByCssSelector("#createLeadForm_lastName").sendKeys("M");
			// driver.findElementById("createLeadForm_lastName").sendKeys("J");
			
			System.out.println("Test : " + "Test execution complete");
			
				// enter firstName

			try {
				driver.findElementByCssSelector("input#createLeadForm_firstName").sendKeys("Hema");
			} catch (NoSuchElementException e) {
				System.out.println("The element not found");
			}
			Thread.sleep(2000);
			// throw new RuntimeException();

			// enter lastName
			driver.findElementByCssSelector("#createLeadForm_lastName").sendKeys("M");
			// driver.findElementById("createLeadForm_lastName").sendKeys("J");
			
			System.out.println("Test : " + "Test execution complete");
		}

		@AfterMethod
		public void tearDown() {
			System.out.println("afterMethod : " + "Then close browser");
			driver.close();
			//driver.quit();    

		}

}
