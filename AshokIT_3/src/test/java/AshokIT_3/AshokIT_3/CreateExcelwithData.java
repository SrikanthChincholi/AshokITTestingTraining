package AshokIT_3.AshokIT_3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcelwithData {

	static String filename = ".//DataFiles//SampleData.xlsx";

	public static void main(String[] args) throws Exception {

		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sh = wb.createSheet("TestData");
		int r = 0;

		Map<String, Object[]> data = new TreeMap<>();
		data.put("1", new Object[] { "S.No", "Uname", "Password" });
		data.put("2", new Object[] { "1", "admin", "admin123" });
		data.put("3", new Object[] { "2", "admin1", "admin123" });
		data.put("4", new Object[] { "3", "admin", "admin1" });
		data.put("5", new Object[] { "4", "admin2", "admin123" });
		data.put("6", new Object[] { "5", "admin3", "admin123" });
		data.put("7", new Object[] { "6", "admin4", "admin1" });

		Set<String> allkeys = data.keySet();
		for (String key : allkeys) {
			Row row = sh.createRow(r++);
			int c = 0;
			Object obj[] = data.get(key);
			for (Object o : obj) {
				Cell cell = row.createCell(c++);
				cell.setCellValue(o.toString());
			}
		}

		FileOutputStream fos = new FileOutputStream(filename);
		wb.write(fos);
		System.out.println("Writing done !!");
		fos.close();
		wb.close();

	}

}
