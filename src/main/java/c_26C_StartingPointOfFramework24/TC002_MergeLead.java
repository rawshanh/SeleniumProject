package c_26C_StartingPointOfFramework24;

import org.testng.annotations.Test;

public class TC002_MergeLead extends GenericWrapper{
  
	
	@Test
	
	public void mergeLead() {
		launchBrowser("http://leaftaps.com/opentaps");
		enterById("username","DemoSalesManager");
		enterById("password","crmsfa");
		clickByXpath("//input[@class='decorativeSubmit']");
		
		clickByXpath("//input[@value='Login']");
		clickByLinkText("CRM/SFA");
	
}

	}

