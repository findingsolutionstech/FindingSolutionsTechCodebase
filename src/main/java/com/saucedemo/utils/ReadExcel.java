package com.saucedemo.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	
	
	
	
	
public static void main(String[] args) {
		
		
		try {
		File src = new File("C:\\Users\\Kevin\\FindingSolutions\\serenity\\Excel\\testdata.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		String data0 = sheet.getRow(3).getCell(1).getStringCellValue();
		System.out.println("Data from Excel is " + data0);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	public String getData(String sheetName, int row, int column) throws IOException {
		
		File src = new File("C:\\Users\\Kevin\\FindingSolutions\\serenity\\Excel\\testdata.xlsx");
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet(sheetName);
		
		String data = sheet.getRow(row).getCell(column).toString();
		
		
		return data;
		
	}
	
	
	
	
	
	
	public String getData(Integer sheetNumber,int row, int column) throws IOException {
		
		File src = new File("C:\\Users\\Kevin\\FindingSolutions\\serenity\\Excel\\testdata.xlsx");
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(sheetNumber);
		
		String data = sheet.getRow(row).getCell(column).getStringCellValue();
		
		
		
		return data;
		
	}
	
	
	

}
