package com.NewTours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod {

	public static void main(String[] args) 
	
	{
		String url="http://www.newtours.demoaut.com/";
		
		WebDriver driver=null;
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.navigate().to(url);
		
	    WebElement	register=driver.findElement(By.linkText("REGISTER"));
	
        String 	registerText=register.getText();

           System.out.println(registerText);
           
           String expected_Url=register.getAttribute("href");
           
           System.out.println(expected_Url);
           
           register.click();
           
          String actual_WebpageUrl= driver.getCurrentUrl();
          
          System.out.println(actual_WebpageUrl);
          
          if(actual_WebpageUrl.equals(expected_Url))
          {
        	  System.out.println("Successfully launched the Register Page - PASS");
          }

          else
          {
        	  System.out.println("Failed to launch Register Page - FAIL");
          }

               driver.quit();
		

	}

}
