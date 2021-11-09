package baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

public static WebDriver driver;
	
	public static WebDriver Search_Engine(String type) {
		
		if (type.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"//Driver//chromedriver3.exe");
		driver=new ChromeDriver();
}
		else if (type.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir")+"//Driver//geckodriver.exe");
		driver =new FirefoxDriver();
}
		else if (type.equalsIgnoreCase("IE")) {
		System.setProperty("webdriver.internetexplore.driver",
				System.getProperty("user.dir")+"//Driver//ie.exe");
		driver = new InternetExplorerDriver();
}
		driver.manage().window().maximize();
		return driver;
}

	public static void get_url(String url) {
		driver.get(url);
}	
	
	public static void refresh() {
	driver.navigate().refresh();
}
	
	public static void back() {
		driver.navigate().back();
}
	
	public static void forward() {
		driver.navigate().forward();
}
	
	public static void navigateTo(String navigatedUrl) {
		driver.get(navigatedUrl);
}
	
	public static void alert(String type,String value) {
		Alert alert =driver.switchTo().alert();
		if (type.equalsIgnoreCase("accept")) {
			alert.accept();
	}
		if (type.equalsIgnoreCase("dismiss")) {
			alert.dismiss();
	}
		if (type.equalsIgnoreCase("sendkeys")) {
			alert.sendKeys(value);
			alert.accept();
	}
		if (type.equalsIgnoreCase("get text")) {
			alert.getText();
	}
}
	
	public static void action(WebElement element,String type) {
		Actions actions = new Actions(driver);
		if (type.equalsIgnoreCase("click")) {
			actions.moveToElement(element).click().perform();
	}
		if (type.equalsIgnoreCase("onlyperform")) {
			actions.moveToElement(element).perform();
	}
		if (type.equalsIgnoreCase("contextclick")) {
			actions.contextClick(element).click().perform();
	}
}
	
	public static void switchToFramebyElement(WebElement element) {
		driver.switchTo().frame(element);
}
	
	public static void switchToFramebyIndex(int value) {
		driver.switchTo().frame(value);
}
	
	public static void switchToFrameByIDorName(String value) {
		driver.switchTo().frame(value);
}
	
	public static void switchintoParentFrame() {
		driver.switchTo().parentFrame();
}
	
	public static void switchintoDefaultFrame() {
		driver.switchTo().defaultContent();
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

	public static void isMultiple(String type,WebElement element) {
		Select a=new Select(element);
		boolean multiple = a.isMultiple();
		System.out.println(multiple);
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
	
	public static void takeScrenShot(String name) throws IOException  {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File scr = ts.getScreenshotAs(OutputType.FILE);
		File des=new File(System.getProperty("user.dir")+"//ss//"+name+".png");
		FileUtils.copyFile(scr, des);
}
	
	public static void sleep(int value) throws InterruptedException {
		Thread.sleep(value);
}
	
	public static void isSelected(WebElement element) {
	boolean selected = element.isSelected();
	System.out.println(selected);
}
	
	public static void isDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);
}
	
	public static void isEnabel(WebElement element) {
		boolean enabel = element.isEnabled();
		System.out.println(enabel);
}
	public static void getText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
}
	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
}
	public static void getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
}
	
	public static void maximize() {
		driver.manage().window().maximize();
}		

	public static void javasciriptSUW(String value) {
		JavascriptExecutor sw=(JavascriptExecutor)driver;
		 sw.executeScript(value);
}
	public static void javascriptelement(WebElement element) {
		JavascriptExecutor sw=(JavascriptExecutor)driver;
		sw.executeScript("arguments[0].scrollIntoView();", element);
}
	 
	public static void javascriptclick(WebElement element){
		JavascriptExecutor sw=(JavascriptExecutor)driver;
		sw.executeScript("arguments[0].click;", element);
}		
		
	public static void Robot(String type,int value) throws AWTException {
		Robot kb=new Robot();
		if (type.equalsIgnoreCase("keypress")) {
		kb.keyPress(value);
		
	}
		else if (type.equalsIgnoreCase("keyrelease")) {
		kb.keyRelease(value);
	}
	}
	public static void close() {
		driver.close();
}
	
	public static void quit() {
		driver.quit();
}
}























