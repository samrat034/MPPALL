package Lab5_1;

public class Salaried extends Employee {
	
	private int salary;
	public Salaried(int empId, int salary) {
		super(empId);
		this.salary=salary;
		
	}

	
	

	public double getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	@Override
	public double calcGrossPay(DateRange dr) {
		
		return salary;
	};
	

}
