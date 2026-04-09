package testCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelInputDataGetter 
{
	@Test(dataProvider="getData")
	public void test1(String userName, String password)
	{
		System.out.println(userName + " " + password);
	}

	@DataProvider
	public Object[][] getData() throws IOException
	{
		String path = "C:\\Harshali Learn Automation\\ExcelInputDataHandling\\InputExcelData.xlsx";
		FileInputStream fis = new FileInputStream(path);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheet("SheetA");
		
		int noOfRows = sheet.getPhysicalNumberOfRows();
		
		int noOfCols = sheet.getRow(0).getLastCellNum();
		
		Object[][] data = new Object[noOfRows-1][noOfCols];
		
		for(int i=0; i<noOfRows-1; i++)
		{
			XSSFRow row = sheet.getRow(i+1);
			for(int j=0; j<noOfCols; j++)
			{
				XSSFCell cell = row.getCell(j);
				if(cell!=null)
				{
					data[i][j] = cell.getStringCellValue();
				}
			}
		}
		
		return data;
				
	}
	
	
}
