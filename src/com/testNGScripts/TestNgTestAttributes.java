package com.testNGScripts;

import org.testng.annotations.Test;

public class TestNgTestAttributes {
	
	
//	@Test(description = "Suresh")
	public void testDesc() {
		System.out.println("testDesc method");
	}
	
	
	@Test(enabled = true)
	public void testEnabled() {
		System.out.println("enabled method");
	}
	
	//@Test(invocationCount = 2)
	public void test_invocation() {
		System.out.println("test_invocation method");
	}
	

	//@Test (expectedExceptions = ArithmeticException.class)
	public void test() {
		System.out.println("Test method exp1");
		//try {
		int x=1/0;
		//}catch (Exception e) {
			// TODO: handle exception
		//	System.out.println("Exception is thrown pls handle it");
		//}
	    System.out.println("Test method exp2");
		
	}
	
	//@Test(priority = 1)
	public void sub() {
		System.out.println("prority method1");
	}
	
	//@Test(priority = 2)
	public void add() {
		System.out.println("prority method2");
	}
	
	//@Test(dependsOnMethods = "sub")
	public void aestqq() {
		System.out.println("Dependon methods");
	}
	
	@Test(timeOut = 1000)
	public void test_timeout1111() {
		System.out.println("test_timeout method111");
		try {
			Thread.sleep(500);
		}catch(InterruptedException e) {
			
		}
	}
}
