package com.commonMethods;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{  
  
    public void onTestStart(ITestResult result) {  
    	 System.out.println("onTestStart");
    }  
  
    public void onTestSuccess(ITestResult result) {  
        System.out.println("onTestSuccess");  
    }  
  
    public void onTestFailure(ITestResult result) {  
        System.out.println("onTestFailure");
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "D:\\Selenium_WP_practice_18_04_22\\Practice_TestNg\\chromedriver.exe");
		 * WebDriver driver =new ChromeDriver();
		 * driver.get("http://demo.nopcommerce.com/"); 
		 * TakesScreenshot ts =(TakesScreenshot)driver; 
		 * File src = ts.getScreenshotAs(OutputType.FILE); 
		 * File trg = new File(".\\screenshots\\homepage.png"); 
		 * try { 
		 * 		FileUtils.copyFile(src,trg); 
		 * }catch (Exception e) { }
		 * 
		 * driver.close();
		 */
        
    }  
  
    public void onTestSkipped(ITestResult result) {  
        System.out.println("onTestSkipped");  
    }  
  
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {  
        System.out.println("onTestFailedButWithinSuccessPercentage");  
    }  
  
    public void onStart(ITestContext context) {  
    	System.out.println("OnStart");
    }  
  
    public void onFinish(ITestContext context) {  
    	System.out.println("OnFinish");  
    }  

}
