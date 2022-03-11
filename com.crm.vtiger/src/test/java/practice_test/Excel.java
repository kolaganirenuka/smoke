package practice_test;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("../com.crm.vtiger/Hr.xlsx");
		
		Workbook book=WorkbookFactory.create(fis);
	String str=	book.getSheet("Sheet1").getRow(4).getCell(2).getStringCellValue();
System.out.println(str);
	}

}
