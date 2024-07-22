package com.testNGScripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {
	
	@DataProvider(name = "dpval" )
	public Object[][] dpMethod() {
		return new Object[][] {
				{"Suresh"},
				{"Pelluru"},
				{"Naresh"}
			};
		
	}
	
	
}
