package com.xcelTech.qa.Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;

import com.sun.media.sound.InvalidFormatException;
import com.xcelTech.qa.Base.TestBase;


/*public class TestUtil extends TestBase{

	
	
	public TestUtil() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	public static long PAGE_LOAD_TIMEOUT=20;
	public static long IMPLICIT_WAIT=10;
	
	
	public void swiching() {
		
		driver.switchTo().frame("mainpanel");
	}
	
	
public static String TESTDATA_SHEET_PATH="C:\\Users\\ayalt\\eclipse-workspace\\xcelTechCRMTest\\src\\main\\java\\com\\xcelTech\\qa\\TestData\\XcelTechTesyData.xlsx";
	
	static Workbook book;
	static org.apache.poi.ss.usermodel.Sheet sheet;
	
			
	public static Object[][] getTestData(String SheetName) throws EncryptedDocumentException, org.apache.poi.openxml4j.exceptions.InvalidFormatException {
		
		FileInputStream File=null;
		try {
			File=new FileInputStream(TESTDATA_SHEET_PATH);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}
		
		try {
			
			book = WorkbookFactory.create(File);
		}catch(InvalidFormatException e) {
			e.printStackTrace();
		}catch (IOException e) {
			
			e.printStackTrace();
		}
		
		sheet = book.getSheet(SheetName);
		Object[][] data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		for(int i=0;i<sheet.getLastRowNum(); i++) {
			
			 for(int k=0;k<sheet.getRow(0).getLastCellNum(); k++) {
				 
				 data[i][k]=sheet.getRow(i+1).getCell(k).toString();
			 }
		}
		
		return data;
	}

}
	

*/



public class TestUtil extends TestBase {

	public TestUtil() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;

	public static String TESTDATA_SHEET_PATH = "C:\\Users\\ayalt\\eclipse-workspace\\xcelTechCRMTest\\src\\main\\java\\com\\xcelTech\\qa\\TestData\\XcelTechTesyData.xlsx";
			

	static Workbook book;
	static Sheet sheet;
	static JavascriptExecutor js;

	public void switchToFrame() {
		driver.switchTo().frame("mainpanel");
	}

	public static Object[][] getTestData(String sheetName) throws EncryptedDocumentException, org.apache.poi.openxml4j.exceptions.InvalidFormatException {
		FileInputStream file = null;
		try {
			file = new FileInputStream(TESTDATA_SHEET_PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		// System.out.println(sheet.getLastRowNum() + "--------" +
		// sheet.getRow(0).getLastCellNum());
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
				// System.out.println(data[i][k]);
			}
		}
		return data;
	}



}

