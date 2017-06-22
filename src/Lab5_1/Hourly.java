package Lab5_1;

public class Hourly extends Employee{
	private double hourlyWage;
	private int hoursPerWeek;
	public Hourly(int empId,int hourlyWage, int hoursPerWeek) {
		super(empId);
		this.hourlyWage=hourlyWage;
		this.hoursPerWeek=hoursPerWeek;
	}


	
	
	
	public double calcGrossPay(DateRange dr){
		return hourlyWage*(hoursPerWeek*4);
		
	}
}
