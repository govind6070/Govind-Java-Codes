package pkg8;
import java.util.Scanner;

public class swapwithout {
	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the integer value of first variable");
		int a = ob.nextInt();
		System.out.println("Enter the integer value of second variable");
		int b = ob.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Value of first variable after swap is " +a);
		System.out.println("value of second variable after swap is " +b);
			
		}
}
