package com.sudlife;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelSheet {
	
	public XSSFSheet readExcelSheet() throws Exception {
		File file =new File(".\\src\\test\\resources\\ReadData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook =new XSSFWorkbook(fis);
		XSSFSheet sheet =workbook.getSheetAt(0);
		fis.close();
		workbook.close();
		return sheet;
		
	}

}
