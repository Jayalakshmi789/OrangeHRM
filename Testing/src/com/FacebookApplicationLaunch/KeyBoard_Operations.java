package com.FacebookApplicationLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoard_Operations {

	public static void main(String[] args) 
	
	{
		
		String url="https://facebook.com";
		 
	    System.setProperty("webdriver.chrome.driver", "D:\\UserDownloads\\chromedriver.exe");
	   
	   ChromeDriver driver=new ChromeDriver();
	   
	   driver.navigate().to(url);
	   
	   WebElement email=driver.findElement(By.id("email"));
	   
	   email.sendKeys("jaya@gmail.com");
	   
	   Actions act=new Actions(driver);
	   
	   act.sendKeys(Keys.TAB).perform();
	   
	   act.sendKeys("jaya");
	   
	   act.sendKeys(Keys.ENTER).perform();
	   
	}

}
