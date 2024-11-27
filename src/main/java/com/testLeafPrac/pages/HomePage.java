package com.testLeafPrac.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;
	
	By crmsfaLink = By.linkText("CRM/SFA");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
			}
		
	
	
	
	
}
