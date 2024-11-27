package com.testLeaf.pagesPara;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadPagePara {
   
	WebDriver driver;
	// here BY is a CLASS 
  By companyName = By.id("createLeadForm_companyName");
  By firstName = By.id("createLeadForm_firstName");
  By lastName = By.id("createLeadForm_lastName");
  By source = By.id("createLeadForm_dataSourceId");
  By createLeadButton = By.xpath("//input[@value='Create Lead']");
  
  public CreateLeadPagePara(WebDriver driver) {
	  this.driver = driver;
	    }
  
	public void eterCompanyName(String cName) {
		driver.findElement(companyName).sendKeys(cName);
	}
	public void enterFirstName(String fName) {
		driver.findElement(firstName).sendKeys(fName);
		}
	public void enterLastName(String lName) {
		driver.findElement(lastName).sendKeys(lName);
	}
	public void clickCreateLead() {
		driver.findElement(createLeadButton).click();
	}
	public void chooseSource() {
		//driver.findElementById("createLeadForm_dataSourceId");
		WebElement src = driver.findElement(source);
		Select dd = new Select(src);
		dd.selectByVisibleText("Website");
	
	
	}
}
