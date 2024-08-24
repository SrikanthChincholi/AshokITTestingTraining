package readdatafromexcel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class ReadDataFromExcel {

	static String filepath = ".\\DataFiles\\SampleData.xlsx";

	@DataProvider(name = "DP")
	public Iterator<Map<String, String>> readData() throws Exception {
		List<Map<String, String>> data = new ArrayList<Map<String, String>>();
		Fillo fillo = new Fillo();
		Connection con = fillo.getConnection(filepath);
		Recordset rs = con.executeQuery("Select * from TestData");
		ArrayList<String> allcolumns = rs.getFieldNames();
		while (rs.next()) {
			Map<String, String> map = new LinkedHashMap<>();
			for (int i = 0; i < allcolumns.size(); i++) {
				map.put(allcolumns.get(i), rs.getField(allcolumns.get(i)));
			}
			data.add(map);
		}
		return data.iterator();
	}

	
}
