package com.tyss.genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	
	public String getdataFromFile(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/Test_Data/CommonData.properties");
		
		
		Properties prop=new Properties();
		
		prop.load(fis);
		
		return prop.getProperty(key);
	}

}
