package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {
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
	
	@Test(priority = 1)
	public void googleTitleTest()
	{
		String title = driver.getTitle();
		String strTitle = "Google";
		Assert.assertEquals(title, strTitle,"title is not matched");
	}
	@Test(priority = 2)
	public void googleLogoTest()
	{
		boolean logo = driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed();
		Assert.assertEquals(logo, true,"logo is not displayed");
	}
	@AfterMethod
	public void tearDown()
	{
		//are used to quit browser
		driver.quit();
	}
}
