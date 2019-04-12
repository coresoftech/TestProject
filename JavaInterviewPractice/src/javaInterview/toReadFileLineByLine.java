package javaInterview;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class toReadFileLineByLine {

	public static void main(String[] args) throws IOException 
	{
		readFile();
		
		 try {            
	           File fileName = new File("C:\\Users\\sweta.ranjan\\Desktop\\Sweta Ranjan Resume CV.docx");
	            FileReader fileReader = new FileReader(fileName);     
	            BufferedReader bufferedreader = new BufferedReader(fileReader);           
	            StringBuffer sb = new StringBuffer();
	            String strLine; 
	            
	           while ((strLine = bufferedreader.readLine()) != null) 
	           {
	                sb.append(strLine);
	                sb.append("\n");        
	           }         
	           fileReader.close();
	           System.out.println(sb.toString()); 
	         } catch (IOException e) 
		 		{
	        	 	e.printStackTrace();     
		 		}

	}
	
	
	
	public static void readFile() throws IOException
	{		 
		try (Stream<String> stream = Files.lines(Paths.get("C:\\Users\\sweta.ranjan\\Desktop\\Sweta Ranjan Resume CV.docx"))) 
		{   
		 
		 stream.forEach(System.out::println);
		 
		}
	}
	
	

}
