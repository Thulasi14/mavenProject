package utilityPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileRead {
	
	public static String read(String st) {
		
		Properties p=new Properties();
		
		try {
			p.load(new FileInputStream("C:\\Users\\home\\eclipse-workspace_new\\interview\\src\\test\\java\\propFiles\\confg.properties"));
		} 
		
		catch (Exception e) {
			e.printStackTrace();
		}
		return p.getProperty(st);
	}

}
