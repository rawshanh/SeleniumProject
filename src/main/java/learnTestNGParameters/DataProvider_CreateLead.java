package learnTestNGParameters;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DataProvider_CreateLead extends ProjectSpecificWrapper{

	@Test(dataProvider = "getData")
	public void createLead(String cName, String fName, String lName) throws InterruptedException {
		
		//click leads
				driver.findElementByLinkText("Leads").click();
				

				//click create lead link
				driver.findElementByLinkText("Create Lead").click();

				//company name
				driver.findElementById("createLeadForm_companyName").sendKeys("cName");

				// enter firstName
				
				driver.findElementByCssSelector("input#createLeadForm_firstName").sendKeys("fName");
				
		

		// enter lastName
		driver.findElementById("createLeadForm_lastName").sendKeys("lName");
		// driver.findElementById("createLeadForm_lastName").sendKeys("J");
           Thread.sleep(2000);
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

		
		
	}
		
    }

	
	
	
	
	
	
	
	

