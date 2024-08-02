package FilePractice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderPractice {

	public static void main(String[] args) throws IOException {

		File fs = new File("C:\\Users\\UIE13841\\eclipse-workspace\\Practice\\Sample.txt");

		if (!fs.exists()) {

			fs.createNewFile();
		}
		
		FileReader fr = new FileReader(fs);
		
		BufferedReader br = new BufferedReader(fr);
		
		String line = new String();
		
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}

	}

}
