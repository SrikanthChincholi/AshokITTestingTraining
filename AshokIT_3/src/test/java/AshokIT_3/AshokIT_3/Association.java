package AshokIT_3.AshokIT_3;

import java.util.ArrayList;
import java.util.List;

class Professors {
	String name;

	public Professors(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}

class Department {
	String dname;
	List<Professors> profs;

	public Department(String dname) {
		this.dname = dname;
	}

	public String getDname() {
		return dname;
	}

	public void setProfs(List<Professors> profs) {
		this.profs = profs;
	}

	public List<String> getProfessors() {
		List<String> allprofs = new ArrayList<>();
		for (Professors p : this.profs) {
			allprofs.add(p.getName());
		}
		return allprofs;
	}
}

public class Association {

	public static void main(String[] args) {
		
		Professors p1 = new Professors("Srikant");
		Professors p2 = new Professors("Chandu");
		
		Department d = new Department("CSE");
		
		List<Professors> staff = new ArrayList<Professors>();
		staff.add(p1);
		staff.add(p2);
		
		d.setProfs(staff);
		
		System.out.println(d.getDname() + " ---- "+ d.getProfessors() );
		
		
	}

}
