package practiceMavenProject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class InputExcelDataHandlingSelenium {

	public static void main(String[] args) throws IOException {

        String path = "C:\\Harshali Learn Automation\\ExcelInputDataHandling\\InputExcelData.xlsx";
		
        FileInputStream fis = new FileInputStream(path);
		
        XSSFWorkbook workbook = new XSSFWorkbook(fis); 
      
        XSSFSheet sheet = workbook.getSheet("SheetA");
        
        int noOfRows = sheet.getPhysicalNumberOfRows(); //counts number of rows filled in sheet
        
        int noOfCols = sheet.getRow(0).getLastCellNum(); //counts number of columns of first(header) row
        
        Object[][] data = new Object[noOfRows-1][noOfCols];
        
        for(int i=0; i<noOfRows-1; i++) //this for-loop is for rows
        {
        	XSSFRow row = sheet.getRow(i+1);
        	
        	for(int j=0; j<noOfCols; j++) //this for-loop is for columns
        	{
        		XSSFCell cell = row.getCell(j);
        		if(cell!=null)
        		{
        			String cellValue = cell.getStringCellValue();
        			data[i][j] = cellValue;
        		}
        	}
        }
        
        for (int i = 0; i < data.length; i++)
        {
        	for(int j=0; j<data[0].length; j++)
        		System.out.println(data[i][j]);
        }

	}

}
