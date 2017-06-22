package schoolLabPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class Department {
	private String deptName;
	private ArrayList<Person> personList = new ArrayList<Person>() ;
	
	
	
	public Department(String deptName) {
		super();
		this.deptName = deptName;
	}

	public int getTotalSalary(){
		 return 0;
	}
	
	public String showAllMembers(){
		return null;
	}
	
	public int unitsPerFaculty(){
		return 0;
	}
	

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public ArrayList<Person> getPersonList() {
		return personList;
	}

	public void setPersonList(ArrayList<Person> personList) {
		this.personList = personList;
		System.out.println(personList);
	}

	public void addFaculty(Faculty faculty) {
		//System.out.println(deptName);
		personList.add(faculty);
		
            
        
		
	}

	
	
	

}
