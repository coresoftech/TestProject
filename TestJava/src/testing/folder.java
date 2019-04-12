package testing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class folder {

	public static void folderName(String filepath) throws FileNotFoundException
	{
		File folder = new File(filepath);
		File[] listOfFiles = folder.listFiles();

		for (File file : listOfFiles) 
		{
		    if (file.isFile())
		    {
		    	String eachFileName = file.getName();
		        System.out.println(eachFileName);
		        String[] f = eachFileName.split("\\.");		        
		        	String fw = f[1];
		        	System.out.println(fw);
		        	System.out.println("###################");
		        	
		    }
		}
		System.out.println("************************************************************");
	}
	
	
	public static void fileExtension(String filepath) throws FileNotFoundException
	{
		File folder = new File(filepath);
		File[] listOfFiles = folder.listFiles();

		for (File file : listOfFiles) 
		{
		    if (file.isFile())
		    {
		    	String eachFileName = file.getName();		        
		        String[] f = eachFileName.split("\\.");		        
		        	String fw = f[1];
		        	System.out.println(fw);		        
		    }
		}		
	}
	
	
	public static void totalFilelistInFolder(String filepath)
	{
		File folder = new File(filepath);
		File[] listOfFiles = folder.listFiles();

		String eachFileName= "";
		String fw= "";
		
		String t = "txt";
		String p= "pdf";
		String d= "docx";
		String x= "xlsx";
		String j= "jpg";
		
		List<String> filesWithSameNameListTXT = new ArrayList<String>();
		List<String> filesWithSameNameListPDF = new ArrayList<String>();
		List<String> filesWithSameNameListDOCX = new ArrayList<String>();
		List<String> filesWithSameNameListXLSX = new ArrayList<String>();
		List<String> filesWithSameNameListJPG = new ArrayList<String>();
		
		
		for (File file : listOfFiles) 
		{
		    if (file.isFile())
		    {
		    	eachFileName = file.getName();		        
		        String[] f = eachFileName.split("\\.");		        
		        	fw = f[1];
		        	
		        	if(fw.equalsIgnoreCase(t))
		        	{
		        		filesWithSameNameListTXT.add(eachFileName);
		        		System.out.println(fw);
		        	}
		        	if(fw.equalsIgnoreCase(p))
		        	{
		        		filesWithSameNameListPDF.add(eachFileName);
		        	}
		        	if(fw.equalsIgnoreCase(d))
		        	{
		        		filesWithSameNameListDOCX.add(eachFileName);
		        	}
		        	if(fw.equalsIgnoreCase(x))
		        	{
		        		filesWithSameNameListXLSX.add(eachFileName);
		        	}
		        	if(fw.equalsIgnoreCase(j))
		        	{
		        		filesWithSameNameListJPG.add(eachFileName);
		        	}
		        	
		    }		    
		}
		System.out.println(filesWithSameNameListPDF);
		
	}
	
	
	
	
	public static void main(String[] args) throws FileNotFoundException 
	{		
		folderName("C:\\Users\\sweta.ranjan\\Desktop\\05 Oct 18");
		fileExtension("C:\\Users\\sweta.ranjan\\Desktop\\05 Oct 18");
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		totalFilelistInFolder("C:\\Users\\sweta.ranjan\\Desktop\\05 Oct 18");
		
	}
}
