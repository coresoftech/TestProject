package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelFactory extends BaseClass{
	
	
	
	public static void Excelreader(String sheetName) throws IOException{
		File src = new File("C:\\Users\\sweta.ranjan\\Desktop\\Login_Data.xlsx");
		FileInputStream fis = new FileInputStream(src);
		DataFormatter dataformatter=new DataFormatter();
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet(sheetName);
		 username=dataformatter.formatCellValue(sh.getRow(1).getCell(0));
		 password = dataformatter.formatCellValue(sh.getRow(1).getCell(1));
		 product = dataformatter.formatCellValue(sh.getRow(1).getCell(3));
		 brandName = dataformatter.formatCellValue(sh.getRow(1).getCell(5));
	}

}
