package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ParallelTestExecution 
{

	WebDriver driver = new EdgeDriver();
	
	@Test
	public void test1()
	{
		System.out.println(Thread.currentThread().getId());
		driver.get("https://www.amazon.in/");
	}
	
	@Test
	public void test2()
	{
		System.out.println(Thread.currentThread().getId());
		driver.get("https://www.firstcry.com/");
	}
	
}
