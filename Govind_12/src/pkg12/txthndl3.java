package pkg12;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class txthndl3 {

public void FileWriteBasedUponRange() throws IOException
{
File f = new File("C:\\Users\\Govind\\Desktop\\write 2.txt");
FileWriter fw= new FileWriter(f,true);
BufferedWriter b = new BufferedWriter(fw);
Scanner s = new Scanner(System.in);	
System.out.println("Enter the line number till which you want to write the data");
int a=s.nextInt();	
System.out.println("Provide "+a +" lines");
Scanner s1 = new Scanner(System.in);
int k=1;
String w;
   while (k<=a)
   { 
	 w= s1.nextLine();
	 b.write(w);
	 b.newLine();
     k=k+1;
   }
   b.close();
}

public static void main(String[] args) throws IOException 
{
txthndl3 m = new txthndl3();
m.FileWriteBasedUponRange();
}	
}
