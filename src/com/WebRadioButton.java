package com;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebRadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","I:\\JavaProgram\\SeleniumCode\\src\\driver\\chromedriver.exe");
	
		//choose browser or open browser
WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		//implicit wait global wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
//open url
		driver.get("https://www.facebook.com/");

//to click on Create account
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();

//Thread.sleep(8000); //hard wait script 

 List<WebElement> radio_button = driver.findElements(By.name("sex"));
 //SeleniumFunction.explicitWait(driver,radio_button,20);
 
 System.out.println(radio_button.size());
 
 System.out.println(radio_button.get(0).getAttribute("value"));

 //before click on radio button checked whether it clicked or not
 System.out.println(radio_button.get(1).getAttribute("checked")); //null
 
  //click on male
 radio_button.get(1).click();

 //need to checked validation whether radio button is checked or not after clicked
System.out.println(radio_button.get(1).getAttribute("checked")); //true
	}

}
