package pkg1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class String5 {
	
public void filereadandcount(String path) throws IOException
{

File f = new File(path);
FileReader fr = new FileReader(f);
BufferedReader fb = new BufferedReader(fr);
String line = fb.readLine();

int linenumber=0;
int words=0;
int characters=0;

while(line!=null)
{

linenumber++;
String[] s = line.split(" ");
words = words + s.length;
int l = s.length;

   for (String word:s)
   {
   characters = characters + word.length();		 
   }
line= fb.readLine();   
}
System.out.println("Total Lines in file: "+linenumber);
System.out.println("Total words in file: "+words);
System.out.println("Total characters in file: "+characters);
fb.close();		
}

public static void main(String[] args) throws IOException {

Scanner s = new Scanner(System.in);
System.out.println("Provide File path");
String path= s.nextLine();
String5 ob = new String5();
ob.filereadandcount(path);	
}	
	
}
