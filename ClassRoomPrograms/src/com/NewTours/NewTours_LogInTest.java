package com.NewTours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours_LogInTest {

	public static void main(String[] args) {
		
		String url="http://newtours.demoaut.com";
		WebDriver driver = null;
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		 driver = new ChromeDriver();
				
		driver.navigate().to(url);
		
	// <input type="text" name="userName" size="10">
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		
  // <input type="password" name="password" size="10">
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("srini");
		
 // <input type="image" name="login" value="Login" src="/images/btn_signin.gif?osCsid=62569422c1b0d0a5be6140908ed45426" width="58" height="17" alt="Sign-In" border="0">
	WebElement signIn=driver.findElement(By.name("login"));
	signIn.click();
		
		
		String expected_HomePageTitle="Find";
System.out.println("The expected Title of the New Tours Home Page is:"
																+expected_HomePageTitle);
		
		String actual_WebPageTitle=driver.getTitle();
System.out.println(" The actual title of the NewTours WebPage is :"+actual_WebPageTitle );
		
		if(actual_WebPageTitle.contains(expected_HomePageTitle))
		{
			System.out.println(" LogIN Successfull - PASS");
		}
		else
		{
			System.out.println(" LogIn Failed - FAIL");
		}
		
		driver.quit();
	}

}
