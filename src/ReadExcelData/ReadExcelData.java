package ReadExcelData;

public class ReadExcelData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExcelDataConfig excel = new ExcelDataConfig("I:\\JavaProgram\\SeleniumCode\\src\\excelData\\testData.xlsx",0);
		String data = excel.getData(0,0);
		System.out.println(data);
		System.out.println(excel.getRowCount());
	}

}
