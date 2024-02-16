package com.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class DataDriven {

	public static void dataread() throws IOException {

		File f = new File("C:\\Users\\HP\\eclipse-workspace\\JAVA\\Data_Driven\\Datas\\data.xlsx");

		FileInputStream fi = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fi);

		Sheet s = w.getSheetAt(0);

		// read single data

//		Row r = s.getRow(1);
//
//		Cell c = r.getCell(0);
//
//		CellType cellType = c.getCellType();
//
//		if (cellType.equals(CellType.STRING)) {
//			String value1 = c.getStringCellValue();
//			System.out.println("string : " + value1);
//		} else if (cellType.equals(cellType.NUMERIC)) {
//			double value2 = c.getNumericCellValue();
//			int i = (int) value2;
//			System.out.println("Numeric : " + i);
//		}

		// read entire data

		int physicalNumberOfRows = s.getPhysicalNumberOfRows();
		for (int r = 0; r < physicalNumberOfRows; r++) {
			Row row = s.getRow(r);
			int physicalNumberOfCells = row.getPhysicalNumberOfCells();
			for (int c = 0; c < physicalNumberOfCells; c++) {
				Cell cell = row.getCell(c);
				CellType cellType = cell.getCellType();
				if (cellType.equals(cellType.STRING)) {
					String stringCellValue = cell.getStringCellValue();
					System.out.print(stringCellValue + " ");
				} else if (cellType.equals(cellType.NUMERIC)) {
					double numericCellValue = cell.getNumericCellValue();
					int i = (int) numericCellValue;
					System.out.print(i + " ");
				}
			}
			System.out.println();
		}
	}
	public static void username() throws IOException {

		List<Object> userName = new ArrayList<>();
		File f = new File("C:\\Users\\HP\\eclipse-workspace\\JAVA\\Data_Driven\\Datas\\data.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);
		Sheet sheetAt = w.getSheetAt(0);
		int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
		for (int r = 0; r < physicalNumberOfRows; r++) {
			Row row = sheetAt.getRow(r);
			Cell cell = row.getCell(0);
			CellType cellType = cell.getCellType();
			if (cellType.equals(cellType.STRING)) {
				String stringCellValue = cell.getStringCellValue();
				userName.add(stringCellValue);
			} else if (cellType.equals(cellType.NUMERIC)) {
				double numericCellValue = cell.getNumericCellValue();
				int i = (int) numericCellValue;
				userName.add(i);
			}
		}
		System.out.println(userName);
		System.out.println(userName.get(3));
	}
	public static void password() throws IOException {
		List<Object> passWord = new ArrayList<>();
		File f = new File("C:\\Users\\HP\\eclipse-workspace\\JAVA\\Data_Driven\\Datas\\data.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);
		Sheet sheetAt = w.getSheetAt(0);
		int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
		for (int r = 0; r < physicalNumberOfRows; r++) {
			Row row = sheetAt.getRow(r);
			Cell cell = row.getCell(1);
			CellType cellType = cell.getCellType();
			if (cellType.equals(cellType.STRING)) {
				String stringCellValue = cell.getStringCellValue();
				passWord.add(stringCellValue);
			} else if (cellType.equals(cellType.NUMERIC)) {
				double numericCellValue = cell.getNumericCellValue();
				int i = (int) numericCellValue;
				passWord.add(i);
			}
		}
		System.out.println(passWord);
		System.out.println(passWord.get(3));
	}

	public static void main(String[] args) throws IOException {
//		dataread();
		username();
		password();
	}
}
