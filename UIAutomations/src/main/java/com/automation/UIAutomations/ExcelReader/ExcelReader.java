package com.automation.UIAutomations.ExcelReader;

import java.io.*;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	
	public FileOutputStream fout=null;
	public String path;
	public FileInputStream fis=null;
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	
	public ExcelReader(String path){
		this.path=path;
		
			
			try {
				fis=new FileInputStream(path); 
				workbook=new XSSFWorkbook(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
				
			}
			
	@SuppressWarnings({"depricationn"})
	public String[][] getDataFromSheet(String SheetName, String ExcelName){
		
	
		String datasets[][]=null;
		try{
			XSSFSheet sheet=workbook.getSheet(SheetName);
			//count number of acive rows
			int totalrow=sheet.getLastRowNum()+1;
			//count number of active cells
			int totalcell=sheet.getRow(0).getLastCellNum();
			//create array of rows and columns
			datasets=new String[totalrow-1][totalcell];
			
			//run forloop and store data in 2D array
			//this for loop will run on rows
			for(int i=1;i<totalrow;i++){
				XSSFRow rows=sheet.getRow(i);
				//this for loop will run of columns of that rowx
				for(int j=0;j<totalcell;j++){
					//get cell method will get cell
					XSSFCell cell=rows.getCell(j);
					//is cell of type string the if will work
					if(cell.getCellType()==cell.CELL_TYPE_STRING){
						datasets[i-1][j]=cell.getStringCellValue();}
						//if cell of typenumber then this if will work
					else if(cell.getCellType()==cell.CELL_TYPE_NUMERIC){
						String celltext=String.valueOf(cell.getNumericCellValue());
						datasets[i-1][j]=celltext;
						
					}else{
						//if cell of type boolean then this if will work
						datasets[i-1][j]=String.valueOf(cell.getBooleanCellValue());
						
						
					}
				}
				
				
			}
			return datasets;
			
			
		}catch(Exception e){
			System.out.println("Exception in reading excel file is : "+e.getMessage());
			e.printStackTrace();
			
		}
		return datasets;
	
		
		
	}

}
