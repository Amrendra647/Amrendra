package Amrendra.Pal;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;

public class ReadExcelPOI {
  @Test
  public void f() throws IOException  {
	  
	  	String filePath = "D:\\Amrendra.xlsx";
		
		String sheetName = "Test";

	    //Create an object of FileInputStream class to read excel file
	    FileInputStream inputStream = new FileInputStream(filePath);
	
	    XSSFWorkbook sampleWorkbook = new XSSFWorkbook(inputStream);   
	
	    //Read sheet inside the workbook by its name
	    XSSFSheet readSheet = sampleWorkbook.getSheet(sheetName);
	
	    //Find number of rows in excel file
	    int rowCount = readSheet.getLastRowNum()-readSheet.getFirstRowNum();
	
	    //Create a loop over all the rows of excel file to read it
	    for (int i = 0; i < rowCount+1; i++) {
	
	        XSSFRow row = readSheet.getRow(i);
	
	        for (int j = 0; j < row.getLastCellNum(); j++) {
	
	            //Print Excel data in console
	            System.out.print(row.getCell(j).getStringCellValue()+"|| ");
	
	        }
	
	        System.out.println();
	    }
  }

}
