package c_18C1_C2_TestNG_Demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationOrder24 {

	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest");
	}
	
	@BeforeClass 
	public void beforeClass() {
		System.out.println("beforeClass");
	}
	
	@BeforeSuite 
	public void beforeSuite(){
		System.out.println("beforeSuite");
	}
	
	@BeforeMethod 
	public void beforeMethod() {
		System.out.println("beforeMethod");
	}
	
	@AfterClass 
	public void afterClass() {
		System.out.println("afterClass");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod");
	}
	
	@AfterSuite 
	public void afterSuite() {
		System.out.println("afterSuite");
	}
	
	
	
	@AfterTest
	public void afterTest() {
		System.out.println("afterTest");
	}
	
	@Test (priority = 1)
	public void test1() {
		System.out.println("Execute test1");
	}
	
	@Test 
	public void test() {
		System.out.println("Execute test");
	}
	
	@Test (priority = 2)
	public void test2() {
		System.out.println("Execute test2");
	}
	
	@Test (priority = -1)
	public void test3() {
		System.out.println("Execute test3");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
