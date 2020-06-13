package pkg11;

import java.util.Scanner;

public class primerange {
	
public static void main(String[] args) {
	Scanner ob = new Scanner(System.in);
	System.out.println("**Prime number between user specified range**");
	System.out.println("Enter range begin value");
	int a= ob.nextInt();
	System.out.println("Enter range end value");
	int b= ob.nextInt();
	System.out.println("Prime numbers between specified range are:");
	for (int i=a;i<=b;i++)
		
	 {
		int temp =0;
	    for (int j=2;j<=i/2;j++)
	    {
		    if (i%j==0)
		    {
			temp =temp+1;			
		    }
	    } 
	    
	    if(temp==0)	 
		    {
				System.out.println(i);
		    }
		 else
		    {
			temp=0; 
		    }
	    }
	}	
}