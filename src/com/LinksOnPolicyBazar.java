package com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksOnPolicyBazar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","I:\\JavaProgram\\SeleniumCode\\src\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.policybazaar.com/home-v6/index.php");
		
		
		  System.out.println("-----------All links--------------------------------------------");
		  //retriev all links 
		  List<WebElement> link = driver.findElements(By.tagName("a"));
		  System.out.println("Total number of links on Home Page of Policy Bazar : "+link.size());
		  
		  
		  for(int i=0;i<link.size();i++) { System.out.println(link.get(i).getText());
		  
		  if(link.get(i).getText().contains("Motor Insurance")) {
		  System.out.println("Pass"); break; } }
		 
		
		System.out.println("------------Retrieve links from particular tag-----------------------------");
		
		//finding xpath of particular link
		WebElement myLinks = driver.findElement(By.xpath("//section[@class='moreInsurance']"));
		
		List<WebElement> divLink = myLinks.findElements(By.tagName("a"));
		System.out.println("Total number of links present in div tag Home Page of Policy Bazar : " +divLink.size());
		
		
		for(int i=0;i<divLink.size();i++)
		{
			System.out.println(divLink.get(i).getText());
		}
	}

}
