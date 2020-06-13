package pkg12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class txthndle1 {
	public void FileReadBasedUponLineNumber(int a) throws IOException
	{
		File f = new File("../Govind_12/Read line 1.txt");
		FileReader fr = new FileReader(f);
		BufferedReader read = new BufferedReader(fr);
	  for (int i=1;i<a;i++) 	
	  {
		read.readLine(); 
		 if(i==a)
		  {
			  break;
		  }
	  }  
	  System.out.println(read.readLine());
	}
	
public static void main(String[] args) throws IOException {
Scanner input = new Scanner(System.in);
System.out.println( "This Program Reads specific Line Number");
System.out.println( "Enter the Line Number you want to read:");
int a= input.nextInt();
txthndle1 ob = new txthndle1();
ob.FileReadBasedUponLineNumber(a);
}	
}
