package ReadExcelData;

import java.io.*;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//1.load the file
		File f = new File("I:\\JavaProgram\\SeleniumCode\\src\\excelData\\testData.xlsx");
		FileInputStream fis = new FileInputStream(f);
		
		//2 load the sworkbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		//3 load the specific sheet
	    XSSFSheet sheet1 = wb.getSheetAt(0);
	   
	    int rowCount = sheet1.getLastRowNum()+1;
	    System.out.println(rowCount);
	    
	    for(int i=0;i<rowCount;i++)
	    {
	    	String data00 = sheet1.getRow(i).getCell(0).getStringCellValue();
	    	System.out.println(data00);
	    
	    }
	    wb.close();
	}

}
