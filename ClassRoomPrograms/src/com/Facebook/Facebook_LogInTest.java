package com.Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_LogInTest {

	public static void main(String[] args) {
		
String url="http://facebook.com";
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//driver.get(url);
		
		driver.navigate().to(url);
		
 // <input id="email" data-testid="royal_email">
		
	 //  locator = id
	//	 selector = email
		
		driver.findElement(By.id("email")).sendKeys("65465465465");

// <input  id="pass" data-testid="royal_pass">
		
	driver.findElement(By.id("pass")).sendKeys("hello");	
	
// <label class="login_form_login_button uiButton uiButtonConfirm" id="loginbutton" for="u_0_b"><input value="Log In" aria-label="Log In" data-testid="royal_login_button" type="submit" id="u_0_b"></label>
	
   driver.findElement(By.id("loginbutton")).click();	
	}

}
