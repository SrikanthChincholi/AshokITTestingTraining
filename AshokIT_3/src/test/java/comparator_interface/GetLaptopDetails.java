package comparator_interface;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GetLaptopDetails implements Comparator<LaptopDetails> {

	public static void main(String[] args) {
		Laptops laptops = new Laptops();
		List<LaptopDetails> laps = laptops.getDetails();
		Collections.sort(laps, new GetLaptopDetails());
		System.out.println(laps.toString());
	}

	@Override
	public int compare(LaptopDetails o1, LaptopDetails o2) {
		if (o1.getModel().compareTo(o2.getModel()) > 0)
			return 1;
		else
			return -1;

	}

}
