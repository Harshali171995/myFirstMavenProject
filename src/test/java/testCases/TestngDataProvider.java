package testCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestngDataProvider 
{
	@Test(dataProvider="getData")
	public void test1(String userName, String password)
	{
		System.out.println(userName + " " + password);
	}
	
	
	@DataProvider
	public Object[][] getData()  //use multidimentional array if it return data in multidimentional array eg. Object[][]
	{
		Object[][] data = new Object[3][2];
		
		data[0][0] = "UserName1";
		data[0][1] ="Password1";
		
		data[1][0] = "UserName2";
		data[1][1] ="Password2";
		
		data[2][0] = "UserName3";
		data[2][1] ="Password3";
		
		return data;
		
	}

}
