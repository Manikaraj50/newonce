package com.fb;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheetCreate {
	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\Aparna Vincent\\OneDrive\\Desktop\\manick\\jona.xlsx");
		
		Workbook book=new XSSFWorkbook();
		
		Sheet createSheet = book.createSheet("jons");
		Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("jona");
		
		FileOutputStream out=new FileOutputStream(f);
		book.write(out);
		
		
		
		
		
	}

}
