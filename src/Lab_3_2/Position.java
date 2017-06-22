package Lab_3_2;

import java.util.ArrayList;

public class Position {
	private String title;
	private String description;
	
	ArrayList<Employee> emp;
	
	public Position(String title, String description){
		this.title=title;
		this.description=description;
		emp= new ArrayList<Employee>();
		
	}
	
	public String getTitle(){
		return title;
	}
	
	public void setTitle(String title){
		this.title=title;
		
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public void addEmp(Employee e)
	{
		
		emp.add(e);
	}

	public void print() {
		System.out.println("   Position is : " + getTitle());
		System.out.println("   Description of Position : " + getDescription());
		for(Employee e: emp)
		{
			e.print();
		}
	}
	
	public double getSalary(){
		
		double sum=0;
		for(Employee e: emp){
			sum+=e.getSalary();
		}
		System.out.println("Total Salary of Company " +getTitle()+"is" +sum);
		return sum;
	}

	@Override
	public String toString() {
		return "Position [title=" + title + ", description=" + description
				+ ", emp=" + emp + "]"+"\n";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((emp == null) ? 0 : emp.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Position other = (Position) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (emp == null) {
			if (other.emp != null)
				return false;
		} else if (!emp.equals(other.emp))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	
	
	
}

