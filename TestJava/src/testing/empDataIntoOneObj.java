package testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class empDataIntoOneObj
{
	public static void empInfo(String filename) throws FileNotFoundException
	{
		File file_obj = new File(filename);
		FileInputStream fileIpStream = new FileInputStream(file_obj);
		XSSFWorkbook wb_obj = new XSSFWorkbook(fileIpStream);
		sheet_obj = wb_obj.getSheetName();
		
		row_count = row_obj.size();
		col_count = col_obj.size();
		
		
	}
}
