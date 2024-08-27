package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateClass {

	public static void main(String[] args) {

		Predicate<Integer> p = (t) -> t % 2 == 0;
		System.out.println(p.test(2));

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		list.stream().filter((t) -> t % 2 == 0).forEach(pp -> System.out.println(pp+ ""));
	}

}
