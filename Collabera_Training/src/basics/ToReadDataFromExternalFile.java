package basics;

import java.io.FileInputStream;
import java.io.IOException;

public class ToReadDataFromExternalFile {

	public static void main(String[] args) throws IOException, InterruptedException {

		FileInputStream fis = new FileInputStream("D:\\Collabera\\Demo.txt");

		int c = fis.read();
		while(c!=-1) {
			System.out.print((char)c);
			c=fis.read();
		}
	}

}
