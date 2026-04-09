package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class MySecondTestCase {

	
	@Test
	public void test1()
	{
		System.out.println("MySecondTestCase");
		System.out.println("Inside test1()....");
		
	}
	
	@Test
	public void test2()
	{	
		System.out.println("MySecondTestCase");
		System.out.println("Inside test2()....");
	}
	
	@Test(groups= {"Smoke"})
	public void test3()
	{		
		System.out.println("MySecondTestCase");
		System.out.println("Inside test3()....");
	}
}
