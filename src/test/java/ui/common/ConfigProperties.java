package ui.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigProperties {
	
	public static Properties prop = new Properties();
	
	public static void InitProperties() throws IOException {
	
	String propFile = new File(".").getCanonicalFile()+"\\config.properties";
	
	FileInputStream propIP = new FileInputStream(propFile);
	
	prop.load(propIP);
	
	}
	
			
}
