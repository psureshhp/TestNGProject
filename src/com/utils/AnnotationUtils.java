package com.utils;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class AnnotationUtils {
	
	 @BeforeMethod
	  public void before_Method() {
		  System.out.println("Before Method");
	  }
	 
	 @AfterMethod
	  public void after_Method() {
		  System.out.println("After Method");
	  }
	 
	  @BeforeClass
	  public void before_Class() {
		  System.out.println("Before Class");
	  }
	  
	  @AfterClass
	  public void after_Class() {
		  System.out.println("After Class");
	  }
	  
	
	 @BeforeTest
	  public void Before_Test() {
		  System.out.println("Before Test");
	  }
 
	 @AfterTest
	  public void After_Test() {
		  System.out.println("After Test");
	  }
	 
	 @BeforeSuite
	  public void Before_Suite() {
		  System.out.println("Before Suite");
	  }

	 @AfterSuite
	  public void After_Suite() {
		  System.out.println("After Suite");
	  }

}
