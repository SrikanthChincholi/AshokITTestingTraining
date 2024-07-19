package AshokIT_3.AshokIT_3;

import java.util.ArrayList;
import java.util.List;

public class TestAssociation {

	public static void main(String[] args) {

		Country c = new Country("India");

		SportsPerson sp1 = new SportsPerson("Srikanth");
		SportsPerson sp2 = new SportsPerson("Aaryan");
		SportsPerson sp3 = new SportsPerson("Chandu");

		List<SportsPerson> sppersons = new ArrayList<>();
		sppersons.add(sp1);
		sppersons.add(sp2);
		sppersons.add(sp3);
		
		c.setSppersons(sppersons);
		
		System.out.println(c.getName() + "-----" + c.getSppersons());

	}
}

class SportsPerson {
	String name;

	public SportsPerson(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}

class Country {
	String name;
	List<SportsPerson> sppersons;

	Country(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setSppersons(List<SportsPerson> sppersons) {
		this.sppersons = sppersons;
	}

	public List<String> getSppersons() {
		List<String> persons = new ArrayList<>();
		for (SportsPerson sp : this.sppersons) {
			persons.add(sp.getName());
		}
		return persons;
	}

}