package com.parallelTesting;

import org.testng.annotations.Test;

public class ParallelTest3 {
	
	@Test
	public void test3a() {
		System.out.println("ParallelTest3 >> test3a >>"+Thread.currentThread().getId());
	}
	
	@Test
	public void test3b() {
		System.out.println("ParallelTest3 >> test3b >>"+Thread.currentThread().getId());
	}
	
	@Test
	public void test3c() {
		System.out.println("ParallelTest3 >> test3c >>"+Thread.currentThread().getId());
	}
	
	@Test
	public void test3d() {
		System.out.println("ParallelTest3 >> test3d >>"+Thread.currentThread().getId());
	}

}
