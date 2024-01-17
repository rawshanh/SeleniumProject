package seleniumDemo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static void main(String[] args) throws InterruptedException {
		
		//1step-we create package 2.we create class under package.
		
		//step 3.  System.setProperty("webdriver.chrome.driver", "./drivers.chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//step 4. ChromeDriver driver = new ChromeDriver(); Object Creation
		ChromeDriver driver = new ChromeDriver();
		
		//step 5.for url https://ksrtc.in/oprs-web/ticket/waitlist.do we have to copy this
		driver.get("https://ksrtc.in/oprs-web/ticket/waitlist.do");
		
		//step 6. we have to command driver to manage to maximize
		driver.manage().window().maximize();
		
		//step 7.driver will manage to implicitlywait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//step 8.from DOM we will findout locator 
		driver.findElementById("searchBtn").click();
		
		//step9.switch to alert mode
		String SimpleAlert = driver.switchTo().alert().getText();
		
		//step 10..println SimpleAlert
		System.out.println(SimpleAlert);
		
		Thread.sleep(3000);		
		driver.switchTo().alert().accept();		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
