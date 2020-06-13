package pkg4;

public class constructor1 {
	
	public constructor1(int a,int b,int c, int d)
	{
		this (1);
		System.out.println("Four Parameterized Constructor");
	}
 public constructor1(int a)
 {
	this (1,2,3);
	 System.out.println("One Parameterized Constructor");
 }
 
 public constructor1(int a,int b ,int c) 
 {
	 this ();
	System.out.println("Three Parameterized Constructor");
 }
 
 public constructor1() 
 {
	 this (1,2);
System.out.println("Default Constructor");
}
 
public constructor1(int a, int b) 
{
	System.out.println("Two parameterized Constructor");
}
 
public static void main(String[] args) {
	constructor1 obj = new constructor1(1,2,3,4);
}

}
