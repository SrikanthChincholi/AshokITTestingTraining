package collectionframework;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<>();

		map.put(3, "Java1");
		map.put(1, "Java2");
		map.put(2, "Java3");
		map.put(4, "Java1");
		map.put(10, "Java1");
		map.put(11, "Java2");
		map.put(3, "Java3");
		map.put(4, "Java1");
		map.put(5, "Java11");
		map.put(6, null);
		map.put(7, null);
		map.put(3, "Java1");
		map.put(1, "Java2");
		map.put(2, "Java3");
		map.put(4, "Java1");
		map.put(10, "Java1");
		map.put(11, "Java2");
		map.put(3, "Java3");
		map.put(4, "Java1");
		map.put(5, "Java11");
		map.put(6, null);
		map.put(7, null);

		for (Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " --- " + m.getValue());
		}

		/*
		 * Set keys = map.keySet(); for (Object k : keys) { System.out.println(k +
		 * "-----" + map.get(k)); }
		 */
		
	
	}

}
