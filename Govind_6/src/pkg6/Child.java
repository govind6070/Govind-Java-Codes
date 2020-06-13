package pkg6;

public class Child extends Parent{

	public Child()
	{
		super(1,2);
    System.out.println("Child Default Constructor");	
	}
	
	public Child(int a,int b,int c) {
		this();
		System.out.println("Child 3 parameterized Constructor");
	}
	
	public Child(int a) {
		this(1,2,3);
		System.out.println("Child 1 parameterized Constructor");
	}
	
	public Child(int a,int b) {
		this(1);
		System.out.println("Child 2 parameterized Constructor");
	}
	public static void main(String[] args) {

		Child ob = new Child(1,2);
	}
}