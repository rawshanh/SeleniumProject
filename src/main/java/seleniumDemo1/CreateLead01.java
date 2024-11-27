package seleniumDemo1;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead01 {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		/* ChromeDriver driver = new ChromeDriver();
	    driver.get("http://leaftaps.com/opentaps/control/main");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    String title = driver.getTitle();
	    System.out.println(title);
	    if(title.equals("Leaftaps - TestLeaf Automation Platform")) {
	    	System.out.println("Title is mactched");	    	
	    }
	    else {
	    	System.out.println("Title id not matched");
	    }
	
	    driver.findElement(By.cssSelector("#username")).sendKeys("DemoSalesManager");
	    driver.findElement(By.cssSelector("#password")).sendKeys("crmsfa");
	    driver.findElement(By.cssSelector(".decorativeSubmit")).click();
	    driver.findElement(By.xpath("//a[contains(text(),'C')]")).click();
	    driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
	    driver.findElement(By.cssSelector("#createLeadForm_companyName")).sendKeys("TCS");
	    driver.findElement(By.cssSelector("#createLeadForm_firstName")).sendKeys("Hema");
	    driver.findElement(By.cssSelector("#createLeadForm_lastName")).sendKeys("Ma");
	    driver.findElement(By.cssSelector("#createLeadForm_generalProfTitle")).sendKeys("Ms.");
	    driver.findElement(By.cssSelector("#createLeadForm_description")).sendKeys("TCS");
	    driver.findElement(By.cssSelector("#createLeadForm_primaryPhoneCountryCode")).clear();
	    driver.findElement(By.cssSelector("#createLeadForm_primaryPhoneCountryCode")).sendKeys("1");
	    driver.findElement(By.cssSelector("#createLeadForm_departmentName")).sendKeys("MKT");
	    driver.findElement(By.cssSelector("#createLeadForm_numberEmployees")).sendKeys("100");
	    driver.findElement(By.cssSelector("#createLeadForm_primaryWebUrl")).sendKeys("google.com");
	    driver.findElement(By.cssSelector("#createLeadForm_generalPostalCode")).sendKeys("75061");
	    driver.findElement(By.cssSelector("createLeadForm_primaryPhoneNumber")).sendKeys("12356");
	    driver.findElement(By.cssSelector("#createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");
	   //river.findElement(By.cssSelector("input[value='Create Lead']")).click();
	    
	   //river.findElement(By.cssSelector("input[value='Create Lead']")).click();
	  driver.findElement(By.cssSelector("#input[value='Create Lead']")).click();
	  		
	    
	 driver.findElement(By.cssSelector("input[value='Create Lead']")).click();
	  
   er.findElement(By.xpath("//[@id=\"ext-gen595\"])).click();
		driver.findElement(by.x
	    */
		
		ChromeDriver driver = new ChromeDriver();
		
		// maximize
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
						
		// load URL
		driver.get("http://leaftaps.com/opentaps");

		// Enter Username - (Element level)
		//driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
		//String cssValue = driver.findElementById("username").getCssValue("id");
		//System.out.println(cssValue);
		
		// Enter Password - (Element level)
		//driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");

		// Click Login Button - (Element level)
		//driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByXPath("//input[@value='Login']").click();

		// click crm/sfa link
		driver.findElementByLinkText("CRM/SFA").click();

		//click leads
		driver.findElementByLinkText("Leads").click();
		

		//click create lead link
		driver.findElementByLinkText("Create Lead").click();

		//company name
		driver.findElementById("createLeadForm_companyName").sendKeys("TCS");

		// enter firstName
		
		try {
			driver.findElementByCssSelector("input#createLeadForm_firstName").sendKeys("Hema");
		} catch (NoSuchElementException e) {
			System.out.println("The element not found");
		}
		Thread.sleep(2000);
		// throw new Exception();

		// enter lastName
		driver.findElementByCssSelector("#createLeadForm_lastName").sendKeys("Mali");
		// driver.findElementById("createLeadForm_lastName").sendKeys("J");

		// Choose source
		WebElement src = driver.findElementById("createLeadForm_dataSourceId");
		Select dd = new Select(src);
		dd.selectByVisibleText("Website");
		
		// choose ownership
		WebElement ele = driver.findElementByName("ownershipEnumId");
		Select dd2 = new Select(ele);
		dd2.selectByVisibleText("Sole Proprietorship");
		
		// Click Create lead button
		driver.findElementByXPath("//input[@name='submitButton']").click();

		//Verify title of the page
		String title = driver.getTitle();
		System.out.println(title);
		
		//using-contains()
		if(title.contains("View")) {
			System.out.println("Title matched");
		} else {
			System.out.println("Title not Matched");
		}				
		//close browser
		driver.close();
		
	    
	    
	    
	    
	}
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		