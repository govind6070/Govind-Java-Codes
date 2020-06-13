package xlsxread;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class xlsxread {
	
public void readspecificrow(int rownumber, String path) throws IOException
{
	File f = new File(path);
	FileInputStream fi = new FileInputStream(f);
	XSSFWorkbook wb = new XSSFWorkbook(fi);
	XSSFSheet sheet = wb.getSheetAt(0);

	int rowcount = sheet.getPhysicalNumberOfRows();
	  XSSFRow row = sheet.getRow(rownumber-1);
	  for (int j=0; j<row.getPhysicalNumberOfCells();j++)
	  {
		  XSSFCell cell = row.getCell(j);
		  System.out.println(cell.getStringCellValue());
	  }
	  }
public static void main(String[] args) throws IOException {
xlsxread ob = new xlsxread();
ob.readspecificrow (2,"E:\\Selenium Classes\\Day 18\\Read from this xlsx.xlsx");

}

}