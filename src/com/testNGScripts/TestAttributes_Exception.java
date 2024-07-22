package com.testNGScripts;

import org.testng.annotations.Test;

public class TestAttributes_Exception {
	
	
//	@Test 
	public void test() {
		System.out.println("Normal Test method exp1");
		int x=1/0;
	    System.out.println("Normal Test method exp2");
		
	}
	

	
	@Test (expectedExceptions = ArithmeticException.class)
	public void test1() {
		System.out.println("Test1 method exp1");
		int x=1/0;
	    System.out.println("Test1 method exp2");
		
	}
	


}
