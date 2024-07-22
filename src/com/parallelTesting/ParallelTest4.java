package com.parallelTesting;

import org.testng.annotations.Test;

public class ParallelTest4 {
	
	@Test
	public void test4a() {
		System.out.println("ParallelTest4 >> test4a >>"+Thread.currentThread().getId());
	}
	
	@Test
	public void test4b() {
		System.out.println("ParallelTest4 >> test4b >>"+Thread.currentThread().getId());
	}
	
	@Test
	public void test4c() {
		System.out.println("ParallelTest4 >> test4c >>"+Thread.currentThread().getId());
	}
	
	@Test
	public void test4d() {
		System.out.println("ParallelTest4 >> test4d >>"+Thread.currentThread().getId());
	}

}
