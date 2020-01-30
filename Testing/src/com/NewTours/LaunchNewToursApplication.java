package com.NewTours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchNewToursApplication {

	public static void main(String[] args) 
	
	{
		String url="http://www.newtours.demoaut.com/";
	      
	     System.setProperty("webdriver.chrome.driver", "D:\\UserDownloads\\chromedriver.exe");
	     
	     WebDriver driver=new ChromeDriver();
	      
	     driver.get(url);
	     
	     //<input type="text" name="userName" size="10">
	     
	     driver.findElement(By.name("userName")).sendKeys("tutorial");
	     
	     //<input type="password" name="password" size="10">
	     
	     WebElement password=driver.findElement(By.name("password"));
	     
	     password.sendKeys("srini");
	     
	   //  <input type="image" name="login" value="Login" >
	     
	     WebElement signin=driver.findElement(By.name("login"));
	     
	     signin.click();
	     
	     String expected_NewtoursTitle="Find";
	     
	     System.out.println("The Expected Title of the NewTours is:"+expected_NewtoursTitle);
	     
	     String actual_NewtoursTitle=driver.getTitle();
	     
	     System.out.println("The Actual title of the NewTours is:"+actual_NewtoursTitle);
	     
	     if(actual_NewtoursTitle.contains(expected_NewtoursTitle))
	     {
	    	 System.out.println("Login Success-PASS");
	     }
	     
	     else
	     {
	    	 System.out.println("Login Fail-FAIl");
	     }
	     
	    // driver.quit();
	}

}
