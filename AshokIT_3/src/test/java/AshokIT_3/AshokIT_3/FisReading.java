package AshokIT_3.AshokIT_3;

import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class FisReading {
	
	static String folder = System.getProperty("user.dir") + "//DataFiles//";
	static String filename = "Sample.txt";
	public static void main(String[] args) throws Exception {
		
		String filepath = Paths.get(folder+filename).toUri().toString();
		System.out.println(filepath);
		WebDriver d = new ChromeDriver();
		d.get(filepath);
		filepath = filepath.replace("file:", "").replace("///", "");
		FileInputStream fis = new FileInputStream(new File(filepath));
		byte b[] = fis.readAllBytes();
		String data = new String(b,StandardCharsets.UTF_8);
		System.out.println(data);
		String data1 = new String(b);
		System.out.println(data1);
		
		
		
		
		

	}

}
