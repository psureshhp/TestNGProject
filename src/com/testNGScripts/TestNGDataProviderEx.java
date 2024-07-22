package com.testNGScripts;

import org.testng.annotations.Test;

public class TestNGDataProviderEx {
	
	
	@Test(dataProvider = "dpval", dataProviderClass = DataProviderClass.class)
	public void myTest(String val) {
		System.out.println("******************Main class iis from TestNGDataProviderEx.java");
		System.out.println("Value:"+val);
	}
}
