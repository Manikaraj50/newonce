package com.fb;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

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

public class PrintMultiLogin {
	public static void main(String[] args) throws IOException  {
		File f=new File("C:\\Users\\Aparna Vincent\\OneDrive\\Desktop\\manick\\Sheet1.xlsx");
		FileInputStream stream=new FileInputStream(f);
		Workbook book =new XSSFWorkbook(stream);
		Sheet sheet = book.getSheet("Sheet1");
		for (int i =3; i <sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			Cell cell = row.getCell(0);
			String username = cell.getStringCellValue();
			System.out.println(username);
			Row row1 = sheet.getRow(i);
	        Cell cell1 = row1.getCell(1);
		    String password= cell1.getStringCellValue();
		    System.out.println(password);
		   
		    WebDriverManager.chromedriver().setup();
		    WebDriver driver=new ChromeDriver();
		    driver.get("https://www.facebook.com/");
		    WebElement findElement = driver.findElement(By.name("email"));
		    findElement.sendKeys(username);
		    WebElement findElement1 = driver.findElement(By.name("pass"));
		    findElement1.sendKeys(password);
			
				
				
			}
		}
}

	
