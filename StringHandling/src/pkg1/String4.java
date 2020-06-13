package pkg1;

import java.util.Scanner;

public class String4 {
	
public void palindstring(String str)
{
	int len=str.length();
	String reverse="";
	for(int i=len-1;i>=0;i--)
	{
	reverse=reverse + str.charAt(i);
	}
	if(str.equalsIgnoreCase(reverse))
	{
	System.out.println("String is palindrome");
	}
	else
	{
	System.out.println("String is not palindrome");
	}	
}

public static void main(String[] args) {

Scanner s = new Scanner(System.in);
System.out.println("Enter the String");
String str= s.nextLine();
String4 ob = new String4();
ob.palindstring(str);	
}	
	
}
