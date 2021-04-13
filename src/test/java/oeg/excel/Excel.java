package oeg.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
public static void main(String[] args) throws IOException {
	File f = new File("C:\\Users\\GOWTHAM\\eclipse-workspace\\Excel\\Excel Sheet\\Data.xlsx");
	
	FileInputStream stream = new FileInputStream(f);
	
	Workbook w= new XSSFWorkbook(stream);
	
	Sheet s = w.getSheet("Sheet1");
	for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
		Row row = s.getRow(i);
		for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
			Cell cell = row.getCell(j);
			System.out.println("");
		int type = cell.getCellType();
		if(type==1) {
			String value = cell.getStringCellValue();
			System.out.print("\t"+value);
		
		}
		if (type==0) {
			if (DateUtil.isCellDateFormatted(cell)) {
				String d = new SimpleDateFormat("dd-MMM-yy").format(cell.getDateCellValue());
				System.out.println("\t"+d);
			}
			
		
		else {
			String b = String.valueOf((long)cell.getNumericCellValue());
			System.out.println("\t"+b);
		}
	}
		}	
			
		}
		
	}
	
	

}
