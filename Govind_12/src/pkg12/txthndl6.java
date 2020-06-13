package pkg12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class txthndl6 {

	public void countchar(String path) throws IOException
	{
		File f = new File(path);
		FileReader fr = new FileReader(f);
		BufferedReader b = new BufferedReader(fr);
	    String c;
	    int i=0;
	    while((c=b.readLine())!=null)
	    {
	    	 i=i+1; 
	    }
	    System.out.println("File has "+i +" lines");	   
	}
	
public static void main(String[] args) throws IOException {
   txthndl6 ob = new txthndl6();
   ob.countchar("C:\\Users\\Govind\\Desktop\\characters.txt"); 
}	
}
