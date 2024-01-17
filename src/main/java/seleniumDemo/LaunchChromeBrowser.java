package seleniumDemo;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) {


		//For Chrome Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\ChromeDriver\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
	
		//Load url		
		driver.get("http://leaftaps.com/opentaps");
	
				
		//get title of the page
		//System.out.println(driver.getTitle());
			String title = driver.getTitle();
			System.out.println(title);
		

	}

}
