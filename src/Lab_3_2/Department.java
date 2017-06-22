package Lab_3_2;

import java.util.ArrayList;

public class Department {
	private String name;
	private String location;
	
	ArrayList<Position> position;
	
	
	
	
	public Department(String name, String location) {
		super();
		this.name = name;
		this.location = location;
		position = new ArrayList<Position>();
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getLocation() {
		return location;
	}



	public void setLocation(String location) {
		this.location = location;
	}
	
	public void addPosition(Position p)
	{
		
		position.add(p);
	}



	public void print(){
		System.out.println("Department Name:" +getName());
		System.out.println("Location:" +getLocation());
		
		for(Position p : position){
			p.print();
		}
		
		System.out.println("\n");
		
	}
	
	public double getSalary(){
		double sum=0;
		for(Position p: position){
			sum+=p.getSalary();
		}
		System.out.println("Total Salary of Company " +getName()+"is" +sum);
		return sum;
		
	}



	@Override
	public String toString() {
		return "Department [name=" + name + ", location=" + location
				+ ", position=" + position + "]"+"\n";
	}
	
	
	
	
	

}
