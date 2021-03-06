package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ParameterTest 
{
	WebDriver driver;
	
	@Parameters({"url","username","browser"})
	@Test
	public void yahooLoginTest(String url,String username,String browser)
	{
		
		
		if (browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","I:\\JavaProgram\\SeleniumCode\\src\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get(url);
		
		driver.findElement(By.name("username")).clear();  //clear the textfield
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("signin")).click();
	}
}
