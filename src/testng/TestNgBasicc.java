package testng;

import org.testng.annotations.*;

public class TestNgBasicc 
{
	//pre condtion
	@BeforeSuite
	public void setUp()
	{
		System.out.println("Install and setup for chrome browser");
	}
	
	@BeforeTest
	public void launchBrowser()
	{
		System.out.println("Browser is launch");
	}
	
	@BeforeClass
	public void login()
	{
		System.out.println("login to app");
	}
	
	

	@BeforeMethod
	public void enterUrl()
	{
		System.out.println("Url is enetered");
	}
	
	
	//testcase
	@Test
	public void googleTitle()
	{
		System.out.println("Google title is displayed");
	}
	
	@Test
	public void sigin()
	{
		System.out.println("Sigin into gmail");
	}
	
	//post condition
	@AfterMethod
	public void logout()
	{
		System.out.println("Logout");
	}
	
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("Browser is closed");
	}
	@AfterSuite
	public void generateTestReport()
	{
		System.out.println("Report is generated");
	}
}
