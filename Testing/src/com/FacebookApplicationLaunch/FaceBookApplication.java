package com.FacebookApplicationLaunch;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookApplication {

	public static void main(String[] args)
	
	{
   String url="https://facebook.com";
 
    System.setProperty("webdriver.chrome.driver", "D:\\UserDownloads\\chromedriver.exe");
   
   ChromeDriver driver=new ChromeDriver();
   
   driver.navigate().to(url);
   
  
    
    String expected_FacebookLoginURL="facebook.com";
    
String actual_FacebookLoginURL =driver.getCurrentUrl();

System.out.println(actual_FacebookLoginURL);
 
 
 if(actual_FacebookLoginURL.contains(expected_FacebookLoginURL))
 {
	 System.out.println("URL is Matched--PASS");
 }
 else
 {
	 System.out.println("URL is not Matched--FAIL");
 }
 
 String expected_FacebookLoginpageTitle="facebook";
  String actual_FacebookLoginpageTitle=driver.getTitle();
  
  System.out.println(actual_FacebookLoginpageTitle);
  
  if(actual_FacebookLoginpageTitle.equals(expected_FacebookLoginpageTitle))
  {
	  System.out.println("Title is Matched************  PASS");
  }
  else
  {
	  System.out.println("Title is not matched");
  }
 
 driver.findElement(By.id("email")).sendKeys("jayalakshmisomu17@gmail.com");

 driver.findElement(By.id("pass")).sendKeys("jaya@par");
 
 driver.findElement(By.id("loginbutton")).click();
	}

}
