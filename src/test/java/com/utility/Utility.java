package com.utility;

import java.io.FileInputStream;

public class Utility {

	public static String getData(String fileName, String sheetName, int row , int col)throws Exception 
	{
		
		FileInputStream fis= new FileInputStream(fileName);
		
		Workbook wb =WorkbookFactory.create(fis);
		
		Sheet sh= wb.getSheet(sheetName);
		
		Cell cell=sh.getRow(row).getCell(col);
		
		String data=cell.toString();
		
		return data;
		
	}
}
