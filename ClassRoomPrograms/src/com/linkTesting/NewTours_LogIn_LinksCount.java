package com.linkTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours_LogIn_LinksCount {

	public static void main(String[] args) {
		

		String url="http://newtours.demoaut.com";
		WebDriver driver = null;
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		 driver = new ChromeDriver();
				
		driver.navigate().to(url);
		
		/*
  <a href="mercurysignon.php">SIGN-ON</a>
  <a href="mercuryregister.php">REGISTER</a>
  <a href="mercuryunderconst.php">SUPPORT</a>

  <input type="text" name="userName" size="10">

  <input type="image" name="login" value="Login" src="/images/btn_signin.gif" width="58" height="17" alt="Sign-In" border="0">
		 */

		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		int linksCount=links.size();
		
		System.out.println(" The total number of links on the NEwTours LogIn page are : "+linksCount);
		
		driver.quit();
		
	}

}
