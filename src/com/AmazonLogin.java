package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLogin {

	public static void main(String[] args)  {
		
		//import chrome driver from path
	System.setProperty("webdriver.chrome.driver","I:\\JavaProgram\\SeleniumCode\\src\\driver\\chromedriver.exe");
			
				//choose browser or open browser
				WebDriver driver = new ChromeDriver();
				
				//open url
				driver.get("https://www.amazon.in/");
				
				driver.findElement(By.xpath("//span[text()='Hello, Sign in']")).click();
				
				
				
				driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9421020247");
				driver.findElement(By.xpath("//input[@id='continue']")).click();
				driver.findElement(By.name("password")).sendKeys("9421020247");
				driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
	}

}
