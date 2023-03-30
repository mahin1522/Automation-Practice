package sqa001.practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGEg{
	
	@BeforeSuite
	public void BeforeSuiteEg(){
		System.out.println("Before Suite Example");
		}
	
	@AfterSuite
	public void AfterSuiteEg() {
		System.out.println("After Suite Example");
	}
	
	@Test(priority = 1)
	public void test1() {
		System.out.println("Test...............1");
	}
	
	@Test(priority = 0)
	public void test2() {
		System.out.println("Test...............2");
	}
	
	@BeforeTest
	public void BeforeTestEg() {
		System.out.println("Before Test Done");
	}
	
	@BeforeClass
	public void BeforeclassEg() {
		System.out.println("Before Class Tested");
	}
	
	@AfterClass
	public void AfterclassEg() {
		System.out.println("After Class Tested");
	}
	
	@BeforeMethod
	public void Beforemethod() {
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void Aftermethod() {
		System.out.println("After Method");
	}
	
	@AfterTest
	public void AfterTest() {
		System.out.println("After Test Done");
	}
}
