package com.Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Facebook_LogIn {
	

	//Global Declaration
	WebDriver driver = null;
	String url="http://facebook.com";
	
	@BeforeTest
	public void setUp()
	{		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.navigate().to(url);
		driver.manage().window().maximize();
		
// Implicit wait - will be applicable to all the elements of every Webpage under test
		// if an element is found within the time declared then webDriver will not wait for
 // the rest of the time - it automates the element immediately
	// ImplicitlyWait is a global wait	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(priority=1)
	public void logIn()
	{
		
	// <input type="email"  data-testid="royal_email">
	// <input type="email" class="inputtext login_form_input_box" name="email" id="email" data-testid="royal_email">	
		
		//WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
		//WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		WebElement email=driver.findElement(By.xpath("//*[@id='email']"));
		//                                            //*[@id="email"]
		
		email.sendKeys("srini.qatrainer@gmail.com");
		
	// <input type="password" class="inputtext login_form_input_box" name="pass" id="pass" data-testid="royal_pass">
	WebElement password=driver.findElement(By.xpath("//*[@class='inputtext login_form_input_box' and @data-testid='royal_pass']"));
	password.sendKeys("testing");
		
		
	}
	
}
