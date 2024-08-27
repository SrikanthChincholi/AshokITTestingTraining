package java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class StreamAPI {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
		// list.stream().forEach(System.out::println);

		Map<String, String> map = new LinkedHashMap<>();
		map.put("1", "Test1");
		map.put("2", "Test2");
		map.put("3", "Test3");
		map.put("4", "Test4");
		map.put("5", "Test11");
		map.put("6", "Test12");

		// map.forEach((key, value) -> System.out.println(key + " - " + value));
		// map.entrySet().stream().forEach(obj -> System.out.println(obj));

		map.entrySet().stream().filter(k -> k.getValue().contains("2")).forEach(k -> System.out.println(k));

	}

}
