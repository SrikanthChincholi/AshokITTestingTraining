package javaexecutorExamples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesClass {

	static Properties prop;
	static FileInputStream fis;
	static String filepath = "C:\\Users\\DELL\\git\\AshokITTestingTraining\\AshokIT_3\\src\\test\\java\\testdata\\TestData.properties";

	static {
		try {
			fis = new FileInputStream(filepath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getValue(String key) {
		return (String) prop.get(key);
	}

}
