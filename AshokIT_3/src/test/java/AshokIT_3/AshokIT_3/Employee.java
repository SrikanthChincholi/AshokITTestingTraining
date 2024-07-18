package AshokIT_3.AshokIT_3;

public class Employee {

	String name;
	int empno;
	String designation;
	Bonus bonus;
	
	public Employee(String name, int empno, String designation, Bonus bonus) {
		this.name = name;
		this.empno = empno;
		this.designation = designation;
		this.bonus = bonus;
	}
	public static void main(String[] args) {
		Bonus bonus = new Bonus(12000.00f, 45000.00f);
		Employee emp = new Employee("Srikanth", 123, "Qa Lead", bonus);
		emp.totalsalary();
	}
	

	public void totalsalary() {
		float totalsal = (bonus.sal + bonus.bonustoemp);
		System.out.println("Total salary after bonus : " + totalsal);
	}

}

class Bonus {
	
	float bonustoemp;
	float sal;
	

	public Bonus(float bonus, float sal) {
		this.bonustoemp = bonus;
		this.sal = sal;
	}
}
