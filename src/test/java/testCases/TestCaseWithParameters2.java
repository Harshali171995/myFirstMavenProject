package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCaseWithParameters2 {
	
	WebDriver driver = new EdgeDriver();
	
	@Parameters({"URL","Username"})
	@Test
	public void login2(String url,String userName)
	{
		System.out.println("Inside TestCaseWithParameters2...");
		driver.get(url);
		System.out.println("Username:- " + userName);
	}

}
