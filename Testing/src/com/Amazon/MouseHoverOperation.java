package com.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverOperation {

	public static void main(String[] args) 
	
	{
		String url="https://amazon.com";
		
		WebDriver driver=null;
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to(url);
		
		//<span class="nav-line-1">Hello. Sign in</span>
		
	WebElement	hello_SignIn=driver.findElement(By.id("nav-link-accountList"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(hello_SignIn).perform();
		
		//<span class="nav-text">Your Orders</span>
		
		WebElement yourorders=driver.findElement(By.linkText("Your Orders"));
		
		yourorders.click();
		
		driver.quit();

	}

}
