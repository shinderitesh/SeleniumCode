package com;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDropDown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","I:\\JavaProgram\\SeleniumCode\\src\\driver\\chromedriver.exe");
	
		
		//choose browser or open browser
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//open url
		driver.get("https://www.wikipedia.org/");
		
		Thread.sleep(4000);
		
		//1
		//driver.findElement(By.xpath("//select[@name='language']")).sendKeys("Italiano");
		
		//2 using api use Select class
		WebElement language = driver.findElement(By.xpath("//select[@name='language']"));
		Select select = new Select(language);
		
		//select by text value
		//select.selectByVisibleText("Italiano");
		
		//select by option value
		select.selectByValue("hi"); 
		
		
		//finding size of option value
		List<WebElement> list = select.getOptions();
		System.out.println("Size of Dropdown list : " +list.size());
		
		//Retrieve all the value present inside select tag.
		for(int i =0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
		}
	}

}
