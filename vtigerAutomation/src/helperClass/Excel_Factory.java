package helperClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellAddress;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.Vtiger.constant.Constant;

public class Excel_Factory
{
	//To read test data
	//to read excel sheet
	//To write excel sheet
	//To get data from multiple sheet
	
	
	//To get the value from cell directly
	
	public static String getCellData(String filepath, String filename, String sheetname, int rownum, int cellnum) throws IOException
	{
		File file_obj = new File(filepath, filename);
		FileInputStream fileIpStream_obj = new FileInputStream(file_obj);
		XSSFWorkbook wb = new XSSFWorkbook(fileIpStream_obj);
		XSSFSheet sheet_obj = wb.getSheet(sheetname);
		
		XSSFCell cell = sheet_obj.getRow(rownum).getCell(cellnum);
		
		String cellValue = cell.getStringCellValue();
		System.out.println("cellValue = "+cellValue);
		System.out.println("******************************************");
		
		return cellValue;		
	}
		
	
	//To read the whole excel sheet
	public static void getData(String filepath, String filename, String sheetname) throws IOException
	{
		String strCellValue = "";
		
		File file_obj = new File(filepath, filename);
		FileInputStream fileIpStream_obj = new FileInputStream(file_obj);
		XSSFWorkbook wb = new XSSFWorkbook(fileIpStream_obj);
		XSSFSheet sheet_obj = wb.getSheet(sheetname);
		
		int row_count = sheet_obj.getLastRowNum();
		for(int i=0; i<row_count; i++)
		{
			int col_count = sheet_obj.getRow(0).getLastCellNum();
			for(int j=0; j<col_count; j++)
			{
				XSSFCell cellValue = sheet_obj.getRow(i).getCell(j);				
				
				if(cellValue.getCellType() == Cell.CELL_TYPE_NUMERIC)
				{
					int numericValue = (int) cellValue.getNumericCellValue();
					//double numericValue =  cellValue.getNumericCellValue();
					//System.out.println("numericValue = "+numericValue);
				}
				/*else if(cellValue.getCellType() == Cell.CELL_TYPE_NUMERIC)
				{
					double Value = cellValue.getNumericCellValue();
					System.out.println("EnumValue = "+Value);
				}*/
				else
				{
					strCellValue = cellValue.getStringCellValue();					
				}
				System.out.println("strCellValue = "+strCellValue);
			}
		}
		
			//getPhysicalNumberOfCells()
	}

	
	//To write excel sheet
	public static void write_excel (String filepath, String filename, String sheetname) throws IOException
    {
                   Workbook workbook=null ;
                   Sheet sheet = null;
                   Row row=null;
                   File file = new File (filepath+"\\"+filename);
                   file.createNewFile();
                   
                   FileInputStream fis = new FileInputStream (file);
                   String fileext = filename.substring(filename.indexOf("."));
                   if (fileext.equals(".xlsx"))
                   {
                                 XSSFWorkbook workbook1 = new XSSFWorkbook (fis); 
                                 XSSFSheet sheet1 =  (XSSFSheet) workbook.createSheet(sheetname);
                                 //XSSFSheet sheet =  workbook.getSheet(sheetname);
                                 row= sheet1.createRow(0);
                   
                   }
                   else if (fileext.equals(".xls"))
                   {
                                 HSSFWorkbook workbook2 = new HSSFWorkbook (fis);
                                 HSSFSheet sheet2 =  workbook2.createSheet(sheetname);
                                 //HSSFSheet sheet2 =  workbook.getSheet(sheetname);
                                 row = sheet2.createRow(0);
                   }
                                 
                   for (int i = 0;i<10;i++)
                   {
                                 System.out.println("This is for i");
                                 Row row1 = sheet.createRow(i);
                                 for (int j = 0;j<10;j++)
                                 {
                                                System.out.println("This is for j");
                                                Cell cell = row1.createCell(j);
                                                cell.setCellValue("This is Row "+i+" and Cell " +j);
                                 }
                                 
                   }
                   
                   fis.close();
                   FileOutputStream fos = new FileOutputStream(file);
                   workbook.write(fos);
                   fos.close();
                   System.out.println("File has wrote");
                   
    }
	
	
	
	
	public static void main(String[] args) throws IOException 
	{
		getCellData(Constant.Path_TestData, Constant.File_TestData, Constant.Sheet_NameData, 1, 1);
		getData(Constant.Path_TestData, Constant.File_TestData, Constant.Sheet_NameData);
		write_excel(Constant.Path_TestData, Constant.File_TestData, Constant.Sheet_NameData);
	}
}
