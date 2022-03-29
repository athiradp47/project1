package org.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.text.Element;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public static void getBrowser(String browserName) {
		switch (browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		default:
			System.out.println("invalid browser name");
			break;
		}
	}

	public static void launchUrl(String url) {
		driver.get(url);
	}

	// public WebElement findElements(String locator,String value) {
	// WebElement element = null;
	// switch (locator) {
	// case "id":
	// driver.findElement(By.id(value));
	// break;
	// case "name":
	// driver.findElement(By.name(value));
	// break;
	// case "xpath":
	// driver.findElement(By.xpath(value));
	// break;
	// default:
	// System.out.println("Invalid locator");
	// break;
	//
	// }
	// return element;
	// }
	public void enterTextByJs(WebElement element, String data) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value''" + data + "')", element);

	}

	public static void typeText(WebElement element, String data) {
		element.sendKeys(data);
	}

	public static   String getDataFromExcel(int rowNo, int cellNo) throws IOException {
		File file = new File("C:\\Users\\user\\eclipse-workspace\\BrowserLaunch\\Excel\\blaze.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("Sheet2");
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		CellType cellType = cell.getCellType();
		String value = "";
		switch (cellType) {
		case STRING:
			value = cell.getStringCellValue();
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dcv = cell.getDateCellValue();
				SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
				value = format.format(dcv);
			} else {
				double ncv = cell.getNumericCellValue();
				BigDecimal decimal = BigDecimal.valueOf(ncv);
				value = decimal.toString();
			}

		default:

			break;
		}
		return value;

	}

	public WebElement locateByXpath(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		return element;
	}

	public static void btn(WebElement element) {
		element.click();

	}

	public void dropDown(WebElement element, String data) {
		Select s = new Select(element);
		s.selectByVisibleText(data);
	}

	public void dropDownByI(WebElement element, int i) {
		Select s = new Select(element);
		s.selectByIndex(i);
	}

	public void dropDownV(WebElement element, String data) {
		Select s = new Select(element);
		s.selectByValue(data);
	}

	public static void insertDataToExcel(WebElement element, int rowNo, int cellNo) throws IOException {
		String attribute = element.getAttribute("value");
		System.out.println(attribute);
		File file = new File("C:\\Users\\user\\eclipse-workspace\\BrowserLaunch\\Excel\\blaze.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("Sheet2");
		Row row = sheet.getRow(rowNo);
		Cell cell = row.createCell(cellNo);
		cell.setCellValue(attribute);
		FileOutputStream out = new FileOutputStream(file);
		workbook.write(out);

	}

	public void scrollDown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	
	public static void takingScreenshot(String pathname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotAs, new File(pathname + ".png"));
		
	}
	
	public void jsClick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}
	
	
	
	

}
