package dataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("./testResources/testData.xlsx");
		
		Workbook workbook = WorkbookFactory.create(fis);
		
		String data = workbook.getSheet("Sheet4").getRow(9).getCell(5).toString();
		System.out.println(data);
		
		
//		Sheet sheetOne = workbook.getSheet("Sheet1");
//		sheetOne.getRow(4).getCell(1);
//		Row rowOne = sheetOne.getRow(1);
//		rowOne.getCell(0);
//		rowOne.getCell(1);
		
	}

}
