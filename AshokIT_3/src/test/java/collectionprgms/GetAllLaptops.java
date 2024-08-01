package collectionprgms;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GetAllLaptops implements Comparator<Laptops> {

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
