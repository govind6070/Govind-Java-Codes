package pkg;

public class Class4 extends Class3 {
	public void operation (int a, int b) {
		int c;
		c=a-b;
		System.out.println("Second possibility result is "+c);
}
	public static void main(String[] args) {
		Class4 ob = new Class4();
		System.out.println("This is method overriding");
		ob.operation(3, 2);
				
	}
}