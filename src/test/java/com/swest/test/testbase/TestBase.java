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
	
	public static WebDriver driver;
	
	@BeforeSuite
	public static void SetUp() {
		//WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		
		//WebDriverManager.firefoxdriver().setup();
		//driver = new FirefoxDriver();
		
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
				
		//WebDriverManager.iedriver().setup();
		//driver = new InternetExplorerDriver();
		
		//WebDriverManager.operadriver().setup();
		//driver = new OperaDriver();
		
		
		
		driver.get("https://www.southwest.com/");
	}

}
