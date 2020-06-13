package pkg8;

import java.util.Scanner;

public class swapwith {
public static void main(String[] args) {
Scanner ob = new Scanner(System.in);
System.out.println("Enter the integer value of first variable");
int a = ob.nextInt();
System.out.println("Enter the integer value of second variable");
int b = ob.nextInt();
int c;
c=a;
a=b;
b=c;
System.out.println("Value of first variable after swap is " +a);
System.out.println("value of second variable after swap is " +b);
	
}
}
