package testCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/*Data Provider public java.lang.String testCases.DataProviderForSingleData.getData() 
 * must return either Object[][] or Object[] or Iterator<Object[]> or Iterator<Object>, not class java.lang.String
 * So below code will fail.
 */

public class DataProviderForSingleData 
{
	@Test(dataProvider="getData")
	public void test1(String url)
	{
		System.out.println(url);
	}
	
	
	@DataProvider
	public String getData()
	{
		String url = "https://amazon.in";
		return url;
	}
}
