package AshokIT_3.AshokIT_3;

import java.io.File;
import java.io.FileInputStream;
import java.net.URI;
import java.nio.file.Paths;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	static File folder = new File(".//DataFiles");
	static String filename = "SampleData.xlsx";

	public static void main(String[] args) throws Exception {
		URI url = Paths.get(folder.getAbsolutePath(), filename).toUri();
		FileInputStream fis = new FileInputStream(folder + "//" + filename);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheetAt(0);

		Iterator<Row> row = sh.rowIterator();
		while (row.hasNext()) {
			Row r = row.next();
			Iterator<Cell> cell = r.cellIterator();
			while (cell.hasNext()) {
				System.out.print(cell.next() + " ");
			}
			System.out.println(" ");
		}
		System.out.println(url.toString());
	}

}
