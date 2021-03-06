package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElemebtVisibilityTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","I:\\JavaProgram\\SeleniumCode\\src\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://codepen.io/oomusou/pen/OMKZPZ");
		
		driver.switchTo().frame("CodePen");
		
		/*1. isDiplayed() method is applicable for all element,it will checked particular element
		 * is displayed or not if it displayed it returns true otherwise return false.
		 */
		boolean b1 = driver.findElement(By.id("myButton")).isDisplayed();
		System.out.println("isDisplayed " +b1); //true
		
		//2.isEnabled() :- means not clickable on button in this case we need to check an agreement
		boolean b2 = driver.findElement(By.id("myButton")).isEnabled();
		System.out.println("Before checkbox click " +b2); //false
		//check an agreement on clicking on checkbox
		driver.findElement(By.id("myCheckbox")).click();
		boolean b3 = driver.findElement(By.id("myButton")).isEnabled();
		System.out.println("After checkbox click " +b3); //true
		
		Thread.sleep(4000);
		
		//3.isSelected() applied only on checkbox,dropdown,radiobutton
		boolean b4 = driver.findElement(By.id("myCheckbox")).isSelected();
		System.out.println("After checkbox is select " +b4);
		
		Thread.sleep(4000);
		
		//deselect the checkbox
		driver.findElement(By.id("myCheckbox")).click();
		boolean b5 = driver.findElement(By.id("myCheckbox")).isSelected();
		System.out.println("After checkbox is deselected " +b5); //false
	}

}
