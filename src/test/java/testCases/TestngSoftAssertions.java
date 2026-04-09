package testCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class TestngSoftAssertions 
{
	//Soft Assertion is also called as Verify Assertion
	
	SoftAssert softAssert = new SoftAssert();
	
	int a = 10;
	int b = 5;
	
	@Test
	public void test1()
	{
		softAssert.assertEquals(a>b, true); //expected=actual
	}
	
	@Test
	public void test2()
	{
		softAssert.assertEquals(a<b,true,"Test 2 is failed"); //expected!=actual //this will fail
	}
	
	@Test
	public void test3()
	{
		softAssert.assertTrue(false,"Test 3 is failed"); //this will fail
	}
	
	@Test
	public void test4()
	{
		softAssert.assertTrue(true);
	}
	
	@Test
	public void test5()
	{
		softAssert.assertFalse(false);
	}
	
	@Test
	public void test6()
	{
		softAssert.assertFalse(true, "Test 6 is failed");;//this will fail
	
	}
	
	
	@Test
	public void testAssertionCheck()
	{
		softAssert.assertAll();
	
	}
}
