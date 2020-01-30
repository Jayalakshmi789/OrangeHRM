package com.BrowserAutomation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowsersAutomation {

	public static void main(String[] args) {
		
		
		// Automating Chrome Browser
System.setProperty("webdriver.chrome.driver", "C:\\Users\\srinivas1\\Desktop\\Dec1030Batch\\WebApplicationTesting\\driverFiles\\chromedriver.exe");
		// creating an object for chromedriver class
		ChromeDriver cd = new ChromeDriver();

		
		// Automating FireFox Browser
		System.setProperty("webdriver.gecko.driver", "./driverFiles/geckodriver.exe");
		FirefoxDriver fd = new FirefoxDriver();
		
		// Internet explorer
		System.setProperty("webdriver.ie.driver", "./driverFiles/IEDriverServer.exe");
		InternetExplorerDriver ieBrowser = new InternetExplorerDriver();
		
		// edge Browser - latest Internet explorer
		System.setProperty("webdriver.edge.driver", "./driverFiles/MicrosoftWebDriver.exe");
		EdgeDriver edgeBrowser = new EdgeDriver();
		
		
	}
}
