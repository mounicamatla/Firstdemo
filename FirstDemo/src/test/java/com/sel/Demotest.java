package com.sel;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Demotest {

	@Test
	public void sum()
	{
		System.out.println("sum");
		int a=20;
		int b=30;
		Assert.assertEquals(50, a+b);
	}
	
	@Test
	public void div()
	{
		System.out.println("sub");
		int a=50;
		int b=30;
		Assert.assertEquals(20, a-b);
	}
	
}
