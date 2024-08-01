package collectionframework;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateString {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		String str[] = { "sri", "sri", "sri", "kanth", "chandu" ,"sri", "sri", "sri", "kanth", "chandu" };
		for (int i = 0; i < str.length; i++) {
			if (!map.containsKey(str[i])) {
				map.put(str[i], 1);
			} else {
			map.put(str[i], map.get(str[i])+1);
			}
		}

		System.out.println(map);

	}

}
