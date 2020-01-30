package com.NewTours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterElementNewtours {

	public static void main(String[] args) 
	
	{
		String url="http://www.newtours.demoaut.com/";
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");	
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to(url);
				
	    //<a href="mercuryregister.php">REGISTER</a>
		
		//WebElement register=driver.findElement(By.linkText("REGISTER"));
		
		WebElement register=driver.findElement(By.partialLinkText("REGI"));
		
		register.click();
		
	String	actual_RegisterwebpageTitle=driver.getTitle();
	
	System.out.println("The Actual title of the Register Webpage is: " + actual_RegisterwebpageTitle);
		
		driver.quit();
		
	}

}
