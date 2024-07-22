package com.testNGScripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Before_After_Class_Before_After_Group {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After class");
	}
	
	@BeforeGroups(value = "regression")
	public void beforeGroup() {
		System.out.println("Before group");
	}
	
	@AfterGroups(value = "sanity")
	public void afterGroup() {
		System.out.println("After Group");
	}
	
	@Test(groups = "regression")
	public void  test2() {
		System.out.println("Regression Test2 method");
	}
	
	@Test(groups = "regression")
	public void  test3() {
		System.out.println("Regression Test3 method");
	}
	
	@Test(groups = "sanity")
	public void  test4() {
		System.out.println("sanity Test4 method");
	}
	
	@Test(groups = "sanity")
	public void  test5() {
		System.out.println("sanity Test5 method");
	}
	
	@Test
	public void test6() {
		System.out.println("MyTest1 method");
	}
	
	

}
