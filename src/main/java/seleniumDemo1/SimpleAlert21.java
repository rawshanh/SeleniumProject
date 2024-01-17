package seleniumDemo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert21 {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	//Load URL
	driver.get("https://ksrtc.in/oprs-web/ticket/waitlist.do");
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(20, );
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElementById("searchBtn").click();
	
	//driver.switchTo().alert().
	/*String SimpleAlert21 = driver.switchTo().alert().getText();
	System.out.println(SimpleAlert21);*/
	
	String SimpleAlert21 = driver.switchTo().alert().getText();
	
	System.out.println(SimpleAlert21);
	//Thread.sleep(3000);
	
	Thread.sleep(3000);
	
	driver.switchTo().alert().accept();
	driver.close();
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
