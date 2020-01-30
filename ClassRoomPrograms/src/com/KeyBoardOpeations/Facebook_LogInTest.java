package com.KeyBoardOpeations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook_LogInTest {

	public static void main(String[] args) {
		
		String url="http://facebook.com";
		WebDriver driver = null;
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		 driver = new ChromeDriver();
				
		driver.navigate().to(url);
		
 //<input type="email" class="inputtext login_form_input_box" name="email" id="email" data-testid="royal_email">
		
	WebElement email=driver.findElement(By.id("email"));
	email.sendKeys("srini@gmail.com");
	
	Actions act = new Actions(driver);
	
	// moving the focus to Password Element 
	act.sendKeys(Keys.TAB).perform();;
		
	// automating the password element without the properties of it - bocoz the focus of the
	// cursor is at Password element - so directly automating it
	act.sendKeys("testing").perform();

	// Automating LogIn Button
	act.sendKeys(Keys.ENTER).perform();

	}

}
