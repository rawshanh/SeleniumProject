package javaDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XpathConceptPracticeS {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.getTitle();
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait("20", null)
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();

		driver.findElementByXPath("//a[text()='Create Lead']").click();
		driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys("TCS");
		driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("Hema");
		driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("Ma");

		WebElement Source = driver.findElementByXPath("//select[contains(@id,'createLeadForm_d')]");		
		Select dd = new Select(Source);
		dd.selectByVisibleText("Employee");
		driver.findElementByXPath("//input[contains(@id,'createLeadForm_generalPr')]").sendKeys("Ms.");


		//WebElement Industry = driver.findElementByXPath("//select[contains(@id,'createLeadForm_d')]");
		WebElement Industry = driver.findElementByXPath("//select[@id='createLeadForm_industryEnumId']");
		Select ddI = new Select(Industry);
		ddI.selectByVisibleText("Computer Hardware");
		//ddI.selectByVisibleText("Computer Hardware");
		

		WebElement Ownership = driver.findElementByXPath("//select[contains(@id,'createLeadForm_o')]");
		Select ddW = new Select(Ownership);
		ddW.selectByVisibleText("Partnership");

		driver.findElementByXPath("//textarea[contains(@id,'createLeadForm_d')]").sendKeys("TCS");
		driver.findElementByXPath("//input[contains(@id,'createLeadForm_primaryPhoneC')]").sendKeys("1");
		driver.findElementByXPath("//input[contains(@id,'createLeadForm_d')]").sendKeys("MKT");
		driver.findElementByXPath("//input[contains(@id,'createLeadForm_n')]").sendKeys("100");
		driver.findElementByXPath("//input[contains(@id,'createLeadForm_primaryW')]").sendKeys("google.com");

		WebElement StateProvince = driver.findElementByXPath("//select[contains(@id,'createLeadForm_generalS')]");
		Select ddS = new Select(StateProvince);
		ddS.selectByVisibleText("Arizona");

		WebElement Country = driver.findElementByXPath("//select[contains(@id,'createLeadForm_generalC')]");		
		Select ddC = new Select(Country);
		ddC.selectByVisibleText("United States");

		driver.findElementByXPath("//input[@id='createLeadForm_generalPostalCode']").sendKeys("75061");

		WebElement MKTCampaign = driver.findElementByXPath("//select[contains(@id,'createLeadForm_m')]");
		Select ddM = new Select(MKTCampaign);
		ddM.selectByVisibleText("Automobile");

		driver.findElementByXPath("//input[contains(@id,'createLeadForm_primaryPhoneN')]").sendKeys("123456");
		driver.findElementByXPath("//input[contains(@id,'createLeadForm_primaryE')]").sendKeys("abc@gmail.com");

		driver.close();
	}

}
