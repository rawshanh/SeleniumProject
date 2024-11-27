package c_10C_XPath_Practice24;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EditLead24 {
    @Test
    
    public void editLead24() throws InterruptedException {
	// public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		// maximize
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

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

		//click leads link
		driver.findElementByLinkText("Leads").click();

		//	Thread.sleep(2000);

		//click Find leads link
		driver.findElementByLinkText("Find Leads").click();

		//		driver.findElementByLinkText("Find Leads").click();

		//Enter first name
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Hema");

		//click Find lead button
		driver.findElementByXPath("//button[text()='Find Leads']").click();

		//ExplicitlyWait-WebDriverWait
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")));
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")));

		Thread.sleep(2000);
		//click on first resulting lead
		String LeadId = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").getText();
		System.out.println(LeadId);
		Thread.sleep(2000);

		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();

		Thread.sleep(3000);
		//Verify title of the page
		
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("View")) {
			System.out.println("Title matched");
		}else {
			System.out.println("Not Matched");
		}
		//Click Edit
		driver.findElementByXPath("//a[text()='Edit']").click();
		
		
		//Change the company name
		driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").clear();
		driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").sendKeys("Hussain");
		
		//Click Update
		driver.findElementByXPath("//input[@value='Update']").click();
		
		//Confirm the changed name appears
		String changedName = driver.findElementById("viewLead_companyName_sp").getText();
		System.out.println(changedName);
		
         if(changedName.contains("ABC")) {
        	 System.out.println("Name is matched");
         }
         else {
        	 System.out.println("Not matched");
         }
		
		/*		
		
		
				  if(changedName.contains("ABC")) {
				  System.out.println("Name is matched"); 

				  } else {
				 System.out.println("Not matched");  */

	}	

}


