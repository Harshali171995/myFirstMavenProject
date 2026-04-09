package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class MyFirstTestCase {

	
	@Test(enabled=false) //How to skip test in TestNG - by using enabled=false in @Test annotation
	public void test1()
	{
		System.out.println("MyFirstTestCase");
		System.out.println("Inside test1()....");
		
	}
	
	@Test(groups= {"Smoke"})
	public void test2()
	{		
		System.out.println("MyFirstTestCase");
		System.out.println("Inside test2()....");
	}
	
	@Test
	public void test3()
	{		
		System.out.println("MyFirstTestCase");
		System.out.println("Inside test3()....");
	}
}
