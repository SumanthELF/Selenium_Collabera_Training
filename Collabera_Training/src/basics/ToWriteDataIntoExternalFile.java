package basics;

import java.io.FileOutputStream;
import java.io.IOException;

public class ToWriteDataIntoExternalFile {

	public static void main(String[] args) throws IOException, InterruptedException {

		FileOutputStream fos = new FileOutputStream("D:\\Collabera\\Write.txt");
		
		fos.write('T');
		fos.write('R');
		fos.write('A');
		fos.write('I');
		fos.write('N');
		fos.write('I');
		fos.write('N');
		fos.write('G');
	}

}
