package AshokIT_3.AshokIT_3;

public class Employee {

	String name;
	int empno;
	String designation;
	static Bonus bonus;

	public Employee(String name, int empno, String designation, Bonus bonus) {
		this.name = name;
		this.empno = empno;
		this.designation = designation;
		Employee.bonus = bonus;
	}

	public static void main(String[] args) {
		bonus = new Bonus(12000.00f, 45000.00f);
		new Employee("Srikanth", 123, "Qa Lead", bonus);
		bonus.totalsalary();
	}
}

class Bonus {

	float bonustoemp;
	float sal;

	public Bonus(float bonus, float sal) {
		this.bonustoemp = bonus;
		this.sal = sal;
	}

	public void totalsalary() {
		float totalsal = (sal + bonustoemp);
		System.out.println("Total salary after bonus : " + totalsal);
	}
}
