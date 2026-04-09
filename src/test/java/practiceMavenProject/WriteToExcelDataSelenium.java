package practiceMavenProject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToExcelDataSelenium {

	public static void main(String[] args) throws IOException {

        String path = "C:\\Harshali Learn Automation\\ExcelInputDataHandling\\InputExcelData.xlsx";
		
        FileInputStream fis = new FileInputStream(path);
		
        XSSFWorkbook workbook = new XSSFWorkbook(fis); 
      
        XSSFSheet sheet = workbook.getSheet("SheetA");
        
        int noOfRows = sheet.getPhysicalNumberOfRows(); //counts number of rows filled in sheet
        
        
        for(int i=0; i<noOfRows-1; i++) //this for loop is for rows
        {
        	XSSFRow row = sheet.getRow(i+1);
        	
        	XSSFCell cell = row.getCell(2);
        	if(cell==null)
        	{
        		cell = row.createCell(2);
        		cell.setCellValue("Pass");
        		FileOutputStream fos = new FileOutputStream(path);
        		workbook.write(fos);
        	}

        }

	}

}
