package stepsDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestCases {
	
	ChromeDriver driver;
	@Given("Launch chrome browser and load url")
	public void launch_chrome_browser_and_load_url() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//Create object ChromeDriver class
		driver = new ChromeDriver();

		//Load or enter URL
		driver.get("http://leaftaps.com/opentaps/control/login");

		//maximize window
		driver.manage().window().maximize();

		//implicitely wait
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		//print 
		System.out.println("Launch Chrome browser and loaded URL successfully");
	}

	//@Given("enter username as demosalesmanager")
	@Given("enter username as (.*)")
	public void enter_username_as_demosalesmanager(String uname) {
	//	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");	
		driver.findElementById("username").sendKeys(uname);
		}

	//@Given("enter password as crmsfa")
	@Given("enter password as (.*)")
	public void enter_password_as_crmsfa(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	    
	}

	@When("click the login button")
	public void click_the_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	    
	}

	@Then("its navigated Homepage")
	public void its_navigated_Homepage() {
	    System.out.println(driver.getTitle());
	}

	@Then("click the logout button")
	public void click_the_logout_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Given("enter username as lovely")
	public void enter_username_as_lovely() {
		driver.findElementById("username").sendKeys("lovely");
	}

	@Then("its navigated same page")
	public void its_navigated_same_page() {
	    System.out.println(driver.getTitle());
	}
	@Then("verify error message")
	public void verify_error_message() {
	    String text = driver.findElementById("errorDiv").getText();
	    if(text.contains("The Following Errors Occurred:")) {
	    	System.out.println("Error message is matched");
	    }else {
	    	System.out.println("Error message not matched");
	    }
	}
	@Given("click CRMSFA")
	public void click_CRMSFA() {
		driver.findElementByLinkText("CRM/SFA").click();
	}

	@Given("click leads link")
	public void click_leads_link() {
		driver.findElementByLinkText("Leads").click();
	}

	@When("click Create Lead link")
	public void click_Create_Lead_link() {
		driver.findElementByLinkText("Create Lead").click();
	}

	@When("its navigated CreateLeadPage")
	public void its_navigated_CreateLeadPage() {
	    System.out.println(driver.getTitle());
	}

	@When("enter the company as (.*)")
	public void enter_the_company_as_ABC(String cName) {
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
	}

	@When("enter the firstname as (.*)")
	public void enter_the_firstname_as_Hema(String fName) {
		driver.findElementByCssSelector("input#createLeadForm_firstName").sendKeys(fName);
	}

	@When("enter the lastname as (.*)")
	public void enter_the_lastname_as_Mali(String lName) {
		driver.findElementByCssSelector("#createLeadForm_lastName").sendKeys(lName);
	}

	@When("choose source as Website")
	public void choose_source_as_Website() {
		WebElement src = driver.findElementById("createLeadForm_dataSourceId");
		Select dd = new Select(src);
		dd.selectByVisibleText("Website");
	}

	@When("click the Create Lead button")
	public void click_the_Create_Lead_button() {
		driver.findElementByXPath("//input[@name='submitButton']").click();
	}

	@Then("its navigated ViewLeadPage")
	public void its_navigated_ViewLeadPage() {
	    System.out.println(driver.getTitle());
	}

	@Then("verify the firstname")
	public void verify_the_firstname() {
		String firstName = driver.findElementById("viewLead_firstName_sp").getText();
		System.out.println(firstName);
		if(firstName.equals("Hema")) {
			System.out.println("Name is Matched");
		} else {
			System.out.println("Not Matched");}
	}
	@When("click Find Leads")
	public void click_Find_Leads() {
	    driver.findElementByLinkText("Find Leads").click();
	}

	@When("enter firstname")
	public void enter_firstname() {
	    driver.findElementByClassName("firstName").sendKeys("Hema");	
	    }

	@When("click Find Leads button")
	public void click_Find_Leads_button() {
	    driver.findElementByLinkText("Find Leads").click();
	}

	@When("click first resulting lead")
	public void click_first_resulting_lead() {
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
	}

	@Then("navigated ViewLeadPage")
	public void navigated_ViewLeadPage() {
		 System.out.println(driver.getTitle());
	}

	@Then("verify title of the page")
	public void verify_title_of_the_page() {
		System.out.println(driver.getTitle());
	}

	@Then("click on Edit")
	public void click_on_Edit() {
	    driver.findElementByLinkText("Edit").click();
	}

	@Then("navigated Edit Lead page")
	public void navigated_Edit_Lead_page() {
	    System.out.println(driver.getTitle());
	}

	@Then("change the company name")
	public void change_the_company_name() {
	    driver.findElementById("//input[@id='viewLead_companyName_sp']").clear();
	    driver.findElementById("viewLead_companyName_sp").sendKeys("CTS");
	}

	@Then("click update")
	public void click_update() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("confirm changed name appears")
	public void confirm_changed_name_appears() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("close browser")
	public void close_browser() {
	driver.quit();
	}

}
