package pkg8;

import java.util.Scanner;

public class primecheck {

public static void main(String[] args)
  {
	Scanner ob = new Scanner(System.in);
	System.out.println("Please enter the number");
	int a = ob.nextInt();
	int count = 0;

	if(a==0||a==1)  //if condition to check if user entered 0 or 1
    {
	System.out.println(a+" is not a prime number");	
	}
	else {
	for (int i=2;i<a;i++) // for loop running till entered number minus 1
	{
		if (a%i==0)   // if condition checking if we get remainder 0 anytime while loop is running
		{
			count=1; // count would set to 1 if number is perfectly divisible
			break;	// exit the loop as soon as number is perfectly divisible
		}
	}
	if (count==0) // if count would remain 0 it means number is not perfectly divisible and hence Prime Number
	{
		System.out.println("Entered number is Prime Number");
	}
	
	else // else count would is 1 and it means number is perfectly divisible and hence not Prime Number
	{
		System.out.println("Entered number is not Prime Number");
	}
	
  }
  }
}	