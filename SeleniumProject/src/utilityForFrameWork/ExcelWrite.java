package utilityForFrameWork;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws IOException {
		
		File path = new File("D:\\poi-bin-5.2.0-10Aug\\SeleniumWorkSheet.xlsx");
		FileInputStream load = new FileInputStream(path);
		XSSFWorkbook workarea = new XSSFWorkbook(load);
		XSSFSheet sheet1 = workarea.getSheetAt(0);
		FileOutputStream input = new FileOutputStream(path);
		sheet1.createRow(2).createCell(3).setCellValue("UNIX");
		workarea.write(input);
	}
}
