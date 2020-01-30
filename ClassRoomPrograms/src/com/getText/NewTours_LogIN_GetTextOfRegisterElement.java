package com.getText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours_LogIN_GetTextOfRegisterElement {

	public static void main(String[] args) {
		
	String url="http://newtours.demoaut.com";
		WebDriver driver = null;
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		 driver = new ChromeDriver();
				
		driver.navigate().to(url);
		
		// <a href="mercuryregister.php">REGISTER</a>
	WebElement 	register=driver.findElement(By.linkText("REGISTER"));
	
	String linkName=register.getText();
	System.out.println(" The text of an Element Register is : "+linkName);
	
	register.click();
		
	driver.quit();

	}

}
