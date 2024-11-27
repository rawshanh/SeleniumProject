package com.testLeaf.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.testLeaf.pages.CreateLeadPage;
import com.testLeaf.pages.HomePage;
import com.testLeaf.pages.LoginPage;
import com.testLeaf.pages.MyHomePage;

public class ExecuteTestCases {

	    @Test
	    public void verifyTestLeafLogin() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//Create object ChromeDriver class
		WebDriver driver = new ChromeDriver();

		//Load or enter URL
		driver.get("http://leaftaps.com/opentaps/control/login");

		//maximize window
		driver.manage().window().maximize();

		//implicitely wait
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		//print 
		System.out.println("Launch Chrome browser and loaded URL successfully");


		//create object of LoginPage inside verifyTestLeafLogin()
		LoginPage login = new LoginPage(driver);
//		login.typeUserName();
//		login.typePassWord();
//		login.clickLoginButton();
		
		//Way-2:
		//login.loginTestleaf();
		//Way-3: Parameter
		login.loginTestleaf("DemoSalesManager", "crmsfa");

		HomePage homepage = new HomePage(driver);
		homepage.clickCrmsfaLink();

		MyHomePage myhomepage = new MyHomePage(driver);
		myhomepage.clickCreateLeadLink();

		CreateLeadPage createleadpage = new CreateLeadPage(driver);
//		createleadpage.eterCompanyName();
//		createleadpage.enterFirstName();
//		createleadpage.enterLastName();
//		createleadpage.chooseSource();
//		createleadpage.clickCreateLead();
//		driver.quit();
		//Way-3: Parameter
		createleadpage.eterCompanyName("ABC");
		createleadpage.enterFirstName("Hema");
		createleadpage.enterLastName("Mali");
		createleadpage.chooseSource();
		createleadpage.clickCreateLead();
		driver.quit();



	}
}

