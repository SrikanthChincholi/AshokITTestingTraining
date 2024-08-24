package exceldatareading;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class ReadExcelData {

	public static List<Map<String, String>> readData() throws Exception {
		Fillo fillo = new Fillo();
		Connection con = fillo.getConnection(".//DataFiles//SampleData.xlsx");
		String query = "Select * from TestData";
		Recordset rs = con.executeQuery(query);
		List<Map<String, String>> data = new ArrayList<>();
		ArrayList<String> columns = rs.getFieldNames();
		while (rs.next()) {
			Map<String, String> map = new LinkedHashMap<>();
			for (int i = 0; i < columns.size(); i++) {
				String key = columns.get(i);
				String value = rs.getField(columns.get(i));
				map.put(key, value);
			}
			data.add(map);
		}
		return data;
	}

}
