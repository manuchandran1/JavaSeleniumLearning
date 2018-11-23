package com.learnjava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadWrite 

{
	
public static void main(String[] args) throws Exception 
{
	
	FileInputStream fis = new FileInputStream("/Users/shify/Documents/Workspace/Framework/AgeValidation_ExxelRW.xlsx");
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	
	XSSFSheet sheet = wb.getSheet("Sheet1");
	
	int RowCount = sheet.getLastRowNum();
	System.out.println(RowCount);
	
	for (int i =1; i<=RowCount; i++)
	{
		XSSFCell cell = sheet.getRow(i).getCell(1);
		String CellText = "";
		
		if(cell.getCellType() == Cell.CELL_TYPE_STRING) 
		{
			CellText = cell.getStringCellValue();
		}
		if(cell.getCellType() == Cell.CELL_TYPE_NUMERIC) 
		{
			CellText = String.valueOf(cell.getNumericCellValue());
		}
		
		if(cell.getCellType() == Cell.CELL_TYPE_BLANK) 
		{
			CellText = "";
		}
		
		double Age = Double.parseDouble(CellText);
		
		if(Age>=18)
		{
			sheet.getRow(i).getCell(2).setCellValue("Major");
		}
		else 
		{
			sheet.getRow(i).getCell(2).setCellValue("Minor");
		}
		
	}
	
	fis.close();

	FileOutputStream fos = new FileOutputStream("/Users/shify/Documents/Workspace/Framework/AgeValidation_ExxelRW.xlsx");
	wb.write(fos);
	fos.close();
			
}	

}
