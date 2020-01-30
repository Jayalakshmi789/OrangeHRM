package com.MouseOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_HelloSignIn_MouseHover_Operation {

	public static void main(String[] args) {
		

		String url="http://amazon.in";
		WebDriver driver = null;
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		 driver = new ChromeDriver();
				
		driver.navigate().to(url);
		
		// id="nav-link-accountList" - hello SignIn Element property
		WebElement helloSingIn=driver.findElement(By.id("nav-link-accountList"));
		
		// Actions - is used to perform both Mouse and keyBoard related Operations 
		
		Actions act = new Actions(driver);
		act.moveToElement(helloSingIn).perform();
		
			
		// automating element - "Your Orders"
		WebElement yourOrders=driver.findElement(By.linkText("Your Orders"));
		yourOrders.click();
		
			

	}

}
