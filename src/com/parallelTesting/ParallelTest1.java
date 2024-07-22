package com.parallelTesting;

import org.testng.annotations.Test;

public class ParallelTest1 {
	
	@Test
	public void test1a() {
		System.out.println("ParallelTest1 >> test1a >>"+Thread.currentThread().getId());
	}
	
	@Test
	public void test1b() {
		System.out.println("ParallelTest1 >> test1b >>"+Thread.currentThread().getId());
	}
	
	@Test
	public void test1c() {
		System.out.println("ParallelTest1 >> test1c >>"+Thread.currentThread().getId());
	}
	
	@Test
	public void test1d() {
		System.out.println("ParallelTest1 >> test1d >>"+Thread.currentThread().getId());
	}

}
