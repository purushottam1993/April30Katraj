package utilityForFrameWork;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	public static void main(String[] args) throws IOException {
//	get path of Excel File
	File path = new File("D:\\poi-bin-5.2.0-10Aug\\SeleniumWorkSheet.xlsx");

	//Load Excel file
	FileInputStream getload = new FileInputStream(path);
	
	//Access the WorkBook OF EXCEL(Area where Actual data is written
	XSSFWorkbook workbook = new XSSFWorkbook(getload);
	
	//get sheet from workbook where we  want to read
	XSSFSheet xlSheet1 = workbook.getSheetAt(0);
	
	//get cell to read it
	String data = xlSheet1.getRow(0).getCell(0).getStringCellValue();
	System.out.println(data);
	}
	
}
