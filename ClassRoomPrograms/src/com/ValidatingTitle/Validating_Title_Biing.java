package com.ValidatingTitle;

import org.openqa.selenium.chrome.ChromeDriver;

public class Validating_Title_Biing {

	public static void main(String[] args) {
		
String url="http://bing.com";
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//driver.get(url);
		
		driver.navigate().to(url);
	
		String expected_BingHomePageTitle="bing";
System.out.println(" The expected Bing Home Page title is : "+expected_BingHomePageTitle);
		
		String actual_BingHomePageTitle=driver.getTitle();
	System.out.println(" The Title of the Bing Home Page is : "+actual_BingHomePageTitle);
		
		//if(actual_BingHomePageTitle.equals(expected_BingHomePageTitle))
	if(actual_BingHomePageTitle.equalsIgnoreCase(expected_BingHomePageTitle))
		{
			System.out.println(" Title Matched - PASS");
		}
		else
		{
			System.out.println(" Title Not Matched - FAIL");
		}
	
	driver.quit();

}
}
