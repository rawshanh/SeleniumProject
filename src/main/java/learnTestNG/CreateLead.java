package learnTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String title = driver.getTitle();
		if(title.contains("Leaftaps - TestLeaf")) {
			System.out.println("title is mathced");
		}
		else {
			System.out.println("title is not matched");
		}
		System.out.println(driver.getTitle());
		
		//for practicing reason i have used css selector otherwaise we can use direct locator ID,name,class or oters locator
		driver.findElement(By.cssSelector("#username")).sendKeys("DemoSalesManager");
		driver.findElement(By.cssSelector("label[for='password']+input")).sendKeys("crmsfa");
		driver.findElement(By.cssSelector(".decorativeSubmit")).click();
		driver.findElement(By.cssSelector("a[style='color: black;']")).click();
		String title2 = driver.getTitle();
		System.out.println(title2);
		if(title2.equals("My Home | opentaps CRM")) {
			System.out.println("title2 is mathched");
		}
		else {
			System.out.println("title2 is not matched");
		}
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		driver.findElement(By.cssSelector("input[id^='createLeadForm_c']")).sendKeys("TCS");
		driver.findElement(By.cssSelector("#createLeadForm_firstName")).sendKeys("Hema");
		driver.findElement(By.cssSelector("input[id$='astName']")).sendKeys("Ma");
		driver.findElement(By.cssSelector("input[name='generalProfTitle']")).sendKeys("Ms");
		driver.findElement(By.cssSelector("#createLeadForm_description")).sendKeys("TCS");
		driver.findElement(By.cssSelector("input[id^='createLeadForm_primaryPhoneC']")).clear();
		driver.findElement(By.cssSelector("input[id^='createLeadForm_primaryPhoneC']")).sendKeys("1");
		driver.findElement(By.cssSelector("input[name='departmentName']")).sendKeys("MKT");
		driver.findElement(By.cssSelector("#createLeadForm_numberEmployees")).sendKeys("100");
		driver.findElement(By.cssSelector("input[name='primaryWebUrl']")).sendKeys("google.com");
		driver.findElement(By.cssSelector("#createLeadForm_generalPostalCode")).sendKeys("75061");
		driver.findElement(By.cssSelector("#createLeadForm_primaryPhoneNumber")).sendKeys("123456");
		driver.findElement(By.cssSelector("#createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");
		//driver.findElement(By.cssSelector("input[value='Create Lead']")).click();
	
		
		driver.findElementByXPath("//input[@name='submitButton']").click();
		
	}

}
