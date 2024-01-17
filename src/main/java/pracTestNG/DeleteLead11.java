package pracTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead11 {

	public static void main(String[] args) throws InterruptedException {
		
		

		/* System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe"); 
		ChromeDriver driver = new ChromeDriver();

		//maximize
		driver.manage().window().maximize();
		
		//load URL
		driver.get("http://leaftaps.com/opentaps");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Enter Username - (Element level)
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		//Enter Password - (Element level)
		driver.findElementById("password").sendKeys("crmsfa");	*/
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
	/*	/ Click Login Button - (Element level)
		driver.findElementByClassName("decorativeSubmit").click();
		
		// click crm.sfa link
		Thread.sleep(2000);
		driver.findElementByLinkText("CRM/SFA").click();
		
		//click Leads
		driver.findElementByLinkText("Leads").click();
		
		//click Find lead link
		driver.findElementByLinkText("Find Leads").click();
		
		//click on phone
		driver.findElementByXPath("//span[text()='Phone']").click(); */
		
		driver.findElementByClassName("decorativeSubmit").click();
		Thread.sleep(2000);
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[text()='Phone']").click();
		
		/* 
		 
	//click on email
	//driver.findElementByXPath("//span[text()='Email']").click();
	
	//enter phone number(areaCode)
	driver.findElementByXPath("//input[@name='phoneAreaCode']").sendKeys("682");
	
	//enter phone number
	driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("2084048");
	
	//enter email address
	//driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("abc@abc.com");
	
	//click Find leads button
	driver.findElementByXPath("//button[text()='Find Leads']").click();
	
	Thread.sleep(3000);
		 */
		
	//	driver.findElementByXPath("//span[text()='Email']").click();
		
	//driver.findElementByXPath("//input[@name='phoneAreaCode']").sendKeys("682");
		driver.findElementByXPath("//input[@name='phoneAreaCode']").sendKeys("682");
		
		//driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("2084048");
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("2084048");
		//driver.findElementByXPath("//span[text()='Email']")	.click();
	//driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("abc@abc.com");
		//driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("abc@abc.com");
		
	//driver.findElementByXPath("//button[text()='Find Leads']").click();
		driver.findElementByXPath("//button[text()='Find Leads']").click();
	Thread.sleep(3000);
	
	//Capture lead ID of First Resulting lead
	//String leadId = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").getText();
	//System.out.println(leadId);
	
	String leadId = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").getText();
	
	System.out.println(leadId);
	//driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
	
	driver.findElementByLinkText("//a[text()='Delete']").click();
	

	
	//Click First Resulting lead
	driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
	
	//Click Delete
	driver.findElementByXPath("//a[text()='Delete']").click();
	
	
	//Click Find leads
	driver.findElementByXPath("//a[text()='Find Leads']").click();
	
	//Enter captured lead ID
	driver.findElementByXPath("//input[@name='id']").sendKeys("10056"); */
	
	
	//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a
		
	}

}
