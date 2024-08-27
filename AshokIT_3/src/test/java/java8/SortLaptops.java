package java8;

import java.util.Collections;
import java.util.List;

public class SortLaptops {

	public static void main(String[] args) {

		List<Laptops> alllaps = new LaptopDetails().getDetails();
		Collections.sort(alllaps, (o1, o2) -> o2.getModel().compareTo(o1.getModel()));
		System.out.println(alllaps.toString());

	}

	/*
	 * @Override public int compare(Laptops o1, Laptops o2) { if
	 * (o1.getModel().compareTo(o2.getModel()) > 0) return 1; else return -1; }
	 */

}
