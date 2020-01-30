package GetTitleofApplication;

import org.openqa.selenium.chrome.ChromeDriver;

public class BingApplicationTitle {

	public static void main(String[] args) 
	
	{
		String url="https://bing.com";
		
		System.setProperty("webdriver.chrome.driver", "D:\\UserDownloads\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		//driver.get(url);
		
		driver.navigate().to(url);
		
		String Expected_BingApplicationTitle="bing"; //Bing
		
	String	actual_BingApplicationTitle=driver.getTitle();
	
	System.out.println("the title of Bing application is:"+actual_BingApplicationTitle);
	
	
	
	if(actual_BingApplicationTitle.equals(Expected_BingApplicationTitle))
	{
		System.out.println("Titles are matched----PASS");
		
	}
	else
	{
		System.out.println("Titles are not matched---FAIL");
	}
		
		//driver.close();
	
	if(actual_BingApplicationTitle.equalsIgnoreCase(Expected_BingApplicationTitle))
	{
		System.out.println("Titles are matched----PASS");
		
	}
	else
	{
		System.out.println("Titles are not matched---FAIL");
	}
		
		driver.quit();
	}

}
