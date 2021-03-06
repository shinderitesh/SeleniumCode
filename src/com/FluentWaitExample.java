package com;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWaitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","I:\\JavaProgram\\SeleniumCode\\src\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.policybazaar.com/home-v6/index.php");
		
		//click on sigin link
		driver.findElement(By.xpath("//a[@class='sign-in']")).click();
		//enter mobile number
		driver.findElement(By.xpath("//input[@name='mobNo']")).sendKeys("8329626848");
		//click on password button
		driver.findElement(By.xpath("//span[text()='LOGIN WITH PASSWORD']")).click();
		System.out.println(driver.getTitle());
	
		 
		//enter password
		//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("8329626848");
		
		 // Waiting 30 seconds for an element to be present on the page, checking
		   // for its presence once every 5 seconds.
		   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		       .withTimeout(30, TimeUnit.SECONDS)  //pause
		       .pollingEvery(250, TimeUnit.MICROSECONDS)  //until element is visible
		       .ignoring(NoSuchElementException.class);

		   WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		    	 WebElement ele = driver.findElement(By.xpath("//input[@name='password']"));
		    	 ele.sendKeys("8329626848");
		    	 return ele;
		     }
		   });
		

		 
	}

}
