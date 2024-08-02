package FilePractice;

import java.io.File;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) {

		File fs = new File("D:\\Testfiles\\TestFileCreate.txt");
		
	
		
		if(fs.exists()) {
			System.out.println("File  exists");
		}else {
			System.out.println("File doesnot  existis");
			
		}
		try {
			fs.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// If the file is exists delete and create it again 
		
		if(fs.exists()) {
			System.out.println("File  exists");
			fs.deleteOnExit();
			System.out.println("File is deleted");
		}else {
			System.out.println("File doesnot  existis");
		}
		
		//How to check if the file is hidden are not 
		
		System.out.println(fs.isHidden());
		
	}

}
