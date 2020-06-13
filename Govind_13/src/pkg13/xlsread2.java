package pkg13;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class xlsread2 {

	public void cellread(int a,int b,String path) throws BiffException, IOException
	{
	File f = new File(path);
	Workbook wk = Workbook.getWorkbook(f);
	Sheet ws= wk.getSheet(0);
	int r =ws.getRows();
	int c =ws.getColumns();

	for (int i=0;i<r;i++)
		
	{
		for (int j=0;j<c;j++)
		{
			Cell c1= ws.getCell(j, i);	
            if(i==b)
            {
			System.out.println(c1.getContents());
            }
		}
		
			
	}
	
	}
	
public static void main(String[] args) throws BiffException, IOException 
{
xlsread2 ob = new xlsread2();
ob.cellread(1, 1, "C:\\Users\\Govind\\Desktop\\Prog1.xls");
}
}
