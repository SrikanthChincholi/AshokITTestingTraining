package selenium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

public class AddColumnsToStringBuffer {
	@Test
	public void test() {
		@SuppressWarnings({ "unchecked", "rawtypes" })
		List<Map<String, String>> list = new ArrayList();
		HashMap<String, String> map = new HashMap<>();
		map.put("Common_Id", "decimal");
		map.put("Common_deal_Id", "decimal");
		map.put("Deal_Id", "varchar(20)");
		list.add(map);
		StringBuffer str = new StringBuffer();
		str.append("Alter table L_Transaction_Load add ");
		for (Map<String, String> mm : list)
			for (Map.Entry<String, String> m : mm.entrySet()) {
				str.append(m.getKey()).append(" ")
						.append(m.getValue()).append(",");
				//System.out.println(str);
				//str.delete(0, str.length());
			}
		str.deleteCharAt(str.length()-1);
		System.out.println(str);
	}
}
