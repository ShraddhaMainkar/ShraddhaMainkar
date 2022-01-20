package com.test;

import org.testng.annotations.Test;

public class hi
{
	@Test(priority =0 )
	public void test1()
	{
		System.out.println("1");
	}
	
	@Test(priority = 0)
	public void test2()
	{
		System.out.println("2");
	}
	@Test(priority = -3)
	public void test3()
	{
		System.out.println("3");
	}
	
	@Test
	public void test4()
	{
		System.out.println("5");
	}
	
}