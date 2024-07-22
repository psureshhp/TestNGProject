package com.testNGScripts;

import org.testng.annotations.Test;

public class TestAttributes_TimeOut {
	
	
	@Test(timeOut = 1000)
	public void test_timeout() {
		System.out.println("test_timeout method");
		try {
			Thread.sleep(200);
		}catch(InterruptedException e) {
			
		}
	}
	


}
