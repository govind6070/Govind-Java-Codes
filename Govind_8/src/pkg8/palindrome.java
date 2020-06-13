package pkg8;

import java.util.Scanner;

public class palindrome {
public static void main(String[] args) {
	Scanner ob = new Scanner(System.in);
	System.out.println("Enter the number to check if its palindrome");
	
	int num = ob.nextInt();
	int temp = num;
	int rev=0;
	int rem;
	
	while (temp!=0)
	{
		rem=temp%10;
		rev= rev*10 + rem;
		temp = temp/10;
	}
	if (num == rev)
	{
		System.out.println("Number is Palindrome");
	}
	else 
	{
		System.out.println("Number is not Palindrome");
	}
}
}
