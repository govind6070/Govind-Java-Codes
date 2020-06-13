package pkg12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class txthndl4 {

public static void main(String[] args) throws IOException {
	File f = new File("../Govind_12/Read line 1.txt");
	FileReader fr = new FileReader(f);
	BufferedReader read = new BufferedReader(fr);
	
	File f1 = new File("C:\\Users\\Govind\\Desktop\\write 3.txt");
	FileWriter fw= new FileWriter(f1,true);
	BufferedWriter b = new BufferedWriter(fw);
	
	String s;
	while((s=read.readLine())!=null)
	{
		b.write(s);
		b.newLine();

	}
	b.close();
	String path =f1.getPath() ;
	System.out.println("File written on path - "+path);
	
}	
}

