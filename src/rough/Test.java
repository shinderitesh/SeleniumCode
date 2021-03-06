package rough;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","I:\\JavaProgram\\SeleniumCode\\src\\driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.wikipedia.org/");
		
		Thread.sleep(4000);
		
		String str = "Bahaso Minangkabau";
		
		
		
		//need to ask sir/ wrong value is getting selected 
		driver.findElement(By.xpath("//select[@id='searchLanguage']")).sendKeys(str);
		
		//driver.findElement(By.xpath("//select[@id='searchLanguage']")).sendKeys("Italiano");
		
		//below path is used by sir for same action
		//driver.findElement(By.xpath("//select[@name='language']")).sendKeys("Italiano");

	}

}
