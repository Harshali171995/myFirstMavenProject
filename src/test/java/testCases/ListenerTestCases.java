package testCases;

import org.testng.SkipException;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class ListenerTestCases 
{
	@Test
	public void test1()
	{
		System.out.println("Test 1");
		
		Assert.assertTrue(true);
		
	}
	
	@Test
	public void test2()
	{
		System.out.println("Test 2"); 
		
		Assert.assertTrue(false); //this test will fail
		
	}
	
	@Test
	public void test3()
	{
		System.out.println("Test 3"); 
		
		throw new SkipException("Skipping test 3");
		
	}
	
	
	
}
