package com.jbk.utilities;

import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

		public void getDataFromExcel() throws Exception {
		
		FileInputStream fis= new FileInputStream("PrimeShop.xlsx");
		
		Workbook wb =WorkbookFactory.create(fis);
		
		Sheet sh= wb.getSheetAt(0);
		
		int row= sh.getPhysicalNumberOfRows();
		
		int col=sh.getRow(row-1).getPhysicalNumberOfCells();
		
		for(int i=0;i<row;i++) {
			for(int j=0; j<col;j++) {
				Cell cell=sh.getRow(i).getCell(j);
				
				System.out.print(cell.toString());	
			}
			System.out.println();
		}
	}
}
