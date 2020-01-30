package com.CapturingURL;

import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingURL_FacebookLogInPage {

	public static void main(String[] args) {
		
		String url="http://facebook.com";
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//driver.get(url);
		
		driver.navigate().to(url);
		
		String actual_facebookLogInUrl=driver.getCurrentUrl();
		System.out.println(" The actual URL address of Facebook LogIn Page is : "+actual_facebookLogInUrl);
		
		System.out.println(url);
		
		driver.quit();

	}

}
