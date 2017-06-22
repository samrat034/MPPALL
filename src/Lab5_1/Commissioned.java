package Lab5_1;

import java.util.List;
import java.util.ArrayList;

public class Commissioned extends Employee{
	private double commision;
	private double baseSalary;
	
	public Commissioned(int empId, double baseSalary) {
		super(empId);
		this.baseSalary=baseSalary;
		//this.commision=commision;
	}
	private List<Order> order= new ArrayList<Order>();
	
	
	@Override
	public double calcGrossPay(DateRange daterang) {
		
		return baseSalary + getCommision(daterang);
	}
	
	public void add(Order o){
		order.add(o);
	}
	
	public double getCommision(DateRange daterang) {
		double sum=0;
		for(Order o: order){
			if(daterang.isInRange(o.getOrderDate())){
				sum+=o.getOrderAmount();
			}
		}
		return 0.07*sum;
	}


	



	
}
