package pkg8;

import java.util.Scanner;

public class factorial {
public static void main(String[] args) {
	Scanner ob = new Scanner(System.in);
	System.out.println("Enter the number you need to know factorial of");
	int num = ob.nextInt();
	int mul =1;
	for (int i=num;i>=1;i--)
	{
		mul = i* mul;
		
	}
	System.out.println("Factorial of "+num +" is "+mul);
}
}
