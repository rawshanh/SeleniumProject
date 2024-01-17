package Alert_Concept1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();
	
		driver.get("http://leaftaps.com/opentaps");
		//http://leaftaps.com/crmsfa/control/mergeLeadsForm
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, null)
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		//driver.findElementsById("password")
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementByLinkText("Merge Leads").click();
		driver.findElementByLinkText("Merge").click();
		
		String ConfirmationAlert = driver.switchTo().alert().getText();
		//AlertConfirm1.get
		System.out.println(ConfirmationAlert);
		Thread.sleep(3000);
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		driver.close();
		//System.out.println(AlertConfirm1.getText());
		//System.out.println(AlertConfirm1.getText());
		
		//System.out.println(ConfirmationAlert.get)
		
		//System.out.println(alartMessage)
		
		
		
		
		
	}

}
