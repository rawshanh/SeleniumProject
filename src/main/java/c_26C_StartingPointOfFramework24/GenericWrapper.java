package c_26C_StartingPointOfFramework24;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class GenericWrapper implements WrapperMethods{
   
	public ChromeDriver driver;
	
    public void launchBrowser(String url) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get(url);
	 driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	System.out.println("Launch Chrome browser and loaded URL successfully");
	}

	public void enterById(String locatorValue, String data) {
		driver.findElementById(locatorValue).sendKeys(data);
	}

	public void enterByName(String locatorValue, String data) {
			
	}

	public void enterByPartialLinkText(String locatorValue, String data) {
		
	}

	public void enterByXpath(String locatorValue, String data) {
		
	}

	public void enterByCssSelactor(String locatorValue, String data) {
		
	}

	public void clickByName(String locatorValue) {
		
	}

	public void clickByClassName(String locatorValue) {
		
	}

	public void clickByLinkText(String locatorValue) {
		
	}

	public void clickByXpath(String locatorValue) {
		driver.findElementByXPath(locatorValue).click();
	}

	public void selectVisibleTextById(String Id, String Value) {
		
	}

	public void selectIndexByName(String Name, int Value) {
			
	}

	public void getTextById(String Id) {
		
	}

	public void closeBrowser() {
		
	}

    //ctrl / diley all will be //
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
