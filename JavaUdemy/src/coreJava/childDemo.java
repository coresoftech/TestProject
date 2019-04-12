package coreJava;

public class childDemo extends parentDemo
{
	String name = "QuickdemoAcademy";	//local variavle
	
	
	public childDemo()
	{
		super();		//this should be always 1st line
		System.out.println("Child class constructor ");
	}
	
	
	public void getStringdata()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
	
	public void getData()
	{
		super.getData();
		System.out.println("I am child class ");
	}

	public static void main(String[] args) 
	{
		childDemo cd = new childDemo();
		cd.getStringdata();				//gives 1st preference to its local variable
		cd.getData();
	}
}
