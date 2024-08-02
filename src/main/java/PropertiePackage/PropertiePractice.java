package PropertiePackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiePractice {

	public static void main(String[] args) throws IOException {


		File fs = new File("dbConfig.properties");
		if(!fs.exists()) {
			
			fs.createNewFile();
			
		}
		System.out.println(fs.exists());
		
		
		Properties prop = new Properties();
		prop.setProperty("URL", "WWWW.saikanthworld.com");
		prop.setProperty("Username", "Saikanth");
		prop.setProperty("Password", "XXXXXXX");
		prop.setProperty("Place", "Karnataka");
		
		FileOutputStream fos = new FileOutputStream(fs);
		prop.store(fos, "This is a new Prop File by Syed Arif");
		
	}

}
