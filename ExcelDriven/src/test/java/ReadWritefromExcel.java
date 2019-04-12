import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWritefromExcel 
	{

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
                       String filepath = "C:\\Users\\sweta.ranjan\\Desktop";
                       String filename = "demodata.xlsx";
                       String sheeetname = "Sheet1";
                       ReadWritefromExcel rw = new ReadWritefromExcel();
                       rw.write_excel(filepath, filename, sheeetname);
                       
        }

}
