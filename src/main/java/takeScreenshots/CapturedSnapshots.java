package takeScreenshots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturedSnapshots {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	    driver.get("http://leaftaps.com/opentaps/control/main");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    String title = driver.getTitle();
	    System.out.println(title);
	    if(title.equals("Leaftaps - TestLeaf Automation Platform")) {
	    	System.out.println("Title is mactched");	    	
	    }
	    else {
	    	System.out.println("Title id not matched");
	    }

	    driver.findElement(By.cssSelector("#username")).sendKeys("DemoSalesManager");
	    driver.findElement(By.cssSelector("#password")).sendKeys("crmsfa");
	    driver.findElement(By.cssSelector(".decorativeSubmit")).click();
	    driver.findElement(By.xpath("//a[contains(text(),'C')]")).click();
	    driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
	    driver.findElement(By.cssSelector("#createLeadForm_companyName")).sendKeys("TCS");
	    driver.findElement(By.cssSelector("#createLeadForm_firstName")).sendKeys("Hema");
	    driver.findElement(By.cssSelector("#createLeadForm_lastName")).sendKeys("Ma");
	  //take screenshot and store it in a temporary file
	    File src = driver.getScreenshotAs(OutputType.FILE);
	   File dest = new File("C:\\Users\\shabu\\OneDrive\\Desktop\\Snapshot\\img\\png");
	    FileUtils.copyFile(src, dest);
	    
	    driver.findElement(By.cssSelector("#createLeadForm_generalProfTitle")).sendKeys("Ms.");
	    driver.findElement(By.cssSelector("#createLeadForm_description")).sendKeys("TCS");
	    driver.findElement(By.cssSelector("#createLeadForm_primaryPhoneCountryCode")).clear();
	    driver.findElement(By.cssSelector("#createLeadForm_primaryPhoneCountryCode")).sendKeys("1");
	    driver.findElement(By.cssSelector("#createLeadForm_departmentName")).sendKeys("MKT");
	    driver.findElement(By.cssSelector("#createLeadForm_numberEmployees")).sendKeys("100");
	    driver.findElement(By.cssSelector("#createLeadForm_primaryWebUrl")).sendKeys("google.com");
	    driver.findElement(By.cssSelector("#createLeadForm_generalPostalCode")).sendKeys("75061");
	    //driver.findElement(By.cssSelector("createLeadForm_primaryPhoneNumber")).sendKeys("12356");
	    driver.findElementByName("generalAttnName").sendKeys("12356");
	    
	    driver.findElementById("createLeadForm_primaryEmail").sendKeys("abc@gmail.com");
	 Thread.sleep(2000);
	    //driver.findElement(By.xpath("//input[@value='Create Lead']").click();
	//   driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
	    
	   driver.findElementByName("submitButton").click();
	}

}
