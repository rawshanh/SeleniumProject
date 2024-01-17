package readExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook wb = new XSSFWorkbook("./data1/ReadData3.xlsx");
	
		//	Get Sheet
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		//get row count
				int rowCount = sheet.getLastRowNum();
				System.out.println(rowCount);
				
				//Get column count
				int columCount = sheet.getRow(0).getLastCellNum();
				System.out.println(columCount);
				
		for (int i = 1; i <= rowCount; i++) {
			//Get Row
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < columCount; j++) {
				//Get Column
				XSSFCell cell = row.getCell(j);
				String cellValue = cell.getStringCellValue();
				System.out.println(cellValue);
			}
		} 
		
	}
		}
		
