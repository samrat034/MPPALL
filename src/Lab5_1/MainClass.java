package Lab5_1;

import java.util.GregorianCalendar;

public class MainClass {
	public static void main(String[] args) {
		Employee e1= new Hourly(1, 200, 40);
		e1.calcCompensation(8, 2016).print();
		Employee e2=new Salaried(4, 9000);
		
		Commissioned e3= new Commissioned(3,800);
		
		Order o= new Order(e3, 11, new GregorianCalendar(2016,3,10), 12000);
		Order o1= new Order(e3, 11, new GregorianCalendar(2016,1,10), 6000);
		
		e3.add(o);
		e3.add(o1);
		
		DateRange dr= new DateRange(new GregorianCalendar(2016, 3, 1), new GregorianCalendar(2016,3,30));
		
		
		e2.calcCompensation(8, 2016).print();
		e3.calcCompensation(8, 2016).print();
		
	}

}
