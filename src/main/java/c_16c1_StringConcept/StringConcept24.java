package c_16c1_StringConcept;

public class StringConcept24 {

	
	
	public static void main(String[] args) {
		
		String name = "Tanzima";
		String name1 = "Tanzima";
		System.out.println(name.equals(name1));
		
		String text = "String Concept";
		String text1 = "String Concept1";
		System.out.println(text);
		System.out.println(text1);
		
		//Find the memory location/address of this text/text1 variable
		System.out.println(System.identityHashCode(text1));
		System.out.println(System.identityHashCode(text));
		

		//String class Method
		//1. equals() -return true or false
        System.out.println(text.equals(text1));    //equals function compare the value of two different variable(text & text1)
        System.out.println("---------------");
        
        
      //compares memory address of String variable
        System.out.println(text == text1);
        
      //2. Length()- return count of String
        String text2 = "Learning String";
        System.out.println(text2.length());
        System.out.println(name.length());
        System.out.println("---------------");
        
      //"I am" + "Mamun"; I am Mamun
	  //3. Concat()- if you want to Concat (join more than one Strings) two String
        System.out.println(text.concat(text1));
		String num = "20";		
		int a = 24;
		int b = 22;
		System.out.println(num + a);
		System.out.println(a+b);
		System.out.println("---------------");
		
		//4. trim()- want to remove white space from both side of a String use- trim()
		String line = "   Java String Concept   ";
		System.out.println(line);
		System.out.println(line.length());
		System.out.println(line.trim());
		//After use - trim()
		System.out.println(line.trim().length());
		//Before trim()
		System.out.println(line.length());
		System.out.println("---------------");
		
		
		//5. toLowerCase()- convert all of the String as LowerCase()
		String text4 = "Compares String";
		System.out.println(text4.toLowerCase());
		
		//toUpperCase()- convert all of the String as UpperCase()
		String text5 = "Compares String s";
		System.out.println(text5.toUpperCase());
		System.out.println("---------------");
		
		//6.contains() -given String is available in entire String or not - return true/false
		String text6 = "I m learning Java";
		System.out.println(text6.contains("ea"));
		System.out.println(text6.contains("ji"));
		System.out.println("---------------");
		
		
		
		
		
		
		
		/*String text = "String Concept";
				String text1 = "String Concept";
				
				
				//Find the memory location/address of this text/text1 variable	
				System.out.println(System.identityHashCode(text));
				//System.out.println(System.identityHashCode(text));
				System.out.println(System.identityHashCode(text1));
				
				
				System.out.println(text);
				System.out.println(text1);
				
				//String class Method
				//1. equals() -return true or false
				System.out.println(text.equals(text1));
				//System.out.println(text.equals(text1));//equals function compare the value of two different variable(text & text1)
				
				System.out.println("-----------------------------");
				System.out.println(text == text1); //compares memory address of String variable
				
				System.out.println(System.identityHashCode(text));
				System.out.println(System.identityHashCode(text1));
				
				//2. Length()- return count of String
				//String text = "String Concept  ";
				String text2 = "Learning String";
				System.out.println(text2.length());
				
			//"I am" + "Mamun"; I am Mamun
				//3. Concat()- if you want to Concat (join more than one Strings) two String
				
				System.out.println(text.concat(text2)); 
					
				//If you want to concat different datatype variable, we use + 
					String num = "20";
					//String num1 ="30";
					int a = 10;
					int b = 20;
					System.out.println(num + a);
					
					System.out.println(a+b);
							
				//4. trim()- want to remove white space from both side of a String use- trim()
				String line = "    Java String concept    ";
					System.out.println(line);
					System.out.println(line.length());
					System.out.println(line.trim());
					//After use -trim()
					System.out.println(line.trim().length());
					System.out.println(line.length());
										
				//5. toLowerCase()- convert all of the String as LowerCase()
					String text4 = "Compares String";
					System.out.println(text4.toLowerCase());
								
					//toUpperCase()- convert all of the String as UpperCase()
					String text5 = "Compares String";
					System.out.println(text5.toUpperCase());
									
					
					//6.contains() -given String is available in entire String or not - return true/false
					System.out.println(text5.contains("mpa"));
					System.out.println(text5.contains("tex"));
					System.out.println(text5.contains("String"));				

	}

}

2. Codes CSS Selector:

package miscellaneousConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CSSselector_CreateLead {
	
	public static void main(String[] args) throws InterruptedException {
				
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 

			// maximize
			driver.manage().window().maximize();
						
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			// load URL
			driver.get("http://leaftaps.com/opentaps");

			// Enter Username - (Element level)
		driver.findElementByCssSelector("#username").sendKeys("DemoSalesManager");
			//driver.findElementById("username").sendKeys("DemoSalesManager");

			// driver.findElement(By.id("username")).sendKeys("DemoSalesManager");

			// Enter Password - (Element level)
			driver.findElementById("password").sendKeys("crmsfa");

			// Click Login Button - (Element level)
			//driver.findElementByClassName("decorativeSubmit").click();
			driver.findElementByCssSelector(".decorativeSubmit").click();
			// click crm/sfa link
			driver.findElementByLinkText("CRM/SFA").click();

			// click leads link
			driver.findElementByLinkText("Leads").click();
			

			// click create lead link

			//driver.findElementByLinkText("Create Lead").click();
			driver.findElementByPartialLinkText("Create").click();

			// company name
			//driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
			driver.findElementByCssSelector("#createLeadForm_companyName").sendKeys("TCS");
			
			// enter firstName			
			try {
				driver.findElementByCssSelector("input#createLeadForm_firstName").sendKeys("Hema");
			} catch (NoSuchElementException e) {
				System.out.println("The element not found");
			}
			Thread.sleep(2000);
			// throw new RuntimeException();

			// enter lastName
			driver.findElementByCssSelector("#createLeadForm_lastName").sendKeys("M");
			//driver.findElementByCssSelector("#createLeadForm_lastName").sendKeys("M");
			// driver.findElementById("createLeadForm_lastName").sendKeys("J");

			// enter firstName local
			driver.findElementByCssSelector("input#createLeadForm_firstNameLocal").sendKeys("H");
			// driver.findElementByXPath("//input[@id='createLeadForm_firstNameLocal']").sendKeys("H");

			// enter lastName local
			driver.findElementByXPath("//input[@id='createLeadForm_lastNameLocal']").sendKeys("M");

			// enter salutation
			driver.findElementByXPath("//input[@name='personalTitle']").sendKeys("Ms.");

			// Choose source
			WebElement src = driver.findElementById("createLeadForm_dataSourceId");
			Select dd = new Select(src);
			dd.selectByVisibleText("Website");

			// enter Title
			driver.findElementByXPath("//input[@name='generalProfTitle']").sendKeys("MS.");

			// enter Annual revenue
			driver.findElementByXPath("//input[@name='annualRevenue']").sendKeys("1000");

			// choose industry
			WebElement element = driver.findElementById("createLeadForm_industryEnumId");
			Select dd1 = new Select(element);
			dd1.selectByVisibleText("Insurance");

			// choose ownership
			WebElement ele = driver.findElementByName("ownershipEnumId");
			Select dd2 = new Select(ele);
			dd2.selectByVisibleText("Sole Proprietorship");

			// enter Sic code
			driver.findElementByXPath("//input[@name='sicCode']").sendKeys("1010");

			// enter description
			driver.findElementByXPath("//textarea[@name='description']").sendKeys("It is a Software Development company");

			// enter important note(using CssSelector)
			driver.findElementByCssSelector("textarea#createLeadForm_importantNote").sendKeys("It's a trusted company");
			// driver.findElementByXPath("//textarea[@name='importantNote']").sendKeys("It's
			// a trusted company");

			// enter country code
			driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneCountryCode']").sendKeys("0088");

			// enter area code
			driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneAreaCode']").sendKeys("682");
			
			//enter phone number
			driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneNumber']").sendKeys("2084048");;

			// enter extension
			driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneExtension']").sendKeys("101");

			// enter department
			driver.findElementByXPath("//input[@id='createLeadForm_departmentName']").sendKeys("QA");

			// choose preferred currency(dropdown)

			WebElement ele1 = driver.findElementById("createLeadForm_currencyUomId");
			Select dd3 = new Select(ele1);
			dd3.selectByVisibleText("BDT - Bangladesh Taka");

			// enter number of employees
			driver.findElementByXPath("//input[@id='createLeadForm_numberEmployees']").sendKeys("1000");

			// enter Ticker symbol
			driver.findElementByXPath("//input[@name='tickerSymbol']").sendKeys("Tk");

			// Enter Person to Ask For
			driver.findElementByXPath("//input[@name='primaryPhoneAskForName']").sendKeys("Hema");

			// Enter Web Url
			driver.findElementByXPath("//input[@name='primaryWebUrl']").sendKeys("www.google.com");

			// Enter To Name
			driver.findElementByXPath("//input[@name='generalToName']").sendKeys("M");

			// Enter Address Line 1 and 2
			driver.findElementByXPath("//input[@name='generalAddress1']").sendKeys("8821 Saddlehorn Dr");
			// address line 2
			driver.findElementByXPath("//input[@name='generalAddress2']").sendKeys("APT 252");

			// Enter City
			driver.findElementByXPath("//input[@id='createLeadForm_generalCity']").sendKeys("DAL");

			// Chose State/Province
			WebElement element3 = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
			Select dd4 = new Select(element3);
			dd4.selectByVisibleText("Texas");

			// Choose Country
			WebElement element4 = driver.findElementById("createLeadForm_generalCountryGeoId");
			Select dd5 = new Select(element4);
			dd5.selectByVisibleText("Bangladesh");

			// Enter Zip/Postal Code
			driver.findElementByXPath("//input[@id='createLeadForm_generalPostalCode']").sendKeys("75061");

			// Enter Zip/Postal Code Extension
			driver.findElementByXPath("//input[@id='createLeadForm_generalPostalCodeExt']").sendKeys("111");

			// Choose Marketing Campaign
			WebElement element5 = driver.findElementById("createLeadForm_marketingCampaignId");
			Select dd6 = new Select(element5);
			dd6.selectByVisibleText("Car and Driver");

			// Enter phone number
			driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("682-207-3636");

			// Enter email address
			driver.findElementById("createLeadForm_primaryEmail").sendKeys("hema_77@gmail.com");

			// Click Create lead
			driver.findElementByXPath("//input[@name='submitButton']").click();

			// Verify the first name(for verifying first name, we use getText() and stored
			// the value in firstName and print)

			String firstName = driver.findElementById("viewLead_firstName_sp").getText();
			System.out.println(firstName);

			//System.out.println("Element not found");

			if (firstName.equals("Hema")) {
				System.out.println("Name is Matched");
			} else {
				System.out.println("Not Match");
			}

			driver.close();
		}
*/
		
		
		
		
		
		
		
		
		
	}

}
