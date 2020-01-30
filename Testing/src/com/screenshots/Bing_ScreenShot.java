package com.screenshots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Bing_ScreenShot

{
    WebDriver driver=null;
    
    String url="https://bing.com";
    
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
    public void bing_screenshot() throws IOException
    {
    	File bingscreenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	
    	FileUtils.copyFile(bingscreenshot, new File("./ScreenShots/bing.png"));
    }
}
