package School_lab2;
public class Staff extends Person {
	private double Salary;

	public Staff(String name, String phone, int age, double salary)
	{
		super(name,phone,age);

		setSalary(salary);
	}
	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

}
