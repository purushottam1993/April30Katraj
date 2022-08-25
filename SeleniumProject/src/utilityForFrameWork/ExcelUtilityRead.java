package utilityForFrameWork;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilityRead {
	
	public String ExcelRead(int SheetNo,int rowValue, int cellValue ) throws IOException {
		
		File path = new File("D:\\poi-bin-5.2.0-10Aug\\SeleniumWorkSheet.xlsx");
		
		FileInputStream load = new FileInputStream(path);
		
		XSSFWorkbook workbook = new XSSFWorkbook(load);
		
		XSSFSheet sheet1 = workbook.getSheetAt(SheetNo);
		return sheet1.getRow(rowValue).getCell(cellValue).getStringCellValue();
	}
	public static void main(String[] args) throws IOException {
		ExcelUtilityRead obj = new ExcelUtilityRead();
		   obj.ExcelRead(0, 0, 0);
		   obj.ExcelRead(0, 0, 1);
		   obj.ExcelRead(0, 0, 2);
	}

}
