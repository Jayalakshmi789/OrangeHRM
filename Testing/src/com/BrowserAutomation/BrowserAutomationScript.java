package com.BrowserAutomation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserAutomationScript {

	public static void main(String[] args) 
	
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumPractice\\Testing\\driverFiles\\chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://facebook.com");
		
		System.setProperty("webdriver.gecko.driver", "D:\\UserDownloads\\geckodriver.exe");
		
		FirefoxDriver driver1=new FirefoxDriver();
		
		driver1.get("https://gmail.com");
		
		driver.close();
		driver1.close();
	}

}
