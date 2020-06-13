package pkg12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class txthndl5 {
	
	public void countchar(String path) throws IOException
	{
		File f = new File(path);
		FileReader fr = new FileReader(f);
		BufferedReader b = new BufferedReader(fr);
	    int c;
	    int i=0;
	    while((c=fr.read())!=-1)
	    {
	       if(c!=13&&c!=10&&c!=32)
	       {
	    	 i=i+1; 
	       }
	    }
	    System.out.println("File has "+i +" characters");	   
	}
	
public static void main(String[] args) throws IOException {
   txthndl5 ob = new txthndl5();
   ob.countchar("C:\\Users\\Govind\\Desktop\\characters.txt"); 
}	
}
