package com.NewTours_LoginTest;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogInTest 

{
	
	public WebDriver driver=null;
	
	public String url="http://www.newtours.demoaut.com/";
	
	public String UserName="tutorial";
	public String Password="tutorial";
	
	@Given("^Open Chrome Browser and Navigate To NewTours Application$")
	public void open_Chrome_Browser_and_Navigate_To_NewTours_Application() throws Throwable 
	{
	    System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
	    
	    driver=new ChromeDriver();
	    
	    driver.navigate().to(url);
	    
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	/*@When("^User enters UserName and Password and Click on SignIn Button$")
	public void user_enters_UserName_and_Password_and_Click_on_SignIn_Button() throws Throwable 
	{
	    
		WebElement userName=driver.findElement(By.name("userName"));
		
		userName.sendKeys(UserName);
		
		WebElement password=driver.findElement(By.name("password"));
		
		password.sendKeys(Password);
		
		driver.findElement(By.name("login")).click();
	}*/
	
	@When("^User enters \"(.*?)\" and \"(.*?)\" and Click on SignIn Button$")
	public void user_enters_and_and_Click_on_SignIn_Button(String UserName, String Password) throws Throwable {
		
      WebElement userName=driver.findElement(By.name("userName"));
		
		userName.sendKeys(UserName);
		
		WebElement password=driver.findElement(By.name("password"));
		
		password.sendKeys(Password);
		
		driver.findElement(By.name("login")).click();
	    
	}

	@Then("^User Should be able to successfully LogIn to the Application and Close the Application$")
	public void user_Should_be_able_to_successfully_LogIn_to_the_Application_and_Close_the_Application() throws Throwable
	{
		try{
			String expected_Title="Find a Flight";
	System.out.println("The expected Title is :"+expected_Title);
	
	String actual_Title=driver.getTitle();
	
	System.out.println("the actual title is :"+actual_Title);
	
	if(actual_Title.contains(expected_Title))
	{
		System.out.println("Successfully logIn - PASS");
	}
	
	String expected_Title1="Sign-on: Mercury Tours";
	String actual_Title1=driver.getTitle();
	if(actual_Title1.contains(expected_Title1))
	{
		File screenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenShot, new File("./ScreenShot/img.png"));
		
		System.out.println("LogIn Failed - FAIL");
		driver.quit();
	}
	}
	catch(Exception e)
	{
		String expected_Title="Sign-on: Mercury Tours";
		String actual_Title=driver.getTitle();
		if(actual_Title.contains(expected_Title))
		{
			File screenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenShot, new File("./ScreenShot/img.png"));
			
			System.out.println("LogIn Failed - FAIL");
			driver.quit();
		}
		
		
	}
	driver.quit();

	
	}


}
