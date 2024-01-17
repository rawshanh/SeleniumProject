package learnTestNGParameters;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.github.dockerjava.api.model.Driver;

public class ProjectSpecificWrapper {
   
	public ChromeDriver driver;
	
	@Parameters({"url","uname","pwd"})
	
	@BeforeMethod
	public void login(String url,String uname, String pwd) { 

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		//maximize
		driver.manage().window().maximize();

		//load URL
		driver.get(url); 

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//Enter Username - (Element level)
		driver.findElementById("username").sendKeys(uname);

		//Enter Password - (Element level)
		driver.findElementById("password").sendKeys(pwd);

		// Click Login Button - (Element level)
		driver.findElementByClassName("decorativeSubmit").click();

		// click crm.sfa link
		driver.findElementByLinkText("CRM/SFA").click();

	  }
      @AfterMethod
      public void closeBrowser() {
	driver.close();	
}
      @DataProvider //(annotation of TestNG)
    //public void getData() {  
   public String[][] getData()throws IOException {
    	String [][] data = new String[3][3];
    	data[0][0] = "TCS";
    	data[0][1] = "Sheikh";
    	data[0][2] = "Rawshan";
    	
    	data[1][0] = "ABC";
    	data[1][1] = "Rubel";
    	data[1][2] = "Miah";
    	
    	data[2][0] = "XYZ";
    	data[2][1] = "MUsaddeik";
    	data[2][2] = "Khan";
		return data;
    	  
    	  
    	  
      }
  
    	  
     }
      


	
