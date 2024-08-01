package collectionprgms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LaptopDetails implements Comparator<Laptops>{

	public static List<Laptops> getlaptopDetails() {
		List<Laptops> laps = new ArrayList<>();
		laps.add(new Laptops("Lenovo", "67000", "2021"));
		laps.add(new Laptops("MacBook", "1200000", "2024"));
		laps.add(new Laptops("Dell", "45000", "2024"));
		laps.add(new Laptops("Hp", "54000", "2022"));
		return laps;
	}
	
	public static void main(String[] args) {

		List<Laptops> lappys = LaptopDetails.getlaptopDetails();
		Collections.sort(lappys, new GetAllLaptops());
		for (int i = 0; i < lappys.size(); i++) {
			System.out.println(lappys.get(i).getModel());
			System.out.println(lappys.get(i).getName());
			System.out.println(lappys.get(i).getPrice());
			System.out.println("***********************");
		}

	}

	@Override
	public int compare(Laptops o1, Laptops o2) {
		if (o1.getModel().compareTo(o2.getModel()) < 0)
			return 1;
		else
			return -1;
	}

	

}
