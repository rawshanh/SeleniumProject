package Alert_Concept1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers.chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoCSR");
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByLinkText("Create Lead").click();
		
		driver.findElementByLinkText("Merge Leads").click();
		
		driver.findElementByLinkText("Merge").click();
		
		String ConfirmationAlart = driver.switchTo().alert().getText();
		
		
		System.out.println(ConfirmationAlart);
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
