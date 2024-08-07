package com.testNGScripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Hard_Soft_Asserts_Ex {
	
	//@Test
	public void testCaseOne() {
		System.out.println("*** test case one started ***");
		Assert.assertEquals(5, 5, "First hard assert failed");
		System.out.println("hard assert success....");
		Assert.assertTrue("Hello".equals("hello"), "Second hard assert failed");
		System.out.println("*** test case one executed successfully ***");
	}

	
	@Test
	public void testCasetwo() {
		SoftAssert softAssert = new SoftAssert();
		System.out.println("*** test case two started ***");
		softAssert.assertEquals("Hello", "Hello", "First soft assert failed");
		System.out.println("Soft assert success....");
		softAssert.assertTrue("Hello".equals("hello"), "Second soft assert failed");
		softAssert.assertTrue("Welcome".equals("Welcome"), "Third soft assert failed");
		System.out.println("*** test case two executed successfully ***");
		softAssert.assertAll();
	}

	
	/*
	 * Test results
	 * 
	 * *** test case two started ***
			Soft assert success....
	 		*** test case two executed successfully ***
			FAILED: testCasetwo
			java.lang.AssertionError: The following asserts failed:
			Second soft assert failed expected [true] but found [false],
			Third soft assert failed expected [true] but found [false]

	 * 
	 */
}
