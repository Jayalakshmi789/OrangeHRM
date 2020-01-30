package com.webtable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SingleCity_TimeAndDate_Webtable 

{
            WebDriver driver=null;
            
            String url="https://www.timeanddate.com/worldclock/";
            
            @BeforeTest
            public void setUP()
            {
            	System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
            	
            	driver=new ChromeDriver();
            	
            	driver.navigate().to(url);
            	
            	driver.manage().window().maximize();
            	
            	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            }
            
            @Test
            public void singleCityName()
            {
            	WebElement singlecityName=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]"));
            	
            	System.out.println(singlecityName.getText());
            }
}
