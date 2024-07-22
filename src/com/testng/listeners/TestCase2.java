package com.testng.listeners;

import org.testng.annotations.Test;

//@Listeners(com.commonMethods.Listeners.class)
public class TestCase2{
	
	  @Test(timeOut = 1000)
	  public void TestCase_1() throws InterruptedException {
		  System.out.println("TestCase2:method1");
		  Thread.sleep(2000);
	  }
  
	  @Test(dependsOnMethods = "TestCase_1")
	  public void TestCase_2() {
		  System.out.println("TestCase2:method2");
	  }
	
}
