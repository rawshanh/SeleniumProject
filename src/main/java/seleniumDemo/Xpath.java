package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//driver.findElementById("username").sendKeys("DemoSalesManager");
		//driver.findElementById("password").sendKeys("crmsfa");
		
		
		
		
		
		
		
		
		// Partial Attribute base xpath----
		//driver.findElementByXPath("//input[contains(@name,'U')]").sendKeys("DemoSalesManager");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// Attribute base xpath----
		//driver.findElementByXPath("//input[@name='USERNAME']").sendKeys("DemoSalesManager");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//driver.findElementByXPath("//input[contains(@name,'U')]").sendKeys("DemoSalesManager");
		
		
		
		
		
		
		
		


			}

}
