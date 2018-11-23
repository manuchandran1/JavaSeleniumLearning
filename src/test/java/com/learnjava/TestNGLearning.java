package com.learnjava;

import org.testng.annotations.Test;

public class TestNGLearning 
{
	@Test(priority = 3)
	public void method_1() 
	{
		System.out.println("1");
	}
	@Test(priority = 2)
	public void method_2() 
	{
		System.out.println("2");
	}

	@Test(priority = 1)
	public void method_3() 
	{
		System.out.println("3");
	}
}
