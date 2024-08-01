package collectionprgms;

import java.util.*;

public class ListOfMap {

	public static void main(String[] args) {

		List<LinkedHashMap<String, String>> list = new ArrayList<LinkedHashMap<String, String>>();
		LinkedHashMap<String, String> map = new LinkedHashMap<>();

		map.put("1", "Test1");
		map.put("2", "Test2");
		map.put("3", "Test3");
		map.put("4", "Test4");
		map.put("5", "Test5");
	
		LinkedHashMap<String, String> map2 = new LinkedHashMap<>();
		
		map2.put("11", "Test11");
		map2.put("12", "Test12");
		map2.put("13", "Test13");
		map2.put("14", "Test14");
		map2.put("15", "Test15");
		
		map.putAll(map2);
		
		list.add(map);
		
		
		
		for (int i = 0; i < list.size(); i++) {
			Set<String> allkeys = map.keySet();
			Iterator<String> itr = allkeys.iterator();
			while (itr.hasNext()) {
				String key = itr.next();
				System.out.println("Key is " + key + " Value is " + map.get(key));
			}
		}

	}

}
