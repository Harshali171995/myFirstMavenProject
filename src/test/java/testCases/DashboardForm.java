package testCases;

import org.testng.annotations.Test;

public class DashboardForm {

	
	
	@Test(dependsOnMethods= {"login"})
	public void fillDashboardForm()
	{
		System.out.println("Welcome to Dashboard!!");	}
}
