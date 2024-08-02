package FilePractice;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ScannerFileReading {

	public static void main(String[] args) throws IOException {
		File fs = new File("C:\\Users\\UIE13841\\eclipse-workspace\\Practice\\Sample.txt");

		if (!fs.exists()) {

			fs.createNewFile();

		}

		Scanner sc = new Scanner(fs);

		while (sc.hasNext()) {

			System.out.println(sc.nextLine());

		}

	}

}
