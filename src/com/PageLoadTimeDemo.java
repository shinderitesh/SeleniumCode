package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","I:\\JavaProgram\\SeleniumCode\\src\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		 driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
		//time.pageLoadTimeout(15,TimeUnit.SECONDS); 
		
		driver.get("https://www.google.com");
		
	}

}
