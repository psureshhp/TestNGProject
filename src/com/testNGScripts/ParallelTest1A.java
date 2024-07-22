package com.testNGScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTest1A {

	WebDriver driver;
	
	
	@Test
	public void btest1() throws InterruptedException{
		System.out.println("Parallel Test1:"+"Thread:"+Thread.currentThread().getId());
		//driver = new ChromeDriver();
	//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.get("https://google.com");
		
	}
	
	@Test(dependsOnMethods = "btest1")
	public void atest2() throws InterruptedException {
		System.out.println("Parallel Test2:"+"Thread:"+Thread.currentThread().getId());
		//Thread.sleep(2000);
		//driver.findElement(By.name("q")).sendKeys("Suresh");
		//Thread.sleep(5000);
		
	}
	
	
	@Test(dependsOnMethods = "btest1")
	public void test3() throws InterruptedException {
		System.out.println("Parallel Test3:"+"Thread:"+Thread.currentThread().getId());
		//Thread.sleep(5000);
		//driver.quit();
		
	}
	
	
}
