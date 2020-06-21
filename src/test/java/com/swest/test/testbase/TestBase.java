package com.swest.test.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver cdriver, fdriver, edriver, idriver ;
	
	@BeforeSuite
	public static void SetUp() {
		WebDriverManager.chromedriver().setup();
		cdriver = new ChromeDriver();
		
		WebDriverManager.firefoxdriver().setup();
		fdriver = new FirefoxDriver();
		
		WebDriverManager.edgedriver().setup();
		edriver = new EdgeDriver();
				
		WebDriverManager.iedriver().setup();
		idriver = new InternetExplorerDriver();
		
		//WebDriverManager.operadriver().setup();
		//driver = new OperaDriver();
		
		
		
		cdriver.get("https://www.southwest.com/");
		fdriver.get("https://www.southwest.com/");
		edriver.get("https://www.southwest.com/");
		idriver.get("https://www.southwest.com/");
		//driver.get("https://www.southwest.com/");
	}

}
