package practice_test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;




public class Salary {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new FileInputStream("../com.crm.vtiger/sal.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
Sheet sh =wb.getSheet("Sheet1");
for(int i=1;i<=sh.getLastRowNum();i++) {
int v=(int)	wb.getSheet("sheet1").getRow(i).getCell(1).getNumericCellValue();
if(v>=50000) {
String s=	wb.getSheet("sheet1").getRow(i).getCell(0).getStringCellValue();

System.out.println(s);
}

	
}
	
			
		}

	

	}



