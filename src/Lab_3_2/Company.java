package Lab_3_2;

import java.util.ArrayList;

public class Company {
	private String name;
	
	ArrayList<Department> department;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((department == null) ? 0 : department.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Company other = (Company) obj;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public Company(String name) {
		
		this.name = name;
		department= new ArrayList<Department>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addDept(Department d)
	{	
		
		department.add(d);
	}

	public void print(){
		System.out.println("Company Name:" +getName());
		
		for(Department d:department){
			System.out.println(d);
		}
		System.out.println("!!!!!!END!!!!!!!! ");
		
		
	}

	public double getSalary(){
		double sum=0;
		for(Department d:department){
			sum+=d.getSalary();
		}
		System.out.println("Total Salary of Company " +getName()+"is" +sum);
		
		return sum;
		
		
	}

	@Override
	public String toString() {
		return "Company [name=" + name + ", department=" + department + "]";
	}

	
	
	

}
