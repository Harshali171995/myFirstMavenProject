package testCases;

import org.testng.annotations.Test;

/*
 * TestNG Priority 
 * @Test(priority=1)
 * If priority is NOT given to any @Test then it has default priority as 0 and it will always run first.
 * 0 is the lowest or default priority.
 * To run tests before the default ones, give priority = -1
 * Even though we give priority to tests of two different classes(files), 
 * it will execute tests of only one class first and then of another class.
 */

public class TestNGPriorityTC1 {

	@Test(priority=0)
	public void testA()
	{
		System.out.println("Inside Test A");
	}
	
	@Test(priority=-1)
	public void testB()
	{
		System.out.println("Inside Test B");
	}
	
	@Test(priority=1)
	public void testC()
	{
		System.out.println("Inside Test C");
	}
}
