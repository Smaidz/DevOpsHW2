package app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {

	public static void main(String[] args) throws IOException {

		//open the props file 
		Properties props = new Properties();
		try {
			
			FileInputStream propsFile = new FileInputStream("C:\\Users\\eduar\\Documents\\workspace-spring-tool-suite-4-4.5.0.RELEASE\\DevOpsHW\\src\\config.properties");
			props.load(propsFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//check if values available
		System.out.println(props);
		
		//add a property, not saving to file yet
		props.setProperty("dayOfWeek", "today");	
		
		//write changes to new file
		FileOutputStream write = new FileOutputStream("C:\\Users\\eduar\\Documents\\workspace-spring-tool-suite-4-4.5.0.RELEASE\\DevOpsHW\\src\\configEdited.properties");
		props.store(write, "");
		
	}

}