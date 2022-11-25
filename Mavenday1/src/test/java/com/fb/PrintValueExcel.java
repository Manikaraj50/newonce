package com.fb;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintValueExcel {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Aparna Vincent\\OneDrive\\Desktop\\manick\\jona3.xlsx");
		FileOutputStream out=new FileOutputStream(f);
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("iphone 14",Keys.ENTER);
		List<WebElement> iphone14 = driver.findElements(By.xpath("//span[contains(@class,'a-size-medium a-color-base a-text-normal')][1]"));
		System.out.println("-----------iphone Name------------");
		for (int i = 1; i <=10; i++) {
			WebElement webElement = iphone14.get(i);
			String text = webElement.getText();
			System.out.println(text);
			
			
			Workbook book=new XSSFWorkbook();
			
			Sheet createSheet = book.createSheet("jons");
			Row createRow = createSheet.createRow(0);
			Cell createCell = createRow.createCell(0);
			createCell.setCellValue(text);

			
			
			book.write(out);
		}
		
		
	}

}
