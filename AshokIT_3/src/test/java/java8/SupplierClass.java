package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierClass {

	public static void main(String[] args) {

		Supplier<Integer> sup = () -> 19;
		System.out.println(sup.get());

		List<Integer> data = Arrays.asList(1, 2, 3, 4, 5, 6,1, 2, 3, 4, 5, 6);
		if (!data.stream().findAny().isEmpty()) {
			System.out.println(data.stream().anyMatch(p -> p%2 == 0 || p%2 !=0));
		};
	}

}
