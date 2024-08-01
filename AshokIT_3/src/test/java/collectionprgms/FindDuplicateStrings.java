package collectionprgms;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateStrings {

	public static void main(String[] args) {

		String str[] = { "Test", "Java", "Test", "Data", "Java" };

		Map<String, Integer> map = new HashMap<>();

		for (int i = 0; i < str.length; i++) {
			if (!map.containsKey(str[i])) {
				map.put(str[i], 1);// ["Test",1] //["Java" ,1]
			} else {
				map.put(str[i], map.get(str[i]) + 1);// ["Test" ,2]
			}
		}

		for (Map.Entry<String, Integer> m : map.entrySet()) {
			System.out.println(m.getKey() + " Repeated --> " + m.getValue() +" times");
		}

	}

}
