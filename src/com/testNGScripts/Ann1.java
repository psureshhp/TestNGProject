package com.testNGScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.utils.AnnotationUtils;

public class Ann1 extends AnnotationUtils{
	
	@Test
	public void ann1_method() throws InterruptedException {
		System.out.println("Ann1 desc");
			WebDriver driver= new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.get("https://www.selenium.dev/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		 driver.get("https://www.google.com/");
		  //Send keys method
		  driver.findElement(By.name("q")).sendKeys("Suresh Pelluru");
		  Thread.sleep(5000);
		  //driver.findElement(By.name("btnK")).click();
		  WebElement  button =  driver.findElement(By.name("btnK"));
		  JavascriptExecutor jse = (JavascriptExecutor)driver;
		  jse.executeScript("arguments[0].click()", button);
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//span[@class='FMKtTb UqcIvb'][normalize-space()='Images']")).click();
		  
		  Thread.sleep(5000);
		  
		  driver.close();
	}
		
		

}
