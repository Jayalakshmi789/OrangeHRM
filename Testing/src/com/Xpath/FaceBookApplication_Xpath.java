package com.Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FaceBookApplication_Xpath

{
    WebDriver driver=null;
    
    String url="https://www.facebook.com/";
    
    
    @BeforeTest
    public void signUp()
    {
    	System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
    	
    	driver=new ChromeDriver();
    	
    	driver.navigate().to(url);
    	
    	driver.manage().window().maximize();
    	
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    
    @Test
    public void logInFacebook()
    {
    	
    	//id="email"
    	
    	//*[@id='email']
    	WebElement userName=driver.findElement(By.xpath("//*[@id='email']"));
    	
    	userName.sendKeys("jaya@gmail.com");
    	
    	WebElement password=driver.findElement(By.xpath("//*[@id='pass']"));
    	
    	password.sendKeys("hellohello");
    	
    	//<input value="Log In" aria-label="Log In" data-testid="royal_login_button" type="submit" id="u_0_4">
    	
    	//*[@data-testid='royal_login_button']
    	
    	WebElement login=driver.findElement(By.xpath("//*[@data-testid='royal_login_button']"));
    	
    	login.click();
    	
    }
    
    @AfterTest
    public void tearDown()
    {
    	driver.quit();
    }
}
