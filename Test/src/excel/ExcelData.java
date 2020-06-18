package excel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {

	
	//Tesitng Workbook
	XSSFWorkbook wb;
	XSSFSheet Sheet;


	public ExcelData(String excelPath) throws Exception {

		File src = new File(excelPath);
		FileInputStream fis = new FileInputStream(src);
		wb = new XSSFWorkbook(fis);
		

	}

	public String TestData(int Sheetname, int row, int coloumn) {
		Sheet = wb.getSheetAt(0);

		String data = Sheet.getRow(row).getCell(coloumn).getStringCellValue();

		return data;

	}
	
	public int getRowCount(int sheetIndex) {
		int row=wb.getSheetAt(sheetIndex).getLastRowNum();
		row=row+1;
		return row ;
		
	}
}
