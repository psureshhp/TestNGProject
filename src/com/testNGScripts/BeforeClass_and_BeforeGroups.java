package com.testNGScripts;


import org.testng.annotations.AfterGroups;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeGroups;



public class BeforeClass_and_BeforeGroups {
	
	
	@BeforeGroups(value = "regression")
	public void beforeGroups() {
		System.out.println("Before Groups");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class");
	}
	
	@Test(groups = "regression")
	public void test1() {
		System.out.println("Test1");
	}
	
	@Test
	public void test3() {
		System.out.println("Test3");
	}

	@Test
	public void test4() {
		System.out.println("Test4");
	}


	
	@Test(groups = "sanity")
	public void test2() {
		System.out.println("Test2");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	
	
	@AfterGroups(value = "sanity")
	public void afterGroups() {
		System.out.println("After Groups");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After class");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforeSuite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("AfterSuite");
	}

	
	/**
	 * Output
	 * ---------------------------------
	 * beforeSuite
			Before Test
				Before class
					Before Groups
						Before Method
						Test1
						After Method
						Before Method
						Test2
						After Method
					After Groups
					Before Method
						Test3
					After Method
					Before Method
						Test4
					After Method
				After class
			After Test
		AfterSuite
	 */
}
