package coreJava;

public class thisDemo
{
	int a=2;				//global variable
	
	public void getData()
	{
		int a=3;			//Local variable
							//In this method i want value of a to be 3.
		
		int b = a+ this.a;			//to print both variable at the same time
		
		System.out.println(a);
		System.out.println(this.a);			//this reference to current object
		System.out.println(b);
		
	}

	public static void main(String[] args) 
	{
		thisDemo td = new thisDemo();
		td.getData();
		
	}
}
