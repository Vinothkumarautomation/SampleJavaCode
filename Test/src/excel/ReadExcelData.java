package excel;

public class ReadExcelData {

	public static void main(String[] args) throws Exception {
		ExcelData excel= new ExcelData("C:\\Users\\vinoth.k.selvaraj\\Desktop\\FirstSelenium\\Testdata\\Testdata.xlsx");
		System.out.println(excel.TestData(0, 0, 1));
		

	}

}
