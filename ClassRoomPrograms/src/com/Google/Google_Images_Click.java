package com.Google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Images_Click {

	public static void main(String[] args) {
		
		String url="http://google.com";
		WebDriver driver = null;
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		 driver = new ChromeDriver();
				
		driver.navigate().to(url);
		
//<a class="gb_g" data-pid="2" href="https://www.google.co.in/imghp?hl=en&amp;tab=wi&amp;ogbl">Images</a>
	// <a class="gb_g" data-pid="2" href="https://www.google.co.in/imghp?hl=en&amp;tab=wi&amp;ogbl">Images</a>
		
//<a class="gb_g" data-pid="23" href="https://mail.google.com/mail/?tab=rm&amp;ogbl">Gmail</a>	
		
		//WebElement images=driver.findElement(By.className("gb_g"));
		WebElement images=driver.findElement(By.linkText("Images"));
		
		images.click();		
		String images_WebPageTitle=driver.getTitle();
		System.out.println(" The title of Images WebPage Title is : "+images_WebPageTitle);

	}

}
