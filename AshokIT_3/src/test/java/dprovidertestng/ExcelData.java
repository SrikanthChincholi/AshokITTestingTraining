package dprovidertestng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class ExcelData {

	// ReadData using POI Library

	static String filepath = ".\\DataFiles\\DataFile.xlsx";
	static FileInputStream fis;

	@DataProvider(name = "ExcelDataFromPOI")
	public static Object[][] getDataFromExcel() throws Exception {
		fis = new FileInputStream(filepath);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheetAt(0);
		int noofrows = sh.getPhysicalNumberOfRows();
		int noofcols = sh.getRow(0).getPhysicalNumberOfCells();
		Object Objdata[][] = new Object[noofrows - 1][noofcols];
		for (int i = 1; i < noofrows; i++) {
			Row row = sh.getRow(i);
			for (int j = 0; j < noofcols; j++) {
				Cell cell = row.getCell(j);
				String data = new DataFormatter().formatCellValue(cell);
				Objdata[i - 1][j] = data;
			}
		}
		return Objdata;
	}

	@DataProvider(name="DPFromListOfMap")
	public static Iterator<Map<String, String>> getDataUsingFillo() throws Exception {
		List<Map<String, String>> list = new ArrayList<>();
		Fillo fillo = new Fillo();
		Connection con = fillo.getConnection(filepath);
		Recordset rs = con.executeQuery("Select * from TestData");
		ArrayList<String> allcolumns = rs.getFieldNames();
		Map<String, String> map;
		while (rs.next()) {
			map = new LinkedHashMap<>();
			for (int i = 0; i < allcolumns.size(); i++) {
				map.put(allcolumns.get(i), rs.getField(allcolumns.get(i)));
			}
			list.add(map);
		}
		return list.iterator();

	}

}
