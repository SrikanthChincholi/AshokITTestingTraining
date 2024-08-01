package comparator_interface;

import java.util.ArrayList;
import java.util.List;

public class Laptops {

	public List<LaptopDetails> getDetails() {
		List<LaptopDetails> laptops = new ArrayList<>();
		laptops.add(new LaptopDetails("2024", "35000.00", "HP"));
		laptops.add(new LaptopDetails("2023", "43000.00", "DELL"));
		laptops.add(new LaptopDetails("2022", "55000.00", "LENOVO"));
		return laptops;
	}

}
