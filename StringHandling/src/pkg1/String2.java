package pkg1;

import java.util.Scanner;

public class String2 {
	
public void reverseall(String p)
{
System.out.println("Input string is -");
System.out.println(p);
System.out.println(" ");
String[] k= p.split(" ");
int l =k.length;
System.out.println("Output string is -");


for (int i=l-1; i>=0; i--)
  {
  int m = k[i].length();
    for(int j=m-1;j>=0;j--)
    {	
    System.out.print(k[i].charAt(j));
    }
    System.out.print(" ");
  }	
	
}

public static void main(String[] args) {

Scanner s = new Scanner(System.in);
System.out.println("Enter the String");
String a= s.nextLine();
String2 ob = new String2();
ob.reverseall(a);	
}	
	
}
