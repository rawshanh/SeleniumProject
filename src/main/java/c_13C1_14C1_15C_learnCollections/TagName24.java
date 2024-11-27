package c_13C1_14C1_15C_learnCollections;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName24 {

	public static void main(String[] args) {

    
	//public void tagName() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// WebDriverManager.firefoxdriver().setup();

		//Using WebDriver interface and create object of ChromeDriver class
		WebDriver driver = new ChromeDriver();
		
		// load URL
		driver.get("http://leaftaps.com/opentaps");

		//driver.get("http://www.indeed.com");

		// maximize
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       // driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		
		
	// Enter Username 
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		// Enter Password 
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		// Click Login Button 
		driver.findElement(By.className("decorativeSubmit")).click();

		// click crm/sfa link
		driver.findElement(By.linkText("CRM/SFA")).click();	
		
		
		
	//	List<WebElement> ListTag2024 = driver.findElements(By.tagName("div"));
	//	System.out.println(ListTag2024.size());
	//	
		// or another way
		 List elements = driver.findElements(By.tagName("a"));
		 int total = elements.size();
		 System.out.println(total);
		 System.out.println("ABC :" + total);
		 
		 
		/*
	//Find how many div tag in this page
		List<WebElement> ListTag24 = driver.findElements(By.tagName("div"));
		
		System.out.println(ListTag24.size());
		
		
		
	//Find how many a tag in this page
		List<WebElement> ListTag1 = driver.findElements(By.tagName("a"));
		System.out.println(ListTag1.size());
		
		int total = ListTag1.size();
		System.out.println(total);
		
	 List elements = driver.findElements(By.tagName("div"));
		int total = elements.size();

		//List  elements = driver.findElements(By.tagName("h2"));

		//int total = elements.size();

		System.out.println(total);
		System.out.println("Total webelements starting with TagName 'div' :" + total);
		System.out.println("Total Tagname 'Div' :"  + total);

		Thread.sleep(2000);
		driver.close();

     */
			
		
		
	}

}
