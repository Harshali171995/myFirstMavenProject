package testCases;

import org.testng.annotations.Test;

public class LoginTestCase {

	@Test(timeOut=4000) //will timeout after 4 secs
	public void login()
	{
		System.out.println("Enter username");
		System.out.println("Enter password");
		System.out.println("Login to application");
	}
}
