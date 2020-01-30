package com.LaunchingFacebookApplication;

import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookBook_LogInPage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://facebook.com");
		
		driver.get("http://google.com");
		
		//driver.close();
		

	}

}
