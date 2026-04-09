package testCases;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestngHardAssertions 
{
	int a = 10;
	int b = 5;
	
	@Test
	public void test1()
	{
		Assert.assertEquals(true, a>b); //expected=actual
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(true, a<b); //expected!=actual //this will fail
	}
	
	@Test
	public void test3()
	{
		Assert.assertTrue(false); //this will fail
	}
	
	@Test
	public void test4()
	{
		Assert.assertTrue(true);
	}
	
	@Test
	public void test5()
	{
		Assert.assertFalse(false);
	}
	
	@Test
	public void test6()
	{
		Assert.assertFalse("Test 6 is failed", true);//this will fail
	
	}
}
