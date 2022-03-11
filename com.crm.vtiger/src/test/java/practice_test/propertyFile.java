package practice_test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class propertyFile {

	public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("C:\\Users\\kolagani renuka\\Dropbox\\PC\\Downloads\\HybridAutomationProject_COMPLETE\\com.crm.vtiger\\common.properties");
	Properties prop=new Properties();
	prop.load(fis);
	String value=prop.getProperty("UN");
	String value1=prop.getProperty("PW");
	String value2=prop.getProperty("URL");
	System.out.println(value);
	System.out.println(value1);
	System.out.println(value2);
	}

}
