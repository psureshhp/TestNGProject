package com.testNGScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class ParallelTest1B {

	WebDriver driver;
	
	@Test
	public void btest4() {
		System.out.println("Parallel Test4:"+"Thread:"+Thread.currentThread().getId());
		//driver =new FirefoxDriver();
		//driver.get("https://google.com");
		
	}
	
	@Test(dependsOnMethods = "btest4")
	public void atest5() throws InterruptedException {
		System.out.println("Parallel Test5:"+"Thread:"+Thread.currentThread().getId());
	//	Thread.sleep(5000);
	//	driver.findElement(By.name("q")).sendKeys("Naresh");
		
		
	}
	
	//@AfterClass
	@Test(dependsOnMethods = "atest5")
	public void test6() throws InterruptedException {
		System.out.println("Parallel Test6:"+"Thread:"+Thread.currentThread().getId());
	//	Thread.sleep(5000);
		//driver.quit();
		
	}
}
