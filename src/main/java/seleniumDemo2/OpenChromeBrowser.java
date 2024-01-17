package seleniumDemo2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OpenChromeBrowser {

	public static void main(String[] args) {
		
		//Open/launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//Create object ChromeDriver class
				
		ChromeDriver driver = new ChromeDriver();
		//Maximize window
		driver.manage().window().maximize();
		
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Load/enter URL		
		
		driver.get("http://leaftaps.com/opentaps/control/main");
	
		driver.findElementById("username").sendKeys("DemoCSR");
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		
		//click Login button
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		//click CRM/SFA
		driver.findElementByLinkText("CRM/SFA").click();
		//click create account link
		
		driver.findElementByLinkText("Create Ac").click();
		
		/*WebElement Country = driver,fin
		Select dd1 = new Select(Country);
		dd1.selectByVisibleText("Thailand");*/
		
		WebElement Country = driver.findElementByClassName("tableheadtext");
		Select dd3 = new Select(Country);
		dd3.selectByVisibleText("Thailand");
		
		
		WebElement Ownership = driver.findElementByClassName("tableheadtext");
		
		Select dd9 = new Select(Ownership);
		dd9.selectByValue("OWN_PUBLIC_CORP");
		
		
		//close browser
		driver.close();
			
		
		
		
	}

}
