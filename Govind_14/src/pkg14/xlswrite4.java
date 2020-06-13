package pkg14;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class xlswrite4 {

public void ParticularLine(int a,int b, String path) throws IOException, RowsExceededException, WriteException
{
Scanner s = new Scanner(System.in);
System.out.println("Enter the data you want to write");
String data = s.next();
File f = new File(path);
WritableWorkbook wb = Workbook.createWorkbook(f);
WritableSheet  ws = wb.createSheet("Govind2", 0);

for (int i=0;i<a;i++)
{
  for (int j=0;j<b;j++)
  {
	  if(j==b-1)
	  {	 
	  Label l1 = new Label(j, i, data);
	  ws.addCell(l1);
	  }
  }  
}
wb.write();
wb.close();
System.out.println("Data written and sheet path is "+path);
	
}
	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
	xlswrite4 ob = new xlswrite4();
	ob.ParticularLine(3, 5,"C:\\Users\\Govind\\Desktop\\Write4.xls");
	}
}
