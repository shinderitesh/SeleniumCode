package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig 
{
	File src;
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	public ExcelDataConfig(String excelPath,int sheetNumber) 
	{
		 src = new File(excelPath);
		FileInputStream fis;
		try {
			fis = new FileInputStream(src);
		     wb = new XSSFWorkbook(fis);
		     sheet1 = wb.getSheetAt(sheetNumber);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getData(int row,int column)
	{
		//sheet1 = wb.getSheetAt(sheetNumber);
		String data = sheet1.getRow(row).getCell(column).getStringCellValue();
		return data;
	}
	public int getRowCount()
	{
		int rowCount = sheet1.getLastRowNum()+1;
		return rowCount;
	}
}
