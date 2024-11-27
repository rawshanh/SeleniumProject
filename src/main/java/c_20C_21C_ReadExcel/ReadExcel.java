package c_20C_21C_ReadExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		
		//Ist-Open/Enter into the workbook- create object of XSSFWorkbook class
		XSSFWorkbook wb = new XSSFWorkbook("./data/ReadData1.xlsx");
		
		//2nd-Get Sheet	- enter into the sheet
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		//3rd-Get row - enter into the row
		XSSFRow row = sheet.getRow(5);
		
		//4th-Get column/cell - enter into the column/cell
		XSSFCell cell = row.getCell(0);
				
		//5th-Action- Read/print particular CellValue
		String CellValue = cell.getStringCellValue();
		System.out.println(CellValue);
	
		
		/*	XSSFWorkbook wb = new XSSFWorkbook ("./data11/ReadData.xlsx");
		
		//2nd-Get Sheet	- enter into the sheet		
		XSSFSheet sheet = wb.getSheet("Sheet1");
					//XSSFSheet sheet1 = wb1.getSheet("sheet1");
		
		//3rd-Get row - enter into the row
		XSSFRow row = sheet.getRow(4);
		//XSSFRow row1 = sheet1.getRow(3);
		
		//4th-Get column/cell - enter into the column/cell
		  XSSFCell cell = row.getCell(1);
		  //XSSFCell cell1 = row1.getCell(0);
		
		//5th-Action- Read/print particular CellValue
		  
		 String cellValue = cell.getStringCellValue();
		System.out.println(cellValue);	
		*/
		
		
		
	}

}
