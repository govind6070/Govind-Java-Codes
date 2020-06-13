package pkg14;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class xlswrite2 {

public void ReadWrite(String path) throws IOException, RowsExceededException, WriteException, BiffException
{
Scanner s = new Scanner(System.in);
System.out.println("Enter the path of file you need to read");
String data = s.nextLine();
File f = new File(path);
File f1 = new File(data);
Workbook wk = Workbook.getWorkbook(f1);
Sheet sh = wk.getSheet(0);
int r = sh.getRows();
int c = sh.getColumns();

WritableWorkbook wb = Workbook.createWorkbook(f);
WritableSheet  ws = wb.createSheet("Govind1", 0);

for (int i=0;i<r;i++)
{
  for (int j=0;j<c;j++)
  {
	  Cell c1= sh.getCell(j, i);
	  Label l = new Label(j, i, c1.getContents());
	  ws.addCell(l);	  
  }  
}
wb.write();
wb.close();
System.out.println("Data written and sheet path is "+path);
	
}
	public static void main(String[] args) throws IOException, RowsExceededException, WriteException, BiffException {
	xlswrite2 ob = new xlswrite2();
	ob.ReadWrite("C:\\Users\\Govind\\Desktop\\Write2.xls");
	}
}
