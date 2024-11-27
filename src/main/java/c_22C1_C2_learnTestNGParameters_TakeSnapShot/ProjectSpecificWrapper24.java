package c_22C1_C2_learnTestNGParameters_TakeSnapShot;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class ProjectSpecificWrapper24 {


	public ChromeDriver driver;

	//@Parameters({"url","uname","pwd"})
	@Parameters({"url","uname","pwd"})

	@BeforeMethod
	public void login(String url, String uname, String pwd){

		//public void login(String url,String uname, String pwd) { 

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();

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

	@DataProvider
	//public void getData(){
	public String [][] getData() {

		String [][] data = new String[3][3];

		data[0][0] = "TCS";
		data[0][1] = "Lovely";
		data[0][2] = "Rawshan";
		data[1][0] = "ABC";
		data[1][1] = "hsn";
		data[1][2] = "eai";
		data[2][0] = "atia";
		data[2][1] = "yousuf";
		data[2][2] = "Ali";

		return data;



	}
}
