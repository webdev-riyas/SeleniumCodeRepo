package coreJavaSamples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GlobalProperties {

	public static void main(String[] args) throws IOException {
		
		//properties class has a knowledge to read/access from .properties file
		Properties prop=new Properties();
		//provide knowledge where file is located and create file object
		FileInputStream fis=new FileInputStream("C:\\Users\\Riyaz\\eclipse-workspace\\CoreJava\\src\\coreJavaSamples\\data.properties");
		prop.load(fis); //connected properties and file
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		//setting the properties at run time
		prop.setProperty("browser", "Internet Explorer");
		prop.setProperty("Username", "Username1");
		System.out.println(prop.getProperty("browser"));
		
		//if we need to write it back to the data.properties file
		
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Riyaz\\eclipse-workspace\\CoreJava\\src\\coreJavaSamples\\data.properties");
		//will update data.properties file with browser and username
		prop.store(fos, "File Updated");
		
		
	

	}

}
