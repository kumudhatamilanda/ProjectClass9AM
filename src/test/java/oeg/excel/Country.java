package oeg.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Country {
	public static void main(String[] args) throws IOException, InterruptedException {
File f = new File("C:\\Users\\GOWTHAM\\eclipse-workspace\\Excel\\Excel Sheet\\Data.xlsx");
	Workbook w= new XSSFWorkbook();
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOWTHAM\\eclipse-workspace\\Excel\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.get("http://demo.automationtesting.in/Register.html");
	WebElement country = driver.findElement(By.id("countries"));
	Select sel=new Select(country);
	List<WebElement> opt = sel.getOptions();
	List<String> options = new ArrayList<String>();
	for (int i = 0; i < opt.size(); i++) {
		WebElement element = opt.get(i);
		options.add(element.getText());
		}
	
	Sheet s = w.createSheet("Sheet1");
	Row row = s.createRow(0);
	Cell c = row.createCell(0);
	c.setCellValue("country");
	for(int k =1;k<options.size();k++)
	{
	Row nrow = s.createRow(k);	
	for(int j = 0;j<=0;j++)
	{
		Cell ncell = nrow.createCell(j);
		ncell.setCellValue(options.get(k));
	}
	}
	FileOutputStream op=new FileOutputStream(f);
	w.write(op);
	System.out.println("done");

}
}