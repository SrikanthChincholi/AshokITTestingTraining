package AshokIT_3.AshokIT_3;

import java.io.File;

import org.apache.commons.io.FileUtils;

public class CopyFiles {

	static String filedest = System.getProperty("user.dir") + "\\TestingDocs";

	public static void main(String[] args) throws Exception {

		File file = new File("C:\\Users\\DELL\\Srikanth_Drive\\Automation_Testing");
		if (file.isDirectory()) {
			//File files[] = file.listFiles();
			//for (File f : files)
				FileUtils.copyDirectory(file, new File(filedest));
		}

	}

}
