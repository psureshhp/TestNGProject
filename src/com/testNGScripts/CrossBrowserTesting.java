package com.testNGScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	
	WebDriver driver;
	
	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browser) throws InterruptedException {
		//String browser="chrome";
		System.out.println("Before Class aaa");
		if(browser.equalsIgnoreCase("chrome")) {
			driver= new ChromeDriver();	
		}else if(browser.equalsIgnoreCase("firefox")) {
			driver= new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.get("https://www.selenium.dev/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		 driver.get("https://www.google.com/");
		  //Send keys method
		  driver.findElement(By.name("q")).sendKeys("Facebook");
		  driver.findElement(By.name("btnK")).click();
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//span[@class='FMKtTb UqcIvb'][normalize-space()='Images']")).click();
	}
	
	@Test
	public void testcase1() {
		System.out.println("testcase1");
		driver.findElement(By.xpath("//a[@id='navbarDropdown']")).click();
		driver.findElement(By.xpath("//a[@class='dropdown-item'][normalize-space()='About Selenium']")).click();
		String title= driver.getTitle();
		System.out.println("Title:"+title);
		Assert.assertEquals(title,"About Selenium | Selenium");
	}
	
	@Test
	public void testcase2() throws InterruptedException{
		System.out.println("testcase2");
		driver.findElement(By.xpath("//span[normalize-space()='Downloads']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='other languages exist']")).click();
	    String title1=driver.getTitle();
	    System.out.println("title1:"+title1);
	    Assert.assertEquals(title1, "Ecosystem | Selenium");
	}
	
	@AfterClass
	public void afterClass() throws InterruptedException{
		System.out.println("AfterClass");
		Thread.sleep(5000);
		driver.quit();
	}

}
