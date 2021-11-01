package org.baseclass.adactin;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass_Adactin{
	
	public static WebDriver driver;
	public static WebDriver Search_Engine(String type) {

		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", 
					System.getProperty("user.dir")+"//Driver//chromedriver3.exe");
			driver=new ChromeDriver();
}		else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir")+"//Driver//geckodriver.exe");
			driver =new FirefoxDriver();
}		else if (type.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.internetexplore.driver",
					System.getProperty("user.dir")+"//Driver//ie.exe");
			driver = new InternetExplorerDriver();
}
		driver.manage().window().maximize();
		return driver;
}
	public static void search_url(String value) {
		driver.get(value);
}
	public static void clickonelement(WebElement element) {
		element.click();
}
	public static void inputvalue(WebElement element,String value) {
		element.sendKeys(value);
}
	public static void select(String type,WebElement element,String value) {
		Select a=new Select(element);
		if (type.equalsIgnoreCase("selectbyindex")) {
			int parseint=Integer.parseInt(value);
			a.selectByIndex(parseint);
		}
		else if (type.equalsIgnoreCase("selectbyvalue")) {
			a.selectByValue(value);
		}
		else if (type.equalsIgnoreCase("selectbyvisibletext")) {
			a.selectByVisibleText(value);
			
		}
}	
	
	public static String Data_Driven_particular(String path,int rowindex, int columnindex) throws IOException {
		File datafile=new File(path);
		FileInputStream fileinput =new FileInputStream(datafile);
		Workbook dataworkbook=new HSSFWorkbook(fileinput);

		Sheet sheet = dataworkbook.getSheet("marksheet");
		System.out.println("AllDATA");

	for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(rowindex);
			
		for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(columnindex);
				CellType typecell=cell.getCellType();
			
		if (typecell.equals(typecell.STRING)) {
					String Stringvalue=cell.getStringCellValue();
			
				System.out.println("all data: "+Stringvalue);
} 
				
		else if (typecell.equals(typecell.NUMERIC)) {
				double numericCellValue = cell.getNumericCellValue();
				int value=(int) numericCellValue;
				System.out.println("alldata: "+value);
}	
				
}
}
	return path;
}
	public static void wait(int count) {
		driver.manage().timeouts().implicitlyWait(count, TimeUnit.SECONDS);
}
}
