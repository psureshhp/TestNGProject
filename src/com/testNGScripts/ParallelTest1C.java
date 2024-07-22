package com.testNGScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class ParallelTest1C {

	WebDriver driver;
	
	@Test
	public void ctest7() {
		System.out.println("Parallel Test7:"+"Thread:"+Thread.currentThread().getId());
		//driver =new FirefoxDriver();
		//driver.get("https://google.com");
		
	}
	
	@Test(dependsOnMethods = "ctest7")
	public void ctest8() throws InterruptedException {
		System.out.println("Parallel Test8:"+"Thread:"+Thread.currentThread().getId());
		//Thread.sleep(5000);
		//driver.findElement(By.name("q")).sendKeys("Ramesh");
		
		
	}
	
	//@AfterClass
/*	@Test(dependsOnMethods = "ctest8")
	public void ctest9() throws InterruptedException {
		System.out.println("Parallel Test9:"+"Thread:"+Thread.currentThread().getId());
		Thread.sleep(5000);
		driver.quit();
		
	}*/
}
