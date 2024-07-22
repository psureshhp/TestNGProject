package com.parallelTesting;

import org.testng.annotations.Test;

public class ParallelTest2 {
	
	@Test
	public void test2a() {
		System.out.println("ParallelTest2 >> test2a >>"+Thread.currentThread().getId());
	}
	
	@Test
	public void test2b() {
		System.out.println("ParallelTest2 >> test2b >>"+Thread.currentThread().getId());
	}
	
	@Test
	public void test2c() {
		System.out.println("ParallelTest2 >> test2c >>"+Thread.currentThread().getId());
	}
	
	@Test
	public void test2d() {
		System.out.println("ParallelTest2 >> test2d >>"+Thread.currentThread().getId());
	}

}
