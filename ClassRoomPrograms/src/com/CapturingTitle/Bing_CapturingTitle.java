package com.CapturingTitle;

import org.openqa.selenium.chrome.ChromeDriver;

public class Bing_CapturingTitle {

	public static void main(String[] args) {
		
		String url="http://bing.com";
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//driver.get(url);
		
		driver.navigate().to(url);
		
		String actual_BingHomePageTitle=driver.getTitle();
	System.out.println(" The Title of the Bing Home Page is : "+actual_BingHomePageTitle);
		
		driver.quit();
	}
}
