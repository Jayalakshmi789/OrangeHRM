package com.OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LocalOHRMLaunch {

	public static void main(String[] args) 
	
	{
		String url="http://localhost/orangehrm/symfony/web/index.php/auth/login";
		
		WebDriver driver=null;
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.navigate().to(url);
		
		WebElement userName=driver.findElement(By.id("txtUsername"));
		
		userName.sendKeys("jaya");
		
		Actions act=new Actions(driver);
		
		act.sendKeys(Keys.TAB).perform();
		
		act.sendKeys("jaya1234").perform();
		
		act.sendKeys(Keys.ENTER).perform();
		
	//	driver.quit();

	}

}
