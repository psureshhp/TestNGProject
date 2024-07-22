package com.testNGScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProvider_CrossbrowserTesting {
	
	@DataProvider(name = "dpval", parallel = true)
	public Object[][] dpMethod() {
		return new Object[][] 
				{
					{"chrome"},
					{"firefox"}
				};
		
	}
	@Test(dataProvider = "dpval")
	public void myTest(String browser) {
		WebDriver driver=null;
		if(browser.equals("chrome")) {
			//System.setProperty("webdriver.chrome.driver", "D:\\Selenium_WP_practice_18_04_22\\Practice_TestNg\\chromedriver.exe");
			driver =new ChromeDriver();
		}else if(browser.equals("firefox")) {
			//System.setProperty("webdriver.gecko.driver", "D:\\Selenium_WP_practice_18_04_22\\Practice_TestNg\\geckodriver.exe");
			driver =new FirefoxDriver();	
		}
		driver.get("https://example.testproject.io/web/");
		driver.findElement(By.id("name")).sendKeys("Suresh");
		driver.findElement(By.id("password")).sendKeys("12345");
	}

	
	
}
