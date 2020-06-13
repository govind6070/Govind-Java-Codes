package pkg10;

import java.util.Scanner;

public class sc {
public static void main(String[] args) 

{
	Scanner ob = new Scanner(System.in);
	System.out.println("Enter the operation");
	String operation = ob.next();
	
	switch (operation.toLowerCase())
	{
		case "one":
			  System.out.println("Add");
			  break;
			
		case "two":
		     System.out.println("Subtract");
		     break;
		
		default:
			 System.out.println("Enter valid operation");
		     break;
		
	}
}

}
