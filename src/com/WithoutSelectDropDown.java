package com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutSelectDropDown {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","I:\\JavaProgram\\SeleniumCode\\src\\driver\\chromedriver.exe");
	
		
		//choose browser or open browser
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//open url
		driver.get("https://www.wikipedia.org/");
		
		Thread.sleep(4000);
		
		//without using Select class retrieve the value from dropdown box
		
		/*
		 * List<WebElement> language = driver.findElements(By.tagName("option"));
		 * for(int i =0;i<language.size();i++) {
		 * System.out.println(language.get(i).getText());
		 * System.out.println(language.get(i).getAttribute("lang")); }
		 */
		
		String category = "Bahaso Minangkabau"; //is coming from Excel sheet or database
		
		driver.findElement(By.xpath("//select[@name='language']")).click();
		
		List<WebElement> language =  driver.findElements(By.tagName("option"));
		for(int i =0;i<language.size();i++)
		{
			String cat = language.get(i).getText();
			System.out.println(cat);
			
			  if((language.get(i).getText()).contains(category)) 
			  {
				  language.get(i).click();
				  break; 
			  }
			 
			
		}
		
		
	}

}
