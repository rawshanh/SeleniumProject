package tc_ConnectInheritanceConcept;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import wrapper24.ProjectSpecificWrapper24;

public class CreateLeadWrap24 extends ProjectSpecificWrapper24 {
	
	///public static void main(String[] args) throws InterruptedException {

	@Test (invocationCount=3)
	public void createLead() throws InterruptedException {

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
		
		// Click Create lead
		driver.findElementByXPath("//input[@name='submitButton']").click();

		//Verify title of the page
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.contains("View")) {
			System.out.println("Title matched");
		} else {
			System.out.println("Title not Matche");
		}
	}
	}
