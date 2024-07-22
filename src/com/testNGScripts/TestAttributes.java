package com.testNGScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAttributes {
	
	@Test
	public void myTest1() {
		Assert.assertFalse(false);
		System.out.println("MyTest1 method");
	}
	
	@Test(invocationCount = 4)
	public void myTest2() {
		System.out.println("MyTest2 method");
	}
	
	@Test(dependsOnMethods = "myTest1")
	public void myTest3() {
		System.out.println("MyTest3 method");
	}

}
