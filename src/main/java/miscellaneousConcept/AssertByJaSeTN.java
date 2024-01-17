package miscellaneousConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertByJaSeTN {

	public static void main(String[] args) {
		
		
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			//maximize the window
			driver.manage().window().maximize();

			driver.get("https://www.costco.com/");
			
		   String title = driver.getTitle();
		    System.out.println(title);
		    
		Assert.assertEquals(title, "Welcome to Costco Wholesale","Asserting page title");
		//isDisplayed(); - "Costco" logo is Displayed(true/false)
		boolean logo = driver.findElement(By.xpath("//img[@automation-id='headerCostcoLogo']")).isDisplayed();		
		Assert.assertTrue(logo, "logo is displayed on the Page");
		driver.get("https://signin.costco.com/e0714dd4-784d-46d6-a278-3e29553483eb/B2C_1A_SSO_WCS_signup_signin_537/oauth2/v2.0/authorize?ClientName=USBC&ui_locales=en-US&scope=openid+offline_access&response_type=code+id_token&redirect_uri=https%3A%2F%2Fwww.costco.com%2FOAuthLogonCmd&state=URL%3D%5BSSO%5D%2F%5BSSO%5D&nonce=wv4ajftvgEAnbIhp&client_id=4900eb1f-0c10-4bd9-99c3-c59e6c1ecebf&TC=0&response_mode=form_post");
		
	driver.findElement(By.xpath("//div[@class='rememberMe checked']/input")).click();
	boolean KeepMeSignedIn  = driver.findElement(By.xpath("//div[@class='rememberMe']/input")).isSelected();
	 System.out.println(KeepMeSignedIn);
	driver.quit();
		
			
	}

}
