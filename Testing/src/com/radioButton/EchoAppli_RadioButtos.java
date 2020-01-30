package com.radioButton;

import java.util.List;

import org.apache.poi.hslf.util.SystemTimeUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EchoAppli_RadioButtos

{      WebDriver driver=null;

       String url="http://www.echoecho.com/htmlforms10.htm";
       
       @BeforeTest
       public void signUP()
       {
    	   System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
    	   
    	   driver=new ChromeDriver();
    	   
    	   driver.navigate().to(url);
    	   
    	   driver.manage().window().maximize();
       }
       
       @Test
       public void radioButtons() throws InterruptedException
       {
    	  List<WebElement> radioButtonsList=driver.findElements(By.name("group1"));
    	  
    	List <WebElement>radioButtonsList1= driver.findElements(By.name("group2"));
    	  
    	 int  radioButtonCount=radioButtonsList.size();
    	 
    	 int radioButtonCount1=radioButtonsList1.size();
    	 
    	 System.out.println("the number of radio buttons are :"+radioButtonCount);
    	 
    	 for(int i=0;i<radioButtonCount;i++)
    	 
    	 {
    	 
    	 radioButtonsList.get(i).click();
    	 
    	 radioButtonsList1.get(i).click();
    	 
        for(int j=0;j<radioButtonCount;j++)
    		 
    	 {
    		 
    		System.out.println(radioButtonsList.get(j).getAttribute("value")+"   "+radioButtonsList.get(j).isSelected());
    		
    		System.out.println(radioButtonsList1.get(j).getAttribute("value")+"   "+radioButtonsList.get(j).isSelected());
    		 
    		Thread.sleep(10000);
    	 }
    	  
    	  }

}
}
