package com.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLUtils 
{

	public static FileInputStream fis;
	public static FileOutputStream fos;
	public static Workbook workbook;
	public static Sheet sheet;
	public static Row row;
	public static Cell cell;
	public static CellStyle style; 
	
	
	public static int getRowCount(String xlfile,String xlsheet) throws IOException
	{
	
		fis = new FileInputStream(xlfile);	
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet(xlsheet);
		int rowcount = sheet.getLastRowNum();
		workbook.close();
		return rowcount;		
	}	
	
	public static short getColumnCount(String xlfile,String xlsheet,int rownum) throws IOException
	{
		fis = new FileInputStream(xlfile);	
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet(xlsheet);
		row = sheet.getRow(rownum);
		short colcount = row.getLastCellNum();
		workbook.close();
		return colcount;	
	}
	
	public static String getStringCellData(String xlfile,String xlsheet,int rownum,int colnum) throws IOException
	{
		
		fis = new FileInputStream(xlfile);	
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet(xlsheet);
		row = sheet.getRow(rownum);
		 
		String data;
		try 
		{
			cell = row.getCell(colnum);
			data = cell.getStringCellValue();
		} catch (Exception e) 
		{
			data = "";
		}
		return data;
		
	}
	
	public static double getNumericCellData(String xlfile,String xlsheet,int rownum,int colnum) throws IOException
	{
		
		fis = new FileInputStream(xlfile);	
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet(xlsheet);
		row = sheet.getRow(rownum);
		 
		double data;
		try 
		{
			cell = row.getCell(colnum);
			data = cell.getNumericCellValue();
		} catch (Exception e) 
		{
			data = 0.0;
		}
		return data;		
	}
	
	public static boolean getBooleanCellData(String xlfile,String xlsheet,int rownum,int colnum) throws IOException
	{
		
		fis = new FileInputStream(xlfile);	
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet(xlsheet);
		row = sheet.getRow(rownum);
		 
		boolean data;
		try 
		{
			cell = row.getCell(colnum);
			data = cell.getBooleanCellValue();
		} catch (Exception e) 
		{
			data = false;
		}
		return data;		
	}

	public static void setCellData(String xlfile,String xlsheet,int rownum,int colnum,String data) throws IOException
	{
		
		fis = new FileInputStream(xlfile);	
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet(xlsheet);
		row = sheet.getRow(rownum);
		cell = row.createCell(colnum);
		cell.setCellValue(data);
		fos = new FileOutputStream(xlfile);
		workbook.write(fos);
		workbook.close();
	}
	
	public static void fillGreenColor(String xlfile,String xlsheet,int rownum,int colnum) throws IOException
	{
		fis = new FileInputStream(xlfile);	
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet(xlsheet);
		row = sheet.getRow(rownum);
		cell = row.getCell(colnum);
		
		style = workbook.createCellStyle();
		style.setFillForegroundColor(IndexedColors.BRIGHT_GREEN.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		
		cell.setCellStyle(style);
		fos = new FileOutputStream(xlfile);
		workbook.write(fos);
		workbook.close();
	}
	
	public static void fillRedColor(String xlfile,String xlsheet,int rownum,int colnum) throws IOException
	{
		fis = new FileInputStream(xlfile);	
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet(xlsheet);
		row = sheet.getRow(rownum);
		cell = row.getCell(colnum);
		
		style = workbook.createCellStyle();
		style.setFillForegroundColor(IndexedColors.RED.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		
		cell.setCellStyle(style);
		fos = new FileOutputStream(xlfile);
		workbook.write(fos);
		workbook.close();
	}
	
}
