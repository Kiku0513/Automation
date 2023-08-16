package com.testNG;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadFileByApachePOI 
{


	/*
	 * four classes for reading excel using Apache POI
	 * 
	 * XSSFWorkbook
	 * XSSFSheet
	 * XSSFRow
	 * XSSFCell
	 * 
	 */
	@Test

	public void readFileByApache() throws IOException
	{

		XSSFWorkbook workbook=null;
		try
		{
			//System.getProperty("user.dir")--> will give the path of the current working directory
			workbook=new XSSFWorkbook(System.getProperty("user.dir")+"/DataProvider.xlsx");
			XSSFSheet worksheet= workbook.getSheetAt(0);


			//Write in Excel
			//XSSFSheet sheet1= workbook.createSheet("sample");


			XSSFRow row= worksheet.getRow(0);

			//it will return the no. of rows in that specific sheet
			int noOfRows= worksheet.getPhysicalNumberOfRows();

			//it will return the no.of cells in that specific row (row no->1)
			int noOfCells= row.getPhysicalNumberOfCells();

			for (int i=1;i<noOfRows;i++)
			{
				for(int j=0;j<noOfCells;j++)
				{
					String cellValue= worksheet.getRow(i).getCell(j).getStringCellValue();

					//Write in Excel
					//String writeValue= worksheet.createRow(6).createCell(0).setCellValue("sample");


					System.out.println("Cell Value -->"+cellValue);


				}
			}

		}
		catch(Exception ex)
		{
			System.out.println("Problem to read the data from Excel");
			ex.printStackTrace();
		}
		finally
		{
			workbook.close();
		}
	}

}
