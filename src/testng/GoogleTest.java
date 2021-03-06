package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class GoogleTest 
{
	//Initialize the webdriver
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","I:\\JavaProgram\\SeleniumCode\\src\\driver\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}
	
	@Test(priority = 1,groups = "HomePage")
	public void googleTitleTest()
	{
		String title = driver.getTitle();
		System.out.println("Title : " +title);
	}
	@Test(priority = 2,groups = "HomePage")
	public void googleLogoTest()
	{
		boolean logo = driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed();
		System.out.println("Logo is displayed " +logo);
	}
	@Test(priority = 3,groups = "Email Link")
	public void verifyGmailLinkTest()
	{
		boolean link = driver.findElement(By.xpath("//a[text()='Gmail']")).isDisplayed();
		System.out.println("Link is displayed " +link);
	}
	@AfterMethod
	public void tearDown()
	{
		//are used to quit browser
		driver.quit();
	}
}
