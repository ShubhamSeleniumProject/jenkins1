package com.tyss.genericUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	public String getDataFromExcel(String sheetname,int rownum,int colnum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/Test_Data/exceldata.xlsx");
		
		Workbook wkbook = WorkbookFactory.create(fis);
		
	return	wkbook.getSheet(sheetname).getRow(rownum).getCell(colnum).getStringCellValue();
		
		
		
		
	}

}
