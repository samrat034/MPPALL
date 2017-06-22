package schoolLabPractice;

public class Staff extends Person{
	public Staff(String name, String phone, int age) {
		super(name, phone, age);
		// TODO Auto-generated constructor stub
	}

	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
