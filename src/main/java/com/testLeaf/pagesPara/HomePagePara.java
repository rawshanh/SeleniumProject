package com.testLeaf.pagesPara;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePagePara {

	//1.create a reference variable of webdriver
		WebDriver driver; 
		
		//2.create all elements and locators of HomePage
			
		//By logoutButton = By.className("decorativeSubmit");
		By crmsfaLink = By.linkText("CRM/SFA");
		
		//3.create constructor of HomePage
		
		public HomePagePara(WebDriver driver) {
			this.driver = driver;
					
		}
		//4.create methods of all required actions of this page
	
		public void clickCrmsfaLink() {
			driver.findElement(crmsfaLink).click();
			
		
		}
	
}
