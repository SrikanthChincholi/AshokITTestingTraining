package collectionframework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListWithMap {

	public static void main(String[] args) {

		List<Map<String, String>> lmap = new ArrayList<Map<String, String>>();
		Map<String, String> map = new HashMap<>();
		map.put("1", "test1");
		map.put("2", "test2");
		map.put("3", "test3");
		lmap.add(map);
		for (Map<String, String> l : lmap) {
			Set<String> keys = l.keySet();
			Iterator<String> itr = keys.iterator();
			while (itr.hasNext()) {
				String key = itr.next();
				String value = l.get(key);
				System.out.println(key + "----" + value);
			}
		}
	}

}
