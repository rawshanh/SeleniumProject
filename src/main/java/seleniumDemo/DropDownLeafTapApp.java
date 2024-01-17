package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownLeafTapApp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/crmsfa/control/createLeadForm");
		driver.manage().window().maximize();
		driver.getTitle();
		 System.out.println(driver.getTitle());
		    driver.findElementById("username").sendKeys("DemoCSR");
		    driver.findElementById("password").sendKeys("crmsfa");
		    driver.findElementByClassName("decorativeSubmit").click();
		    driver.findElementByLinkText("CRM/SFA").click();
		    driver.findElementByPartialLinkText("Create L").click();
		    
				//WebElement preferred = driver.findElementById("createLeadForm_currencyUomId");
		          // Select dd = new Select();
				
				//Select dd = new Select(src);
				
				
				
				//WebElement Src = driver.findElementById("createLeadForm_currencyUomId");
			//	Select dd = new Select(Src);
			
				
				
				
				
		           /* Select dropdown = new Select(preferred);
		            dropdown.selectByVisibleText("America Dollar");
		            
		            
				
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//select dd = new select();
		/*three methods in Selenium for select 
		 1.selectByVisibleText
		 2.selectByValue
		 3.selectByIndex.
		 
	//	WebElement src = driver.findElementById("createLeadForm_companyName");
		
		
	
		
		
		
		
		
		
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();
	  
	//load URL
	driver.get("http://leaftaps.com/opentaps/control/main");
	
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    System.out.println(driver.getTitle());
    driver.findElementById("username").sendKeys("DemoCSR");
    driver.findElementById("password").sendKeys("crmsfa");
    driver.findElementByClassName("decorativeSubmit").click();
    driver.findElementByLinkText("CRM/SFA").click();
    driver.findElementByPartialLinkText("Create L").click();
    
		WebElement preferred = driver.findElementById("createLeadForm_currencyUomId");
           
            Select dropdown = new Select(preferred);
            dropdown.selectByVisibleText("America Dollar");*/
            
            
			}

}
