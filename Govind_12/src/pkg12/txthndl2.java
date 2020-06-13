package pkg12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class txthndl2 {
	public void FileReadBasedUponLineNumber(int a,int b) throws IOException
	{
		File f = new File("../Govind_12/Read line 1.txt");
		FileReader fr = new FileReader(f);
		BufferedReader read = new BufferedReader(fr);
		String s;
		int i=0;
	  while ((s=read.readLine())!=null)
	  {
		  i=i+1;
		  if (i>=a&&i<=b)
		  {
			  System.out.println(s);	  
		  }      
	  } 	
	}  
	  	 
	
public static void main(String[] args) throws IOException {
Scanner input = new Scanner(System.in);
System.out.println( "This Program Reads specific Line Number Range");
System.out.println( "Enter starting Line Number:");
int a= input.nextInt();
System.out.println( "Enter ending Line Number:");
int b= input.nextInt();
txthndl2 ob = new txthndl2();
ob.FileReadBasedUponLineNumber(a,b);
}	
}
