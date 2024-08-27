package java8;

import java.util.ArrayList;
import java.util.List;

public class LaptopDetails {

	public List<Laptops> getDetails() {
		List<Laptops> alllaptops = new ArrayList<>();
		alllaptops.add(new Laptops("Dell", "2020", "54000"));
		alllaptops.add(new Laptops("HP", "2025", "64000"));
		alllaptops.add(new Laptops("Lenovo", "2019", "87000"));
		return alllaptops;
	}

}
