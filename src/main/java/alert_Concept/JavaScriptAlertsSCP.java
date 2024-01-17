package alert_Concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlertsSCP {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		//by using URL
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//For SimpleAlert
		/* //driver.findElementByXPath("//button[text()='Click for JS Alert']").click();
		Alert SimpleAler0 = driver.switchTo().alert();
		
		SimpleAler0.getText();
		
		System.out.println(SimpleAler0.getText());
		Thread.sleep(3000);
		SimpleAler0.accept();
		driver.close(); */
		/*//Confirmation Alert 
		driver.findElementByXPath("//button[text()='Click for JS Confirm']").click();
		Alert ConfirmationAlert0 = driver.switchTo().alert();
		ConfirmationAlert0.getText();
		System.out.println(ConfirmationAlert0.getText());
		
		Thread.sleep(3000);
		//ConfirmationAlert0.accept();
		
		ConfirmationAlert0.dismiss();
		driver.close(); */
		
		//PromptAlert
		driver.findElementByXPath("")
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
