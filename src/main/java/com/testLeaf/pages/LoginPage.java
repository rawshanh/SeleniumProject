package com.testLeaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage { 
	 
	//1.create a refference variable of webdriver
	WebDriver driver; 
	
	//2.create all elements and locators of login page
	By username = By.id("username");
	By password = By.id("password");
	By loginButton = By.className("decorativeSubmit");
	
	//3.create constructor of login page
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
				
	}
	//Way-1:4.create methods of all required actions of this page
//	public void typeUserName() {
//		driver.findElement(username).sendKeys("DemoSalesManager");
//			}
//	
//	public void typePassWord() {
//		driver.findElement(password).sendKeys("crmsfa");
//	}
//	public void clickLoginButton() {
//		driver.findElement(loginButton).click();
//	}
	//Way-2: Within one Consolidated method
//	public void loginTestleaf() {
//		driver.findElement(username).sendKeys("DemoSalesManager");
//		driver.findElement(password).sendKeys("crmsfa");
//		driver.findElement(loginButton).click();
//	}
	//Way-3: Using Parameter
	public void loginTestleaf(String Uname, String pwd) {
		driver.findElement(username).sendKeys(Uname);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(loginButton).click();
}
}