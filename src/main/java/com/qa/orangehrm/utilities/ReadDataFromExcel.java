package com.qa.orangehrm.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	
	public String[][] getExcelData() throws EncryptedDocumentException, IOException
	{
		FileInputStream fileInputStream=new FileInputStream("C:\\Users\\sharu\\eclipse-workspace\\OrangeHRMMaven\\TestData\\OrangeHRM.xlsx");
		
		Workbook workbook = WorkbookFactory.create(fileInputStream);
		Sheet sheet=workbook.getSheet("MyInfo");
		int rowCount = sheet.getLastRowNum();
		int cellCount = sheet.getRow(0).getLastCellNum();
		System.out.println(rowCount);
		System.out.println(cellCount);
		String[][] data = new String[rowCount][cellCount];
		for (int i = 1; i <= rowCount; i++) {
		Row row = sheet.getRow(i);
		for (int j = 0; j < cellCount; j++) {
		Cell cell = row.getCell(j);
		if (cell.getCellType() == CellType.STRING) {
		data[i - 1][j] = cell.getStringCellValue();
		} else {
		data[i - 1][j] = String.valueOf(cell.getNumericCellValue());
		}
	//	System.out.print(cell);
		}
    //    System.out.println(row);
		}

		return data;
		
			}
}
