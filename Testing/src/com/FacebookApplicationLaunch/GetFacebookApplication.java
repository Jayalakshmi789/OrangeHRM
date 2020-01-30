package com.FacebookApplicationLaunch;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetFacebookApplication {

	public static void main(String[] args)
	
	{
		/*System.setProperty("webdriver.gecko.driver", "D:\\UserDownloads\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();*/
		
		//Automating chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\UserDownloads\\chromedriver.exe");
		
		//creating object for chromedriver class
		ChromeDriver driver=new ChromeDriver();
		
		//launch the facebook application
		driver.get("https://facebook.com");
		
		//close the current browser
		driver.close();
	}

}
