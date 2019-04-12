package testing;
import java.util.*;  
import java.io.*;

public class employee_Comparator 
{

	//Java Program to demonstrate the use of Java Comparable.  
	//Creating a class which implements Comparable Interface  
	  
	class Employee implements Comparable<Employee>
	{  
		int empID;  
		String empName;  
		int empAge; 
		String empContactNo;
		String empDesignation;
		int empSalary;
		
		
		Employee(int empID, String empName, int empAge, String empContactNo, String empDesignation, int empSalary)
		{  
			this.empID=empID;
			this.empName=empName;
			this.empAge=empAge;
			this.empContactNo=empContactNo;
			this.empDesignation=empDesignation;	
			this.empSalary= empSalary;
		}
		
		//To compare employee 
		public int compareTo(Employee em)
		{  
			if(empAge==45)  
			return 0;  
			else if(empAge<45)
			{
				return 1;
			}			  
			else  
			return -1;  
		}  
	}  
	
	
	/*public class AgeSorter implements Comparator<Employee> {
	    @Override
	    public int compare(Employee o1, Employee o2) {
	        return o1.getAge() - o2.getAge();
	    }
	}*/
	
	
	
	

	
	//Creating a test class to sort the elements  
	/*class TestSort3
	{  
		public static void main(String args[])
		{  
			ArrayList<Student> al=new ArrayList<Student>();  
			al.add(new Student(101,"Vijay",23));  
			al.add(new Student(106,"Ajay",27));  
			al.add(new Student(105,"Jai",21));  
			  
			Collections.sort(al);  
			for(Student st:al)
			{  
				System.out.println(st.rollno+" "+st.name+" "+st.age);  
			}  
		}  
	}  
*/
	//Collections.sort(al);
	
	public static void main(String args[])
	{ 
		employee_Comparator obj = new employee_Comparator();
	
		ArrayList<Employee> al=new ArrayList<Employee>();  
		al.add(obj.new Employee(100101,"Arjun",49,"8201876301","Software Engineer",10000));
		al.add(obj.new Employee(100102,"Arayan",24,"8201876302","Test Engineer",200000));
		al.add(obj.new Employee(100103,"Inisha",21,"8201876303","Developer",84000));
		al.add(obj.new Employee(100104,"Swapnil",86,"8201876304","Software Engineer",2500));
		al.add(obj.new Employee(100105,"Vivek",22,"8201876305","UFT",34050));
		al.add(obj.new Employee(100106,"Verra",18,"8201876306","Mainframe",82000000));
		al.add(obj.new Employee(100107,"Dom",44,"8201876307","Test Lead",6700000));
		
		  
		Collections.sort(al);
		
		//Arrays.sort(al);
		for(Employee em:al)
		{  
			System.out.println(em.empID+", "+em.empName+", "+em.empAge+", "+em.empContactNo+", "+em.empDesignation+ ", "+em.empSalary);			
		}				
	}
}

