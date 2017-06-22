package lambda;

//Program 4: ProcessingEmployees.java
//Processing streams of Employee objects.
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ProcessingEmployees {
	public static void main(String[] args) {
		// initialize array of Employees
		Employee[] employees = { 
				new Employee("Jason", "Red", 5000, "IT"),
				new Employee("Ashley", "Green", 7600, "IT"),
				new Employee("Matthew", "Indigo", 3587.5, "Sales"),
				new Employee("James", "Indigo", 4700.77, "Marketing"),
				new Employee("Luke", "Indigo", 6200, "IT"),
				new Employee("Jason", "Blue", 3200, "Sales"),
				new Employee("Wendy", "Brown", 4236.4, "Marketing") };

		// // get List view of the Employees
		List<Employee> list = Arrays.asList(employees);

		// count the number of last name begin with B
		System.out.println("Counting the number of lastname:"
				+ list.stream().filter(e -> e.getLastName().startsWith("B"))
						.count());

		System.out.println("question2");
		list.stream()
				.filter(e -> e.getLastName().startsWith("B"))
				.sorted(Comparator.comparing(Employee::getLastName)
						.thenComparing(Employee::getFirstName))
				.forEach(System.out::println);
		System.out.println("question3");
		list.stream()
				.filter(e -> e.getLastName().startsWith("B"))
				.map(e -> new Employee(e.getFirstName().toUpperCase(), e
						.getLastName(), e.getSalary(), e.getDepartment()))
				.forEach(System.out::println);
		// 4) Print out All of the employee objects, but if the last name begins
		// with the letter ‘B’,
		// then capitalize all the letters in the last name.
		System.out.println("question4");
		list.stream().forEach(
				e -> {
					if (e.getLastName().startsWith("B")) {
						System.out.println(new Employee(e.getFirstName()
								.toUpperCase(), e.getLastName().toUpperCase(),
								e.getSalary(), e.getDepartment()));
					} else
						System.out.println(new Employee(e.getFirstName(), e
								.getLastName(), e.getSalary(), e
								.getDepartment()));

				});
		// 5) Print out all of the Employee objects’ last names, whose last name
		// begins with the letter ‘I’ in sorted order, and get rid of all the
		// duplicates.
		// Print out only the last names.
		System.out.println("question5");
		list.stream().filter(e -> e.getLastName().startsWith("I"))
				.map(Employee::getLastName).sorted().distinct()

				.forEach(System.out::println);
		
		//        6)  Print out the average of all the salaries.
		double sal= list.stream()
					.mapToDouble(e->e.getSalary())
					.average()
					.getAsDouble();
		System.out.println("Average:"+sal);
		
		//7)  Use the  ‘reduce’  method to print out the total salary of all employees
		System.out.println("Salary:"+
		list.stream()
			.mapToDouble(e->e.getSalary())
			.reduce(0, (s1,s2)->s1+s2)
				);
		
		//   8)  Print out only the first names of all the employees.  Use the  ‘map’  method to accomplish this.  
		list.stream()
		.map(e->e.getFirstName())
		.forEach(System.out::println);
		
		//
		IntStream.iterate(0, i->i+2)
				.limit(20)
				.forEach(System.out::println);
		

	}

}
