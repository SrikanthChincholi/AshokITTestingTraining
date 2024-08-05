package collectionprgms;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class ReadDataFromExcelToListMap {

	static String filepath = System.getProperty("user.dir") + "\\DataFiles\\DataFile.xlsx";
	static FileInputStream fis = null;

	// @Test
	public void readDataFromExcel() throws Exception {
		fis = new FileInputStream(filepath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheetAt(0);
		int noofrows = sh.getPhysicalNumberOfRows();
		int noofcols = sh.getRow(0).getPhysicalNumberOfCells();

		for (int i = 0; i < noofrows; i++) {
			Row row = sh.getRow(i);
			for (int j = 0; j < noofcols; j++) {
				Cell cell = row.getCell(j);
				DataFormatter format = new DataFormatter();
				String data = format.formatCellValue(cell);
				System.out.print(data + " ");
			}
			System.out.println("");
		}
	}

	//@Test
	public static List<Map<String,String>> readDataFromExcelToListMap() throws Exception {
		Fillo fillo = new Fillo();
		Connection connection = fillo.getConnection(filepath);
		System.out.println(filepath);
		Recordset rs = connection.executeQuery("SELECT * FROM TestData");
		List<Map<String, String>> allrecords = new ArrayList<>();
		ArrayList<String> headers = rs.getFieldNames();
		while (rs.next()) {
			Map<String, String> map = new HashMap<>();
			for (int i = 0; i < headers.size(); i++) {
				map.put(headers.get(i), rs.getField(headers.get(i)));
			}
			allrecords.add(map);
		}
		return allrecords;

	}

}
