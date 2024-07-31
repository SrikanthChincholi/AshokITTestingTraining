package collectionframework;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapEx {

	public static void main(String[] args) {
		Map<Integer, String> map = new LinkedHashMap<>();
		
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

		/*
		 * System.out.println(map);
		 * 
		 * for(Entry<Integer,String> m : map.entrySet()) {
		 * System.out.println(m.getKey()+" --- "+ m.getValue()); }
		 * 
		 * System.out.println(map.get(3));
		 */

		Set keys = map.keySet();
		for (Object k : keys) {
			System.out.println(k + "-----" + map.get(k));
		}
		
		System.out.println(map.containsKey(22));
		
		Collection<String> values = map.values();
		List<String> allvalues = new LinkedList<>();
		for(String s : values)
		{
			allvalues.add(s);
		}
		System.out.println(allvalues);
		
	}
	

}
