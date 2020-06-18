package excel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Facebook {
	
	public static String excelPath="C:\\Users\\vinoth.k.selvaraj\\eclipse-workspace\\FirstSelenium\\Testdata\\Testdata.xlsx";
	
	@Test(dataProvider="Facebooktestdata")
	public void verifyfacebook(String Username , String Password) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vinoth.k.selvaraj\\Desktop\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Username);
		Thread.sleep(2000);
		driver.findElement(By.xpath(" //input[@id='pass']")).sendKeys(Password);
		
	 driver.findElement(By.xpath("//input[@value='Log In']")).sendKeys(Keys.ENTER);;
		//JavascriptExecutor executor = (JavascriptExecutor)driver;
		//executor.executeScript("arguments[0].click();", element);
		
		driver.quit();
		
		
	}
	
	
	@DataProvider(name="Facebooktestdata")
	public Object[][] TestDataFeed() throws Exception{
		
   ExcelData Excel = new ExcelData(excelPath);
   int rownum=Excel.getRowCount(0);

   Object [][] data=new Object[rownum][2];

      for(int i=0;i<rownum;i++) {
	
	data[i][0]=Excel.TestData(0, i,0);
	data[i][1]=Excel.TestData(0, i,1);

	
}

/*
 * data[0][0]="vinothluv@gmail.com"; data[0][1]="Cognizant@123";
 * 
 * data[1][0]="vinothluv1@gmail.com"; data[1][1]="Cognizant@123";
 */
		return data;
	}
	}


