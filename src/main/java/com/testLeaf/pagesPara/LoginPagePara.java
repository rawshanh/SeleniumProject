package com.testLeaf.pagesPara;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPagePara { 
	 
	//1.create a refference variable of webdriver
	WebDriver driver; 
	
	//2.create all elements and locators of login page
	By username = By.id("username");
	By password = By.id("password");
	By loginButton = By.className("decorativeSubmit");
	
	//3.create constructor of login page
	
	public LoginPagePara(WebDriver driver) {
		this.driver = driver;
				
	}
	//4.we can create one combined methd for testleaf login 
	public void loginTestleaf(String uName,String pwd) {
		driver.findElement(username).sendKeys(uName);
	    driver.findElement(password).sendKeys(pwd);
	    driver.findElement(loginButton).click();
	
	}	

}
