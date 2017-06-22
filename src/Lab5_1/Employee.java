package Lab5_1;

import java.util.GregorianCalendar;
import java.util.List;
import java.util.ArrayList;



public abstract class Employee {
	private int empId;
	
	private List<Paycheck> paycheck= new ArrayList<Paycheck>();
	
	public Employee(int empId) {
		this.empId = empId;
	}
	
	
	public void print(){
		
	}
	
	public Paycheck calcCompensation(int month, int year){
		boolean flag=true;
		GregorianCalendar cal=new GregorianCalendar();
		cal.set(GregorianCalendar.YEAR, year);
		cal.set(GregorianCalendar.MONTH, month);
		
		DateRange dr= new DateRange(DateRange.getStartDate(cal), DateRange.getEndDate(cal));
		
		double grossAmt= calcGrossPay(dr);
		double fica=grossAmt*0.23;
		double state=grossAmt*0.05;
		double local=grossAmt*0.01;
		double medicare=grossAmt*0.03;
		double socialSecurity=grossAmt*0.075;
		
		Paycheck pc= new Paycheck(grossAmt, fica, state, local, medicare, socialSecurity, dr, this);
		
		for(Paycheck paychk: paycheck){
			if(dr.getStartDate().equals(paychk.getPayPeriod().getStartDate()) && dr.getEndDate().equals(paychk.getPayPeriod().getEndDate())){
				flag=false;
				break;
			}
		}
		
		if(flag){
			paycheck.add(pc);
		}
		
		
		
		return pc;
		
		
	}
	
	public abstract double calcGrossPay(DateRange dr);
	

}
