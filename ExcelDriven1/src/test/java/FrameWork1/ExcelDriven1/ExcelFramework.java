package FrameWork1.ExcelDriven1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelFramework {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("C://Users//hp//desktop//ExcelData.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook();
		
		int sheets= workbook.getNumberOfSheets();
		for(int i=0;i<sheets;i++)
		{
			if (workbook.getSheetName(i).equalsIgnoreCase("TestData"));
			{
				XSSFSheet sheet = workbook.getSheetAt(i);
			Iterator<Row> rows= sheet.iterator();
			Row firstrow = rows.next();
			Iterator<Cell> ce = firstrow.cellIterator();
			int k=0;
			int column=0;
			while (ce.hasNext())
			{
				Cell value= ce.next();
			if(value.getStringCellValue().equalsIgnoreCase("Hardship Withdrawal"))
				{
					
					column=k;
					
				}
				 k++;
			}
		System.out.println(column);
 
			}
		}
	}
}



