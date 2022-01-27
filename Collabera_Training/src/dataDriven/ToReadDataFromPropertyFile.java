package dataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ToReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("./testResources/testData.properties");
		
		Properties properties = new Properties();
		
		properties.load(fis);
		System.out.println(properties.getProperty("defaultUsername"));
	}

}
