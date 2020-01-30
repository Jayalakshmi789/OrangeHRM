package com.webtable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllDataof_SingleColumn_Webtable 

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
    public void AlldataofSingleColumnCityName()
    {
    	///html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
    	
    	///html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]
    	
    	
    	for(int i=1;i<=36;i++)
    	{
    		String data=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr["+i+"]/td[1]")).getText();
    		
    		System.out.println(data + "  ");
    	}
    }

}
