package FilePractice;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderPrractice {

	public static void main(String[] args) throws IOException {

		File fs = new File("C:\\Users\\UIE13841\\eclipse-workspace\\Practice\\Sample.txt");
		
		if(!fs.exists()) {
			
			fs.createNewFile();
		}
		
		
		FileReader fr = new  FileReader(fs);		
		int asciiCode;
		while((asciiCode = fr.read()) != -1) {
			System.out.print((char)asciiCode);
		}

	}

}
