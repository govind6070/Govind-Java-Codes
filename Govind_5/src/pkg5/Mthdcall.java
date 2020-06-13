package pkg5;

public class Mthdcall {

	public void m1(int a,int b, int c)
	{
		System.out.println("this is 3 parameterized method");
	
	}
 public void m2 () {
	 this.m1(1, 2, 3);
	 System.out.println("This is default method");
	 this.m3(1);
 }
 
 public void m3 (int a) {
	 System.out.println("This is 1 parameterized method");
	 this.m5(1, 2, 3, 4);
 }

 public void m4 (int a, int b) {
	 System.out.println("This is 2 parameterized method");
 }
 
 public void m5 (int a, int b, int c, int d)
 {
	 System.out.println("This is 4 parameterized method");
	 this.m4(1, 2);
 }
 
 public static void main(String[] args) {
	Mthdcall ob = new Mthdcall();
	ob.m2();
}
}
