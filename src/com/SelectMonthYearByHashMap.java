package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.*;

public class SelectMonthYearByHashMap {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","I:\\JavaProgram\\SeleniumCode\\src\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();

		Thread.sleep(8000);
		driver.findElement(By.id("month")).click();
		
		
		
		HashMap<String,String> month = SeleniumFunction.getMonth();
		String selectMnth = month.get("04");
		
		Select select = new Select(driver.findElement(By.id("month")));
		select.selectByVisibleText(selectMnth);
		
		/*
		List<WebElement> list = driver.findElements(By.tagName("option"));
		for(int i=0;i<list.size();i++)
		{
			String mth = list.get(4).getText();
			if(mth.equals(selectMnth))
			{
				list.get(4).click();
			}
		}
		*/
	}

}
