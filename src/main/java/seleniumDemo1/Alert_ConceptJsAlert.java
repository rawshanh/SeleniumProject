package seleniumDemo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_ConceptJsAlert {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementsByXPath("//button[text()='Click for JS Alert']");
		String SimpleAlert1 = driver.switchTo().alert().getText();
		
		//SimpleAlert1.getText();
		System.out.println(SimpleAlert1);
		
		//driver.findElementsById("result").getText();
		
		Thread.sleep(3000);
		//SimpleAlert1.accept();
		driver.switchTo().alert().accept();
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
