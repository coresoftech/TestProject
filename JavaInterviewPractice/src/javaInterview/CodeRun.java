package javaInterview;

public class CodeRun extends b
{
	final static  int i = 10;   //final static variable
    final int j = 20;          //final non-static variable
int c;
final static int d;
	public void m()
	{
		System.out.println("class method m");
	}
	public static void main(String[] args)
    {
		  CodeRun obj=new CodeRun();
		int value = obj.i;
		System.out.println(value);
		obj.m();
		obj=new CodeRun();

    }
		
	

}


 class b
{
	int i=10;
}