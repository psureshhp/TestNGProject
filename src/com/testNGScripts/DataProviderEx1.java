package com.testNGScripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx1 {
	
	@DataProvider(name = "dpval")
	public Object[][] dpMethod(){
		return new Object[][] {
			{1,2},
			{2,3},
			{4,5}
		};
	}
	
	@Test(dataProvider = "dpval")
	public void myTest(int x, int y) {
		System.out.println(x+y);
		
	}

}
