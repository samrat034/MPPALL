package schoolLabPractice;

public class Student extends Person{
	public Student(String name, String phone, int age) {
		super(name, phone, age);
		// TODO Auto-generated constructor stub
	}

	private double gpa;

	public int getTotalUnits(){
		return 0;
	}
	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

}
