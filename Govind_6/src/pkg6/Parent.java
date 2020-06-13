package pkg6;

public class Parent {

	public Parent()
	{
		this(1,2,3);
    System.out.println("Parent Default Constructor");	
	}
	
	public Parent (int a,int b,int c) {
	
		System.out.println("Parent 3 parameterized Constructor");
	}
	
	public Parent(int a) {
		this();
		System.out.println("Parent 1 parameterized Constructor");
	}
	
	public Parent(int a,int b) {
		this(1);
		System.out.println("Parent 2 parameterized Constructor");
	}
}

