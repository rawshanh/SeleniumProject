package miscellaneousConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		
		//Load url		
	    //driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.get("https://secure.bankofamerica.com/login/sign-in/signOnV2Screen.go");
	
		//get title of the page
		//System.out.println(driver.getTitle());
		String title = driver.getTitle();
		System.out.println(title);
		
		//Assertion Syntax: Assert.assertEquals(Actual result,"Expected result","Assert Message");
		Assert.assertEquals(title, "Bank of America | Online Banking | Log In | User ID","Asserting page title");
		
		boolean logo = driver.findElement(By.xpath("//img[@alt='Bank of America']")).isDisplayed();
		
		Assert.assertTrue(logo, "logo is displayed");
		
		boolean getTheAppLink = driver.findElement(By.xpath("//a[@id='choose-device-get-the-app']/span[1]")).isEnabled();
		
		if(getTheAppLink==true) {
			System.out.println("Displayed Get the App is Enable");
		}else {
			System.out.println("Displayed Get the App is not Enable");
		}
		
		driver. findElement(By.xpath("//div[@class='remember-info']/input")).click();
		boolean SaveThisUserId = driver.findElement(By.xpath("//div[@class='remember-info']/input")).isSelected();
			
		System.out.println(SaveThisUserId);
		driver.quit();
			
}

}
