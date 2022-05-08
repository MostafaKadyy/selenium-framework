package data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	static FileInputStream fis = null;

	public FileInputStream getFileInputStream() 
	{
		String filePath ="E:\\mostafa\\.1testing\\tef\\src\\test\\java\\data\\UserData.xlsx";
		File srcfile = new File(filePath);
		try {
			fis = new FileInputStream(srcfile);
		} catch (FileNotFoundException e) {
			System.out.println("error occured : check file path");
		}
		return fis;

	} 
	public Object[][] getExcelData() throws IOException
	{
		fis = getFileInputStream();
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		int totalNoRows = sheet.getLastRowNum()+1;
		int totalNoCols = 5;
		
		String[][] arrayExcselData = new String[totalNoRows][totalNoCols];
		
		for (int i = 0; i < totalNoRows; i++) {
			
			for (int j = 0; j < totalNoCols ; j++) {
				
				XSSFRow row = sheet.getRow(i);
				arrayExcselData[i][j]= row.getCell(j).toString();	
			}
		}
		wb.close();
		return arrayExcselData;								
	}

}
