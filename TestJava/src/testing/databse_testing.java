package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class databse_testing 
{
	
	//Testdata
	string email = "swetran1112@gmail.com";
	String zipcode = "22222";
	String firstname = "sweta";
	String lastname = "ranjan";
	
	
	//Input testdata using selenium
	WebDriver driver = new FirefoxDriver();
	driver.findElement(By.xpath("")).sendKeys(email);
	driver.findElement(By.xpath("")).sendKeys(zipcode);
	driver.findElement(By.xpath("")).sendKeys(firstname);
	driver.findElement(By.xpath("")).sendKeys(lastname);
		
	
	
	Connection conn = null;
	string url = "jdbc:mysql://localhost:3306/";
	string databaseName = "mydatabase";
	string username = 'root';
	string password = 'root';
	
	try{
	
		class.forName("com.mysql.jdbc.Driver");
		
		conn = DriverManager.getConnection(url+databaseName, username, password);
		
		//sql Querry
		//String sqlQuerry = "Select * from signupdetails";
		String sqlQuerry = "Select * from signupdetails ORDER BY signupid LIMIT 2";
		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery(sqlQuerry);
		
		
		result.next();
		System.out.println(result.getString("emailaddress"));
		System.out.println(result.getString("zipcode"));
		System.out.println(result.getString("firstname"));
		System.out.println(result.getString("lastname"));
			
		//Database testing
		If(!result.getString("emailaddress").equals(email))		
			System.out.println(result.getString("email id is stored wrong"));
		
		If(!result.getString("zipcode").equals(zipcode))		
		System.out.println(result.getString("zipcode is stored wrong"));			
	
		If(!result.getString("firstname").equals(firstname))		
		System.out.println(result.getString("firstname is stored wrong"));			
	
		If(!result.getString("lastname").equals(lastname))		
		System.out.println(result.getString("lastname is stored wrong"));			
	
		
		
	}catch(Exception e){
		System.out.println(e);
	}finally{
		if(conn != null){
			conn = null;
		}
	}
	
}
