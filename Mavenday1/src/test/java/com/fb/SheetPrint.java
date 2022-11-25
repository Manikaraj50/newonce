package com.fb;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SheetPrint {
	public static void main(String[] args) throws IOException, InterruptedException {
    //file
	File f=new File("C:\\Users\\Aparna Vincent\\OneDrive\\Desktop\\manick\\Book1.xlsx");
	FileInputStream stream =new FileInputStream(f);
	Workbook book=new XSSFWorkbook(stream);
	//sheet
	Sheet sheet = book.getSheet("Sheet1");
	Row row = sheet.getRow(0);
	Cell cell = row.getCell(0);
	String stringCellValue = cell.getStringCellValue();
	System.out.println(stringCellValue);
	Row row2 = sheet.getRow(0);
	Cell cell2 = row2.getCell(1);
	int numericCellValue = (int) cell2.getNumericCellValue();
	BigDecimal valueOf = BigDecimal.valueOf(numericCellValue);
	String string = valueOf.toString();
	System.out.println(string);
	//web
	WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com/");
    WebElement findElement = driver.findElement(By.name("email"));
    findElement.sendKeys(stringCellValue);
    WebElement findElement2 = driver.findElement(By.name("pass"));
    findElement2.sendKeys(string);
	}
}
