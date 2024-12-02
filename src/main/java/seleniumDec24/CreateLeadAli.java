package seleniumDec24;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeadAli {

	public static void main(String[] args) {

       
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		//driver.navigate().to("http://leaftaps.com/opentaps/control/main");
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		
		

	}

}
