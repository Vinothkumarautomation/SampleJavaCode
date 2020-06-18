package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class TestData {


		public static void main(String[] args) throws IOException {
			
			File src = new File("C:\\Users\\vinoth.k.selvaraj\\eclipse-workspace\\FirstSelenium\\Testdata\\Testdata.xlsx"); 
			FileInputStream fis = new FileInputStream(src);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
				XSSFSheet Sheet1 =wb.getSheetAt(0);
				String data =Sheet1.getRow(0).getCell(0).getStringCellValue();
				System.out.println(data);
				String data1 =Sheet1.getRow(0).getCell(1).getStringCellValue();
				System.out.println(data1);
				String data3 =Sheet1.getRow(1).getCell(0).getStringCellValue();
				System.out.println(data3);
				String data4 =Sheet1.getRow(1).getCell(1).getStringCellValue();
				System.out.println(data4);
				
				Sheet1.getRow(0).createCell(2).setCellValue("Pass");
				Sheet1.getRow(1).createCell(2).setCellValue("Fail");
				FileOutputStream fot= new FileOutputStream(src);
				wb.write(fot);
				wb.close();


	
		}
}

