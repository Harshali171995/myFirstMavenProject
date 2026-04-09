package testCases;

import org.testng.annotations.Test;

public class TestNGPriorityTC2 {

	@Test(priority=0)
	public void testX()
	{
		System.out.println("Inside Test X");
	}
	
	@Test
	public void testY()
	{
		System.out.println("Inside Test Y");
	}
	
}
