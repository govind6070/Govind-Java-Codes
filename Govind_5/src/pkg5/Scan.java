package pkg5;
import java.util.Scanner;
public class Scan {	
	public int sum (int a, int b)
	{
		int c;
		c=a+b;return c;
	}	
	public int sub (int a,int b)
	{
		int c;
		c=a-b;return c;	
	}	
	public int mul (int a, int b)
	{
		int c;
		c= a*b;return c;
	}	
	public void div (int a, int b)
	{
		int c;
		c=a/b;
		System.out.println("Output is " +c);	
	}
public static void main(String[] args) {
	System.out.println("Lets solve ((((x1+x2)-x3)*x4)+2)/2) ");
	Scanner input = new Scanner(System.in);
	System.out.println("Ënter value of x1");
	int x1= input.nextInt();
	System.out.println("Ënter value of x2");
	int x2= input.nextInt();
	System.out.println("Ënter value of x3");
	int x3= input.nextInt();
	System.out.println("Ënter value of x4");
	int x4= input.nextInt();
	Scan ob = new Scan();
	int sum1 = ob.sum(x1, x2);
	int sub= ob.sub(sum1, x3);
	int mul= ob.mul(sub, x4);
	int sum2= ob.sum(mul, 2);
	ob.div(sum2, 2);
}
}
