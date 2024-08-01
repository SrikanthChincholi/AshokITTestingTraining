package collectionframework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapWithArrayList {

	public static void main(String[] args) {

		Map<String, ArrayList<String>> maplist = new HashMap<String, ArrayList<String>>();
		ArrayList<String> alist = new ArrayList<String>();
		ArrayList<String> alist1 = new ArrayList<String>();
		alist.add("test1");
		alist.add("test2");
		alist.add("test3");
		maplist.put("1", alist);
		alist1.add("test4");
		alist1.add("test5");
		alist1.add("test6");
		maplist.put("2", alist1);

		for (Map.Entry<String, ArrayList<String>> map : maplist.entrySet()) {
			System.out.println(map.getKey() + " ---- " + map.getValue());
		}
	}
}
