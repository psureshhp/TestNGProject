package com.testNGScripts;

import org.testng.annotations.Test;

public class TestAttributes_Enabled {
	
	@Test(enabled = false)
	public void myTest1() {
		System.out.println("myTest1 aaa");
	}
	
	@Test
	public void myTest2() {
		System.out.println("myTest2 bbb");
	}
	
	@Test
	public void myTest3() {
		System.out.println("myTest3 ccc");
	}
	

}
