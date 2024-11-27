package c_20C_21C_ReadExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelRownColumnCount24 {

	public static void main(String[] args) throws IOException {

		//Ist-Open/Enter into the workbook- create object of XSSFWorkbook class
		XSSFWorkbook wb = new XSSFWorkbook("./data/ReadData1.xlsx");
		
		XSSFSheet Sheet = wb.getSheet("Sheet1");
		
		 int rowCount = Sheet.getLastRowNum();
		System.out.println(rowCount);
		
		
		int cellCount = Sheet.getRow(0).getLastCellNum();
		System.out.println(cellCount);
		
		
	/*	XSSFCell cell = row.getCell(1);
		
		
		String CellValue = cell.getStringCellValue();
		System.out.println(CellValue);
		*/
		
	}

}
