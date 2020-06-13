package xlsxread;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class xlsxread3 {

public void readspecificcell(int rownumber, int cellnumber, String path) throws IOException
	{
		File f = new File(path);
		FileInputStream fi = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet sheet = wb.getSheetAt(0);

		int rowcount = sheet.getPhysicalNumberOfRows();
		  XSSFRow row = sheet.getRow(rownumber-1);
			  XSSFCell cell = row.getCell(cellnumber-1);
			  System.out.println(cell.getStringCellValue());
		  
	}
	
public static void main(String[] args) throws IOException {
		
	xlsxread3 ob = new xlsxread3();
	ob.readspecificcell (2,2,"E:\\Selenium Classes\\Day 18\\Read from this xlsx.xlsx");

  }
}
