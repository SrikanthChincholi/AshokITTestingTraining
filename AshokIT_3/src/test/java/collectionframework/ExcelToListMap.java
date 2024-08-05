package collectionframework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class ExcelToListMap {

	static String filepath = System.getProperty("user.dir") + "\\DataFiles\\DataFile.xlsx";

	// @Test
	public void getDataFromListMap() throws Exception {
		List<Map<String, String>> data = ExcelToListMap.readDataFromExcelToListMap();
		for (int i = 0; i < data.size(); i++) {
			System.out.println(data.get(i).get("Username"));
		}
	}

	@Test
	public void getDataFromMapList() throws Exception {
		Map<String, List<String>> data = ExcelToListMap.readDataFromExceltoMapOfList();
		Set<String> keys = data.keySet();
		for (String key : keys) {
			System.out.println(key);
			for (String value : data.get(key)) {
				System.out.print(value + " ");
			}
			System.out.println("");
			

		}
	}

	public static List<Map<String, String>> readDataFromExcelToListMap() throws Exception {
		Fillo fillo = new Fillo();
		Connection connection = fillo.getConnection(filepath);
		Recordset rs = connection.executeQuery("SELECT * FROM TestData");
		List<Map<String, String>> lmap = new ArrayList<>();
		ArrayList<String> allcols = rs.getFieldNames();
		while (rs.next()) {
			Map<String, String> map = new LinkedHashMap<>();
			for (int i = 0; i < allcols.size(); i++) {
				map.put(allcols.get(i), rs.getField(allcols.get(i)));
			}
			lmap.add(map);
		}
		return lmap;

	}

	public static Map<String, List<String>> readDataFromExceltoMapOfList() throws Exception {
		Fillo fillo = new Fillo();
		Connection connection = fillo.getConnection(filepath);
		Recordset rs = connection.executeQuery("SELECT * FROM TestData");
		Map<String, List<String>> map = new HashMap<>();
		ArrayList<String> allcols = rs.getFieldNames();
		for (int i = 0; i < allcols.size(); i++) {
			ArrayList<String> values = new ArrayList<>();
			while (rs.next()) {
				values.add(rs.getField(allcols.get(i)));
			}
			map.put(allcols.get(i), values);
			rs = connection.executeQuery("SELECT * FROM TestData");
		}
		return map;

	}

}
