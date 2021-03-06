package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","I:\\JavaProgram\\SeleniumCode\\src\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://datatables.net/");
		
		//*[@id="example"]/tbody/tr[1]
		//*[@id="example"]/tbody/tr[2]
		//*[@id="example"]/tbody/tr[3]
		//*[@id="example"]/tbody/tr[4]
		//*[@id="example"]/tbody/tr[5]
		
		/*
		  // Method 1
		 
		String before_xpath = "//*[@id=\"example\"]/tbody/tr[";
		String after_xpath = "]";
		
		for(int i=1;i<=10;i++)
		{                                          //*[@id="example"]/tbody/tr[1]
			String name = driver.findElement(By.xpath(before_xpath+i+after_xpath)).getText();
			System.out.println(name);
			if(name.contains("Bradley Greer"))
			{
				System.out.println("Name 'Bradley Greer' is found");
				break;
			}
		}
		*/
		
		//Method 2 customize xpath
		
	String name = driver.findElement(By.xpath("//td[contains(text(),'Brenden Wagner')]/parent::tr")).getText();
	System.out.println("Name : " +name);
	
	if(name.contains("Brenden Wagner"))
	{
		System.out.println("Name 'Brenden Wagner' is found");
	
	}
	}
}
