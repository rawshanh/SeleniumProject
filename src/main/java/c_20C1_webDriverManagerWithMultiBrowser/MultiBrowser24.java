package c_20C1_webDriverManagerWithMultiBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiBrowser24 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.google.com/");
		
		/* Selenium introduce new function create(), just use create() with WebDriverManager.chromedriver().create() [use create() in place of setup().]
				It will give you the instance of WebDriver and you can use directly WeDriver driver with "WebDriverManager.chromedriver().create();"
				* that is 
				WebDriver driver = WebDriverManager.chromedriver().create();

		No need to write "WebDriver driver = new ChromeDriver();" after WebDriverManager.chromedriver().create();


		*/
		//WebDriverManager.chromedriver().create(); [Remove/comment out this line and use below line]

		WebDriver driver1 = WebDriverManager.chromedriver().create();
		driver1.get("https://www.google.com/");
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(driver1.getTitle());
		System.out.println(driver1.getCurrentUrl());

		//Enter 'Face book login' in Google search box
		driver1.findElement(By.name("q")).sendKeys("facebook login");
		/*
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		//String title = driver.getTitle();
		//System.out.println(title);
		 * 
		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		//Enter 'Face book login' in Google search box
		driver.findElement(By.name("q")).sendKeys("facebook login");

		 Thread.sleep(2000);*/

		//driver.quit();


	}

}
