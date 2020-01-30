package com.linkTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours_LogIn_DisplayLinkNames {

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

  <input type="image" >
		 */

		// finding all the elements on the wepage which are of type links with tag name 'a'
		List<WebElement>links=driver.findElements(By.tagName("a"));

// finding all the links and saving into an arrayList - "links"
// since elements are getting saved into "links" - it should be declared as WebElement
//Since more than One Element is getting saved into "links"-it is declared as List(arrayList)		

		int linksCount=links.size(); // finding the size of arrayList(links)
		
System.out.println(" The total number of links on the NEwTours LogIn page are : "+linksCount);
		
// printing out all the link Names as an outPut - Elements which are found of type links 
		for(int i=0;i<linksCount;i++)
		{
			String linkName=links.get(i).getText(); // getting every index value 
			System.out.println(i+"  "+linkName);// printing the name of the link with index
		}

	driver.quit();
	}
}
