package javaInterview;

public class Overloading  extends Y
{
	 public static void main(String[] args)
	    {
		 Overloading obj = new Overloading();
		 obj.staticMethod(7);
	    }
}

class X
{
    public static void staticMethod(int b)
    {
        System.out.println("Class X");
    }
}
class Y extends X
{
     public static  void staticMethod(int a)
    {
        System.out.println("Class Y");
    }
}
