package testng;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SeleniumFunction;

public class FacebookLoginTest {
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
		driver.get("https://www.facebook.com/");
	}
	
	@Test(priority = 1,groups = "LoginValidPage")
	public void validCredentialTest()
	{
		HashMap<String,String> login = SeleniumFunction.doLogin();
		String user1 = login.get("user1");  //shinderitesh@gmail.com:admin123
		String userCred1[] = user1.split(":");
	
		System.out.println("Username " +userCred1[0]);
		System.out.println("Password " +userCred1[0]);
		
		driver.findElement(By.id("email")).sendKeys(userCred1[0]);
	
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(userCred1[1]);
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		String text = driver.findElement(By.className("_9ay7")).getText();
		System.out.println("Error message : " +text);
	}

	@Test(priority = 2,groups = "LoginInValidPage")
	public void inValidCredentialTest()
	{
		HashMap<String,String> login = SeleniumFunction.doLogin();
		String user1 = login.get("user2");  //shinderitesh@gmail.com:admin123
		String userCred1[] = user1.split(":");
	
		System.out.println("Username " +userCred1[0]);
		System.out.println("Password " +userCred1[0]);
		
		driver.findElement(By.id("email")).sendKeys(userCred1[0]);
	
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(userCred1[1]);
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		String text = driver.findElement(By.className("_9ay7")).getText();
		System.out.println("Error message : " +text);
	}
	
	@AfterMethod
	public void tearDown()
	{
		//are used to quit browser
		driver.quit();
	}
}
