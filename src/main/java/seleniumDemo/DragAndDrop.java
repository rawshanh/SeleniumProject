package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {

	//public static void main(String[] args) throws InterruptedException {
	
	@Test
	public void dragAndDrop() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		driver.switchTo().frame(0);
		//select draggable and droppable elements and store in a variable
		//WebElement src = driver.findElementById("draggable");
		//WebElement src = driver.findElementByXPath("//a[text()='draggable']");
	
		WebElement src = driver.findElementById("draggable");
		//WebElement destination = driver.findElementByXPath("//a[text()='Droppable']");
		WebElement dest = driver.findElementById("droppable");
		Thread.sleep(4500);		
		Actions action = new Actions(driver);
		action.dragAndDrop(src, dest).perform();
		Thread.sleep(4000);		
		driver.switchTo().parentFrame();		
		Thread.sleep(4000);		
		driver.close();
		
	}

}
