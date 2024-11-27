 package com.testLeaf.pages;

 import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;

 public class MyHomePage {

	//reference variable(driver)
	WebDriver driver;

	//here "By"is a CLASS and "link Text"is static method of the class
	By createLeadLink = By.linkText("Create Lead");

	//create constructor of MyHomePage
	public MyHomePage(WebDriver driver) {

		this.driver = driver; //here "this" means current

	}
	//create method for every locator

	public void clickCreateLeadLink() {
		driver.findElement(createLeadLink).click();
	}


}
