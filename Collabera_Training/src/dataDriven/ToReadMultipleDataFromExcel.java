package dataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadMultipleDataFromExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("./testResources/testData.xlsx");

		Workbook workbook = WorkbookFactory.create(fis);
		
		Sheet sheetFive = workbook.getSheet("Sheet5");
		int rowCount = sheetFive.getPhysicalNumberOfRows();
		int colCount = sheetFive.getRow(0).getPhysicalNumberOfCells();
		System.out.println(rowCount);
		System.out.println(colCount);
		
		String[][] sarr = new String[rowCount][colCount];
		
		for(int i=0;i<rowCount;i++) {
			for(int j=0;j<colCount;j++) {
				sarr[i][j]=sheetFive.getRow(i).getCell(j).toString();
			}
		}	
		for(String[] arr: sarr) {
			for(String s : arr) {
				System.out.print(s+" , ");
			}
			System.out.println();
		}
	}

}
