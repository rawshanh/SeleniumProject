package seleniumDemo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown26 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "./drivers.chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("DemoSalesManager");
		//stem.out.println();		
		driver.findElementById("password").sendKeys("crmsfa");		
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		WebElement src = driver.findElementById("createLeadForm_dataSourceId");
		Select dd = new Select(src);
		
		//WebElement src=  driver.findElementById("createLeadForm_dataSourceId");
		// Create object of Select class and pass the variable (src)
		
		//Select dd = new Select(src);
		//dd.selectByVisibleText("Employee");
		//dd.selectByValue("LEAD_PARTNER");
		//dd.selectByIndex(3);
		
		//dd.selectByVisibleText("word of Mouth");
		
		//2nd way
		dd.selectByValue("LEAD_WORDOFMOUTH");
		//3rcd way
	    //dd.selectByIndex(6);	
	}
	}
