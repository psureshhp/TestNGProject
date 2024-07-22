package com.testng.listeners;

import org.testng.annotations.Test;

//@Listeners(com.commonMethods.Listeners.class)
public class TestCase3 {

	@Test 
	public void testCase1()  
	{  
		System.out.println("TestCase3:method1");
		//Assert.assertTrue(true);  
	}  
	@Test  
	public void testCase2()  
	{  
		System.out.println("TestCase3:method2");
		//int x=1/0;
		//Assert.assertFalse(true);  
	}  
}
