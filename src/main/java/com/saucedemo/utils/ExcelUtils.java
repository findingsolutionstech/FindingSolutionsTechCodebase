package com.saucedemo.utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static String projectPath;

	static XSSFWorkbook workbook;

	static XSSFSheet sheet;

	/**
	 * Get total number of rows
	 */
	public static void getRowCount() {

		try {

			projectPath = System.getProperty("user.dir");

			workbook = new XSSFWorkbook(projectPath + "\\Excel\\testdata.xlsx");

			XSSFSheet sheet = workbook.getSheet("Sheet1");

			int rowCount = sheet.getPhysicalNumberOfRows();

			System.out.println("No of rows are " + rowCount);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	/*
	 * 
	 * 
	 * this is doing .... 
	 */

	public static String getCellData(String sheetName, int row, int column) throws Exception {

		projectPath = System.getProperty("user.dir");

		workbook = new XSSFWorkbook(projectPath + "\\Excel\\testdata.xlsx");

		sheet = workbook.getSheet(sheetName);

		String cellData = sheet.getRow(row).getCell(column).getStringCellValue();

		System.out.println("String cell value " + cellData);
		
		

		return cellData;
	}

	
	
	
	public List<Map<String, String>> getData(String excelFilePath, String sheetName) throws EncryptedDocumentException, IOException {

		Sheet sheet = getSheetByName(excelFilePath, sheetName);

		return readSheet(sheet);
	}
	
	
	

	public List<Map<String, String>> getData(String excelFilePath, int sheetNumber) throws Exception, IOException {

		Sheet sheet = getSheetByIndex(excelFilePath, sheetNumber);

		return readSheet(sheet);
	}

	
	
	
	public Sheet getSheetByName(String excelFilePath, String sheetName) throws EncryptedDocumentException, IOException {

		Sheet sheet = getWorkBook(excelFilePath).getSheet(sheetName);
		return sheet;
	}
	
	

	public Sheet getSheetByIndex(String excelFilePath, int sheetNumber) throws EncryptedDocumentException, IOException {

		Sheet sheet = getWorkBook(excelFilePath).getSheetAt(sheetNumber);
		return sheet;
	}
	
	
	
	

	private Workbook getWorkBook(String excelFilePath) throws EncryptedDocumentException, IOException {
		return WorkbookFactory.create(new File(excelFilePath));
	}

	
	
	
	
	
	
	
	private List<Map<String, String>> readSheet(Sheet sheet) {

		Row row;

		int totalRow = sheet.getPhysicalNumberOfRows();

		List<Map<String, String>> excelRows = new ArrayList<Map<String, String>>();

		int headerRowNumber = getHeaderRowNumber(sheet);

		if (headerRowNumber != -1) {

			int totalColumn = sheet.getRow(headerRowNumber).getLastCellNum();

			int setCurrentRow = 1;

			for (int currentRow = setCurrentRow; currentRow <= totalRow; currentRow++) {
				row = getRow(sheet, sheet.getFirstRowNum() + currentRow);

				LinkedHashMap<String, String> columnMapdata = new LinkedHashMap<String, String>();

				for (int currentColumn = 0; currentColumn < totalColumn; currentColumn++) {
					columnMapdata.putAll(getCellValue(sheet, row, currentColumn));
				}

				excelRows.add(columnMapdata);
			}
		}
		return excelRows;

	}
	
	
	
	
	
	
	private int getHeaderRowNumber(Sheet sheet) {
		Row row;
		int totalRow = sheet.getLastRowNum();
		for (int currentRow = 0; currentRow <= totalRow + 1; currentRow++) {
			row = getRow(sheet, currentRow);
			if (row != null) {
				int totalColumn = row.getLastCellNum();
				for (int currentColumn = 0; currentColumn < totalColumn; currentColumn++) {
					Cell cell;
					cell = row.getCell(currentColumn, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
					if (cell.getCellType() == CellType.STRING) {
						return row.getRowNum();

					} else if (cell.getCellType() == CellType.NUMERIC) {
						return row.getRowNum();

					} else if (cell.getCellType() == CellType.BOOLEAN) {
						return row.getRowNum();
					} else if (cell.getCellType() == CellType.ERROR) {
						return row.getRowNum();
					}
				}
			}
		}
		return (-1);
	}
	
	
	
	
	

	private Row getRow(Sheet sheet, int rowNumber) {
		return sheet.getRow(rowNumber);
	}
	
	
	
	
	
	
	
	
	private LinkedHashMap<String, String> getCellValue(Sheet sheet, Row row, int currentColumn) {
		LinkedHashMap<String, String> columnMapdata = new LinkedHashMap<String, String>();
		Cell cell;
		if (row == null) {
			if (sheet.getRow(sheet.getFirstRowNum()).getCell(currentColumn, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK)
					.getCellType() != CellType.BLANK) {
				String columnHeaderName = sheet.getRow(sheet.getFirstRowNum()).getCell(currentColumn)
						.getStringCellValue();
				columnMapdata.put(columnHeaderName, "");
			}
		} else {
			cell = row.getCell(currentColumn, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
			if (cell.getCellType() == CellType.STRING) {
				if (sheet.getRow(sheet.getFirstRowNum())
						.getCell(cell.getColumnIndex(), Row.MissingCellPolicy.CREATE_NULL_AS_BLANK)
						.getCellType() != CellType.BLANK) {
					String columnHeaderName = sheet.getRow(sheet.getFirstRowNum()).getCell(cell.getColumnIndex())
							.getStringCellValue();
					columnMapdata.put(columnHeaderName, cell.getStringCellValue());
				}
			} else if (cell.getCellType() == CellType.NUMERIC) {
				if (sheet.getRow(sheet.getFirstRowNum())
						.getCell(cell.getColumnIndex(), Row.MissingCellPolicy.CREATE_NULL_AS_BLANK)
						.getCellType() != CellType.BLANK) {
					String columnHeaderName = sheet.getRow(sheet.getFirstRowNum()).getCell(cell.getColumnIndex())
							.getStringCellValue();
					columnMapdata.put(columnHeaderName, NumberToTextConverter.toText(cell.getNumericCellValue()));
				}
			} else if (cell.getCellType() == CellType.BLANK) {
				if (sheet.getRow(sheet.getFirstRowNum())
						.getCell(cell.getColumnIndex(), Row.MissingCellPolicy.CREATE_NULL_AS_BLANK)
						.getCellType() != CellType.BLANK) {
					String columnHeaderName = sheet.getRow(sheet.getFirstRowNum()).getCell(cell.getColumnIndex())
							.getStringCellValue();
					columnMapdata.put(columnHeaderName, "");
				}
			} else if (cell.getCellType() == CellType.BOOLEAN) {
				if (sheet.getRow(sheet.getFirstRowNum())
						.getCell(cell.getColumnIndex(), Row.MissingCellPolicy.CREATE_NULL_AS_BLANK)
						.getCellType() != CellType.BLANK) {
					String columnHeaderName = sheet.getRow(sheet.getFirstRowNum()).getCell(cell.getColumnIndex())
							.getStringCellValue();
					columnMapdata.put(columnHeaderName, Boolean.toString(cell.getBooleanCellValue()));
				}
			} else if (cell.getCellType() == CellType.ERROR) {
				if (sheet.getRow(sheet.getFirstRowNum())
						.getCell(cell.getColumnIndex(), Row.MissingCellPolicy.CREATE_NULL_AS_BLANK)
						.getCellType() != CellType.BLANK) {
					String columnHeaderName = sheet.getRow(sheet.getFirstRowNum()).getCell(cell.getColumnIndex())
							.getStringCellValue();
					columnMapdata.put(columnHeaderName, Byte.toString(cell.getErrorCellValue()));
				}
			}
		}
		return columnMapdata;
	}
	
	

}
