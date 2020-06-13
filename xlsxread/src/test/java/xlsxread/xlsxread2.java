package xlsxread;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class xlsxread2 {

public void readrowrange(int startrow, int endrow, String path) throws IOException
	{
		File f = new File(path);
		FileInputStream fi = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet sheet = wb.getSheetAt(0);

		int rowcount = sheet.getPhysicalNumberOfRows();
		for(int i=startrow-1;i<endrow;i++)
		{
		  XSSFRow row = sheet.getRow(i);
		  for (int j=0; j<row.getPhysicalNumberOfCells();j++)
		  {
			  XSSFCell cell = row.getCell(j);
			  System.out.println(cell.getStringCellValue());
		  }
		  }	
	}
	
public static void main(String[] args) throws IOException {
		
	xlsxread2 ob = new xlsxread2();
	ob.readrowrange (1,3,"E:\\Selenium Classes\\Day 18\\Read from this xlsx.xlsx");

  }
}
