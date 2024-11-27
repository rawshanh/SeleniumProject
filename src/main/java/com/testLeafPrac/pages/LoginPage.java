package com.testLeafPrac.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	By username = By.id("username");
	By password = By.id("password");
	By loginButton = By.className("decorativeSubmit");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void enterusername() {
		driver.findElement(username).sendKeys("DemoSalesManager");
		
	}
	public void enterpassword() {
		driver.findElement(password).sendKeys("crmsfa");
	}
	 public void clicklogin() {
		 driver.findElement(loginButton).click();
	 }
			
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	

