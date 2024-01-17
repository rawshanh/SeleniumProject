package seleniumDemo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.findElementByXPath(null)
		driver.findElementByXPath("//button[text()='Click for JS Prompt']").click();
		
		//by using alert class
		Alert PromptAlert = driver.switchTo().alert();
		PromptAlert.getText();		
		System.out.println(PromptAlert.getText());
		
		PromptAlert.sendKeys("i am a Robot");
		Thread.sleep(3000);
		PromptAlert.accept();
		
		//driver.close()
		//driver.findElement(null)n
		String PromptAlertV = driver.findElement(By.id("result")).getText();
		
		System.out.println(PromptAlertV);
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		driver.getTitle();
		System.out.println(driver.getTitle());
		driver.close();
		
		
		
		//xpath syntax //tagName[text()='linktext']
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	}

}
