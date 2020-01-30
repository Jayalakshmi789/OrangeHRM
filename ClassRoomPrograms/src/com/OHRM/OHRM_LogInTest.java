package com.OHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OHRM_LogInTest {

	public static void main(String[] args) throws InterruptedException  {
		
		String url="http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";
		WebDriver driver = null;
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		 driver = new ChromeDriver();
		
		// Browser Maximize
				 driver.manage().window().maximize();
				 
				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		driver.navigate().to(url);
		
		// Validating LogIn Page
		
		WebElement userName=driver.findElement(By.id("txtUsername"));
		userName.sendKeys("admin");
		
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.sendKeys("password");
		
		WebElement logInButton=driver.findElement(By.id("btnLogin"));
		logInButton.click();

		String expected_HomePageUserNameText="Admin";
		System.out.println(" The Text of the UserName is : "+expected_HomePageUserNameText);
		
		// <a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
		WebElement homePageUserText_Element=driver.findElement(By.id("welcome"));
		String actual_homePageUserText=homePageUserText_Element.getText();
		
		if(actual_homePageUserText.contains(expected_HomePageUserNameText))
		{
			System.out.println(" LogIN Successfull- PASS");
		}
		else
		{
			System.out.println(" LogIN FAIL - FAIL");
		}
		
		homePageUserText_Element.click();
		
		// Automating LogOut Element
		// <a href="/orangehrm-4.0/symfony/web/index.php/auth/logout">Logout</a>
		
		//Thread.sleep(10000); // Explicit wait
		
		WebElement logOut=driver.findElement(By.linkText("Logout"));
		logOut.click();
		
		// validating Login page
		
		driver.quit();
	 
		
	}

}
