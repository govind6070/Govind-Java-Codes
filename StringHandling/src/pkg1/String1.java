package pkg1;

import java.util.Scanner;

public class String1 {
	
public void reverseword(String p)
{
System.out.println("Input string is -");
System.out.println(p);
String[] k= p.split(" ");
int l =k.length;
System.out.println("Output string is -");

for (int i=l-1; i>=0; i--)
  {
   System.out.print(k[i]+" ");
  }	
	
}

public static void main(String[] args) {

Scanner s = new Scanner(System.in);
System.out.println("Enter the String");
String a= s.nextLine();
String1 ob = new String1();
ob.reverseword(a);	
}	
	
}
