package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Leafta {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.getTitle();
	System.out.println(driver.getTitle());
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	
	//get URL
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.findElementById("username").sendKeys("DemoSalesManager");
	
	driver.findElementById("password").sendKeys("crmsfa");
	driver.findElementByClassName("decorativeSubmit").click();
	
	driver.findElementByLinkText("CRM/SFA").click();
	driver.findElementByLinkText("Create Lead").click();
	WebElement Src = driver.findElementById("createLeadForm_dataSourceId");
		//Select dd = New Select dd = new Select(src);(Src);
		
		
		Select dd = new Select(Src);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static void Select dd = new Select(src);(WebElement src) {
		// TODO Auto-generated method stub
		
	}

}
