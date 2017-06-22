package schoolLabPractice;

public class Faculty extends Person{
	

	private double salary;
	
	public Faculty(String name, String phone, int age, double salary) {
		super(name, phone, age);
		this.salary=salary;
	}
	
	

	public int getTotalUnits(){
		return 0;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "Person [name=" + getName() + ", phone=" + getPhone() + ", age=" + getAge()
				+ ", salary=" + salary + "]"; 
	}




	
	



	
	
	
	

}
