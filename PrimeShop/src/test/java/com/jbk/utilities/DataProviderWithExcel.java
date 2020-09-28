package com.jbk.utilities;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProviderWithExcel {

	@SuppressWarnings("deprecation")
	@DataProvider
	@Parameters({ "fileName", "sheetName" })
	public Object[][] getData(String fileName, String sheetName) throws Exception {
		FileInputStream fis = new FileInputStream("/src/main/resources/"+fileName);
		Workbook wb = WorkbookFactory.create(fis);
		String data[][] = null;

		Sheet sh = wb.getSheet(sheetName);
		int rows = sh.getPhysicalNumberOfRows();
		int cols = sh.getRow(rows - 1).getPhysicalNumberOfCells();

		data = new String[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				Cell cell = sh.getRow(i).getCell(j);
				switch (cell.getCellType()) {
				case Cell.CELL_TYPE_STRING:
					data[i][j] = cell.getStringCellValue();
					break;
				case Cell.CELL_TYPE_NUMERIC:
					double val = cell.getNumericCellValue();// 123456.0 in the form of double
					String doubVal = String.valueOf(val);// 123456.0 in the form of String
					String strVal = doubVal.substring(0, doubVal.indexOf('.')); // 123456
					data[i][j] = strVal;
					break;
				}
			}
		}
		return data;
	}
	
	@Test(dataProvider = "getData" )
	public void test01(String uname, String password) {
		System.out.println(uname + "  " + password );
		
	}
}
