package collectionprgms;

import java.util.*;

public class MapofLists {

	public static void main(String[] args) {

		Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();

		ArrayList<String> al = new ArrayList<String>();
		ArrayList<String> al1 = new ArrayList<String>();

		al.add("1");
		al.add("2");
		al.add("3");
		al.add("4");

		map.put("Key1", al);

		al1.add("11");
		al1.add("21");
		al1.add("31");
		al1.add("41");

		map.put("Key2", al1);

		for (Map.Entry<String, ArrayList<String>> m : map.entrySet()) {
			String key = m.getKey();
			System.out.println(key + " has below values :");
			for (int i = 0; i < m.getValue().size(); i++) {
				System.out.println(m.getValue().get(i));
			}
		}

	}

}
