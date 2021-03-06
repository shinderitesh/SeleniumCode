package com;

import java.io.*;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LoginFromProperties {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		
		File f = new File("I:\\JavaProgram\\SeleniumCode\\src\\config\\myData.properties");
		
		FileInputStream fis = new FileInputStream(f);
		
		Properties prop = new Properties();
		prop.load(fis);
		
		
		WebDriver driver = null;
		
		if(prop.getProperty("browser").equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","I:\\JavaProgram\\SeleniumCode\\src\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(prop.getProperty("browser").equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","I:\\JavaProgram\\SeleniumCode\\src\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else
		{
			driver = new InternetExplorerDriver();
		}
		     
		        driver.get(prop.getProperty("url"));
		
				driver.findElement(By.xpath(prop.getProperty("username"))).sendKeys(prop.getProperty("user"));
			
				driver.findElement(By.xpath(prop.getProperty("password"))).sendKeys(prop.getProperty("pass"));
				
				Thread.sleep(3000);
				
				driver.findElement(By.xpath(prop.getProperty("Login"))).click();
				
				//catch invalid credential text of user
				String text = driver.findElement(By.className("_9ay7")).getText();
				System.out.println("Error message : " +text);
	}

}
