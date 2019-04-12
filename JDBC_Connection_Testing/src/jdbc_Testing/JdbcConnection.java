package jdbc_Testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
//import com.sql.jdbc.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import  java.sql.SQLException;


public class JdbcConnection 
{
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
								//Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_nam
	{
		
		try {
			String dbUrl = "jdbc:mysql://localhost:3306/SqlPractice";					

			//****** Database Username		
			String username = "root";	
			
			//****** Database Password		
			String password = "root";				

			//*********  Query to Execute		
			String query0 = "select * from Student";	
			String queryCreate = "create table StudentNewTable (stuId int(25) not null auto_increment primary key, name varchar(250) not null, age int(2) not null, std varchar(150), city varchar(100))";
			String query2 = "INSERT INTO Student (stuId, name, age, std, city) VALUES ('01', 'Yammu', '08', 'UKG', 'Pune')";
			String query3 = "INSERT INTO Student (name, age, std, city) VALUES ('Tiya', '06', 'LKG', 'Pune')";
			String query4 = "INSERT INTO Student (name, age, std, city) VALUES ('Rahul', '03', 'LKG', 'Patliputrra')";
			String query5 = "INSERT INTO Student (name, age, std, city) VALUES ('Rita', '02', 'class1', 'Banzelin')";
			String query6 = "INSERT INTO Student (name, age, std, city) VALUES ('Neeta', '07', 'class3', 'Tripura')";
			
			String queryInsertGrades1 = "INSERT INTO Student (Grades) VALUES ('A+') where name = 'Yammu'";
					
			String queryUpdateGrades2 = "UPDATE Student SET Fees_Per_Month = '7600' WHERE stuId = '05'";
			
			
			String queryTable = "show table";
			
			String queryAlterTableGrades = "ALTER TABLE Student ADD Grades varchar(225)"; 
			
			String queryMaxFees= "SELECT MAX(Fees_Per_Month) AS LargestFees FROM Student";
			
			String querySumOfFees= "SELECT SUM(Fees_Per_Month) FROM Student";
			
			String queryCountFromCityPune= "SELECT COUNT(city) FROM Student";
			
			String queryDistinctCity= "SELECT DISTINCT city FROM Student";
			
			String queryAge= "SELECT * FROM Student WHERE age<=5;";
			
			
			
			    //******* Load mysql jdbc driver		
			    Class.forName("com.mysql.jdbc.Driver");			

				//******* Create Connection to DB		
			Connection con = (Connection) DriverManager.getConnection(dbUrl,username,password);

			if(con != null)
			{
				System.out.println("Connection Established successfully ");
				
				//******* Create Statement Object		
			   Statement stmt = (Statement) con.createStatement();					
			
		
			   //******* Execute the SQL Query. Store results in ResultSet
			   
				//ResultSet rs= stmt.executeQuery(query);
			   
			  // stmt.execute(queryMaxFees);
			   
			 /*  for(int i=0; i<=5; i++)
			   {
					ResultSet maxSalary = stmt.executeQuery(queryMaxFees);
					System.out.println(queryMaxFees);
			   }
			   */
			 
			   ResultSet rs = stmt.executeQuery(queryMaxFees);
			   
			   
				System.out.println("Executed Querry Sucessfully ");
					
												
					//******* While Loop to iterate through all data and print results
									
					List<HashMap> lObj = new ArrayList<HashMap>();
					
					
				while (rs.next())
				{
					LinkedHashMap<String, String> lhmObj = new LinkedHashMap<String, String>();
				ResultSetMetaData rowData = rs.getMetaData();
				int colCount = rowData.getColumnCount();
				for(int i=1; i<=colCount; i++)
				{
				String columnName = rowData.getColumnName(i).toString().trim();
				String colValue = rs.getString(i).toString().trim();
				
					              
			                lhmObj.put(columnName, colValue);
			                
			                lObj.add(lhmObj);
			                		                
			
				}
					System.out.println("lObj= " +lObj);
				}	
				
			}	else
					{
						System.out.println("Connection Established Creating some Error ");
					}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}