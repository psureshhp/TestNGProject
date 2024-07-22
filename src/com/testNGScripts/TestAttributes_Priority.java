package com.testNGScripts;

import org.testng.annotations.Test;

public class TestAttributes_Priority {
	
	@Test(priority = 1)
	public void myTest1() {
		System.out.println("MyTest1 method");
	}
	
	@Test
	public void myTest2() {
		System.out.println("MyTest2 method");
	}
	
	@Test(priority = 2)
	public void myTest3() {
		System.out.println("MyTest3 method");
	}

}
