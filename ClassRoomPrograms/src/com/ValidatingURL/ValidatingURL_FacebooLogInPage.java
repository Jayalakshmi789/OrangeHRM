package com.ValidatingURL;

import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingURL_FacebooLogInPage {

	public static void main(String[] args) {
		
String url="http://facebook.com";
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//driver.get(url);
		
		driver.navigate().to(url);
		
		// Expected url address of the Facebook LogIn Page
		String expected_FacebookLogInPageURL="facebook.com";
System.out.println("The expected URL address of Facebook LogIn Page is:"+expected_FacebookLogInPageURL);
		
		// capturing the Current url address of the Faebook LogIn Page
		String actual_FacebookLogInUrl=driver.getCurrentUrl();
System.out.println("The actual URL address of Facebook LogIn Page is:"+actual_FacebookLogInUrl);
		
		if(actual_FacebookLogInUrl.contains(expected_FacebookLogInPageURL))
		{
			System.out.println(" URL matched - PASS");
		}
		else
		{
			System.out.println(" URL not matched - FAIL ");
		}
		
		driver.quit();
	}
}
