package com;

import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderSelectTest {
	
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","I:\\JavaProgram\\SeleniumCode\\src\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
 
		String date = "19/02/2021";
		String dateArray[] = date.split("/");
		String day = dateArray[0];
		String month = dateArray[1];
		String year = dateArray[2];
		
		System.out.println(day + " " +month+" " +year);
		
		driver.findElement(By.xpath("//input[@class='ng-tns-c59-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']")).click();
		
		//*[@id="jDate"]/span/div/div/div[2]/table/tbody/tr[3]/td[3]
		//*[@id="jDate"]/span/div/div/div[2]/table/tbody/tr[3]/td[4]
		//*[@id="jDate"]/span/div/div/div[2]/table/tbody/tr[3]/td[5]
		
		//*[@id="jDate"]/span/div/div/div[2]/table/tbody/tr[4]/td[1] 
		//*[@id="jDate"]/span/div/div/div[2]/table/tbody/tr[4]/td[2]
		
		//*[@id="jDate"]/span/div/div/div[2]/table/tbody/tr[5]/td[1] 
		
		String before_xpath = "//*[@id=\"jDate\"]/span/div/div/div[2]/table/tbody/tr[";
		String after_xpath = "]/td[";
		boolean flag = false;
		String dayVal ="";
		for(int rowNum = 3;rowNum<=5;rowNum++)
		{
			for(int colNum=3;colNum<=4;colNum++)   ////*[@id=\"jDate\"]/span/div/div/div[2]/table/tbody/tr[3]//td[5]
			{
				try
				{
				 dayVal = driver.findElement(By.xpath(before_xpath+rowNum+after_xpath+colNum+"]")).getText();
				 flag=true; 
				 break;
				}catch(NoSuchElementException ne)
				{
					System.out.println("Incorrect Date");
				}
				System.out.println(dayVal);
				
				 
				 
				
				  if(day.equals(dayVal)) 
					{
						driver.findElement(By.xpath(before_xpath+rowNum+after_xpath+colNum+"]")).click();
						flag = true;
						break;  //to break inner loop
					}
			}
			if(flag)
			{
				break; //to break outer loop
			}
		}
		
	}
}
