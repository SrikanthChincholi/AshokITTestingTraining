package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ConsumerClass {
	public static void main(String[] args) {
		Consumer<Integer> cc = (t) -> System.out.println("Value : " + t);
		cc.accept(10);

		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6);
		values.stream().forEach(cc);
		List<Integer> ll = values.stream().distinct().collect(Collectors.toList());
		System.out.println(ll);
	}
}