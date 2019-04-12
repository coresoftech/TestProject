package jdbc_Testing;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;

	//import com.sql.jdbc.Connection;
	import java.sql.Statement;
	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.LinkedHashMap;
	import java.util.List;
	import  java.sql.SQLException;


	public class demo_Code 
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
				
				
				String queryTable = "show table";
				
				
				
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
				   for(int i=0; i<=5; i++)
				   {
						stmt.execute(query3);
				   }
				   	
				   ResultSet rs= stmt.executeQuery(query0);
				   
					System.out.println("Inserte Querry Sucessfully ");
						
						//******* While Loop to iterate through all data and print results
						
						
						
						List<HashMap> lObj = new ArrayList<HashMap>();
						
						
					while (rs.next())
					{
						LinkedHashMap<String, String> lhmObj = new LinkedHashMap<String, String>();
						
				        		String myStdId = rs.getString(1);
				        		String myName = rs.getString(2);
				        		String myAge = rs.getString(3);
				        		String myStd = rs.getString("std");
				                String myCity = rs.getString("city");					                               
				              
				                lhmObj.put("myStdId", myStdId);
				                lhmObj.put("myName", myName);
				                lhmObj.put("myAge", myAge);
				                lhmObj.put("myStd", myStd);
				                lhmObj.put("myCity", myCity);
				                
				                lObj.add(lhmObj);
				                		                
				
					}
						System.out.println("lObj= " +lObj);
					
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
