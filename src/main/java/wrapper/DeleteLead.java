package wrapper;

import org.testng.annotations.Test;

public class DeleteLead extends ProjectSpecificWrapper{
		
	@Test
	public void deleteLead() throws InterruptedException {
	
	//click Leads
			driver.findElementByLinkText("Leads").click();
			
			//click Find lead link
			driver.findElementByLinkText("Find Leads").click();
			
			//click on phone
			driver.findElementByXPath("//span[text()='Phone']").click();
			
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
			
			//Capture lead ID of First Resulting lead
			String leadId = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").getText();
			System.out.println(leadId);
			
			//Click First Resulting lead
			driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
			
			//Click Delete
			driver.findElementByXPath("//a[text()='Delete']").click();
			
			//Click Find leads
			driver.findElementByXPath("//a[text()='Find Leads']").click();
			
			//Enter captured lead ID
			driver.findElementByXPath("//input[@name='id']").sendKeys("10056");
			
			//Click find leads button
			driver.findElementByXPath("//button[text()='Find Leads']").click();
			
			//Verify error msg
			String errorMsg = driver.findElementByXPath("//div[text()='No records to display']").getText();
			System.out.println(errorMsg);
			
			if(errorMsg.contains("No records")) { 
				System.out.println("ErrorMsg is matched");
			}
			else {
				System.out.println("Not Matched");
			}

}
}