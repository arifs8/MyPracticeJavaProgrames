package FilePractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadingFile {

	public static void main(String[] args) throws IOException {

		File fs = new File("C:\\Users\\UIE13841\\eclipse-workspace\\Practice\\Sample.txt");

		if (!fs.exists()) {

			fs.createNewFile();

		}

		FileInputStream fis = new FileInputStream(fs);

		int asciiCode;
		while ((asciiCode = fis.read()) != -1) {
			System.out.print((char) asciiCode);
		}

		fis.close();
	}

}
