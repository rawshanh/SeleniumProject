package c_17C1_C2_Inheritance_Verifications;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class If_else_Verification_CreateLead {

	//public static void main(String[] args) {
		public static void main(String[] args) throws InterruptedException {


			//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			//WebDriverManager.firefoxdriver().setup();
			WebDriver driver = WebDriverManager.chromedriver().create();
			//ChromeDriver driver = new ChromeDriver();
			// maximize
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
							
			// load URL
			driver.get("http://leaftaps.com/opentaps");

			// Enter Username - (Element level)
			//driver.findElementById("username").sendKeys("DemoSalesManager");
		
			//using Xpath
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");;
			//driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
		
			//String cssValue = driver.findElementById("username").getCssValue("id");
			//System.out.println(cssValue);
			
			// Enter Password - (Element level)
			//driver.findElementById("password").sendKeys("crmsfa");
			driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");

			// Click Login Button - (Element level)
			//driver.findElementByClassName("decorativeSubmit").click();
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();

		// click crm/sfa link
			driver.findElement(By.linkText("CRM/SFA")).click();
			
			//Verify title of the page
					String title = driver.getTitle();
					System.out.println(title);
			if(title.equals("My Home | opentaps CRM")) {
				System.out.println("Title matched");
			}
			else {
				System.out.println("Not matched");
			}
					
			//click leads
			driver.findElement(By.linkText("Leads")).click();
			

			//click create lead link
			//driver.findElementByLinkText("Create Lead").click();
			driver.findElement(By.xpath("//a[text()='Create Lead']")).click();

			//company name
			driver.findElement(By.xpath("//input[contains(@id,'yName')]")).sendKeys("ABC");
		//	driver.findElementById("createLeadForm_companyName").sendKeys("TCS");

			// enter firstName
			
		try {
				driver.findElement(By.cssSelector("input#createLeadForm_firstName")).sendKeys("Hema");
			} catch (NoSuchElementException e) {
				System.out.println("The element not found");
			}
			Thread.sleep(2000);
			// throw new Exception();

			// enter lastName
			driver.findElement(By.cssSelector("#createLeadForm_lastName")).sendKeys("Mali");
			// driver.findElementById("createLeadForm_lastName").sendKeys("J");

			// Choose source
			WebElement src = driver.findElement(By.id("createLeadForm_dataSourceId"));
			Select dd = new Select(src);
			dd.selectByVisibleText("Website");
			
			//click Create lead btn
			driver.findElement(By.xpath("//input[@name='submitButton']")).click();
			
			// choose ownership
		/*	WebElement ele = driver.findElementByName("ownershipEnumId");
			Select dd2 = new Select(ele);
			dd2.selectByVisibleText("Sole Proprietorship");
			
			// Click Create lead button
			//driver.findElementByXPath("//input[@name='submitButton']").click();
			driver.findElementByXPath("//iput[@value='Create Lead']").click();*/

			//Verify title of the page
			String pTitle = driver.getTitle();
			System.out.println(pTitle);
			//Another way
			//System.out.println(driver.getTitle());
			
//			//using-equals()
//			
//			if(title.equals("View Lead | opentaps CRM")) {
//				System.out.println("Title is matched");
//			}else
//			{
//				System.out.println("Title is not matched");
//			}
			
			//using-contains()
			if(title.contains("opentaps1")) {
				System.out.println("pTitle Matched");
			}else {
				System.out.println("pTitle not matched");
			}
			/*if(title.contains("View")) {
				System.out.println("Title matched");
			} else {
				System.out.println("Title not Matched");
			}*/
					
			//verify firstName
			String fname = driver.findElement(By.id("viewLead_firstName_sp")).getText();
			System.out.println(fname);
			if(fname.equals("Hema")) {
				System.out.println("First name matched");
			}
			else {
				System.out.println("First name not matched");
			}
			
			//close browser
			driver.close();
			
	}

}
