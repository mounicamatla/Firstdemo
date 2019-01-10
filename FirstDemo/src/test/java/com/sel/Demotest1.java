package com.sel;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Demotest1 {

	
	@Test
	public void mul()
	{
		System.out.println("mul");
		int a=20;
		int b=30;
		Assert.assertEquals(600, a*b);
	}
	
	@Test
	public void div()
	{
		System.out.println("div");
		int a=50;
		int b=30;
		Assert.assertEquals(20, a%b);
}
}