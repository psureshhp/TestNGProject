package com.testNGScripts;

import org.testng.annotations.Test;

public class Home_Loan extends LoanBase{
	
	@Test(priority = 1)
	public void hLoan1() {
	    System.out.println("Home Loan1");  
		
	}
	
	@Test(priority = 2)
	public void hLoan4() {
	    System.out.println("Home Loan4");  
		
	}
	
	@Test(priority = 2)
	public void hLoan2() {
	    System.out.println("Home Loan2");  
		
	}
	
	@Test(priority = 4)
	public void hLoan3() {
	    System.out.println("Home Loan3");  
		
	}
	
	
}
