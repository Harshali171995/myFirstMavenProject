package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCaseWithParameters {
	
	WebDriver driver = new EdgeDriver();
	
	@Parameters({"URL"})
	@Test
	public void login1(String url)
	{
		System.out.println("Inside TestCaseWithParameters...");
		driver.get(url);
	}

}
