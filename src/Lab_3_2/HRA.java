package Lab_3_2;

public class HRA {
	public static void main(String args[]) {
		Company company = new Company("Maharishi Vedic Institute");

		Department d1 = new Department("TM", "Fairfield");
		Department d2 = new Department("Yogic Flying", "Iowa");

		company.addDept(d1);
		company.addDept(d2);

		Position p1 = new Position("Director",
				"This is test description of Director");
		Position p2 = new Position("Manager",
				"This is test description of Manager");
		Position p3 = new Position("TMTeacher",
				"This is test description of TM Teacher");

		d1.addPosition(p1);
		d1.addPosition(p2);
		d1.addPosition(p3);

		Position p4 = new Position("Director",
				"This is test description of Director");
		Position p5 = new Position("YManager",
				"This is test description of Manager");
		Position p6 = new Position("Teacher",
				"This is test description of Yogic flying teacher");

		d2.addPosition(p4);
		d2.addPosition(p5);
		d2.addPosition(p6);

		// addemployee in p1

		Employee e1 = new Employee(1, "Joseph", "", "Lerman", "1970/02/02",
				"4465-4567-456", 45791.2);
		Employee e2 = new Employee(2, "Samrat", "", "Bhusal", "1989/07/24",
				"7894-4567-7895", 7894.3);
		Employee e3 = new Employee(3, "Nagendra", "Jung", "Limu", "1985/04/05",
				"4561-7895-6321", 8965.3);
		Employee e4 = new Employee(4, "Shree", "Raj", "Karki", "1993/05/05",
				"8594-4567-7895", 4523.3);
		Employee e5 = new Employee(5, "Govinda", "Prasad", "Basnet",
				"1991/02/14", "7412-8563-3695", 5632.2);
		Employee e6 = new Employee(6, "Gunjan", "", "Shakya", "1992/05/09",
				"3256-8956-7845", 2316.0);
		p1.addEmp(e1);
		p1.addEmp(e2);
		p1.addEmp(e3);
		p1.addEmp(e4);
		p1.addEmp(e5);
		p1.addEmp(e6);

		// addemployee in p2

		Employee e7 = new Employee(1, "Joseph", "", "Lerman", "1970/02/02",
				"4465-4567-456", 45791.2);
		Employee e8 = new Employee(2, "Samrat", "", "Bhusal", "1989/07/24",
				"7894-4567-7895", 7894.3);
		Employee e9 = new Employee(3, "Nagendra", "Jung", "Limu", "1985/04/05",
				"4561-7895-6321", 8965.3);
		Employee e10 = new Employee(4, "Shree", "Raj", "Karki", "1993/05/05",
				"8594-4567-7895", 4523.3);
		Employee e11 = new Employee(5, "Govinda", "Prasad", "Basnet",
				"1991/02/14", "7412-8563-3695", 5632.2);
		Employee e12 = new Employee(6, "Gunjan", "", "Shakya", "1992/05/09",
				"3256-8956-7845", 2316.0);
		p2.addEmp(e7);
		p2.addEmp(e8);
		p2.addEmp(e9);
		p2.addEmp(e10);
		p2.addEmp(e11);
		p2.addEmp(e12);

		// addemployee in p3

		Employee e13 = new Employee(1, "Joseph", "", "Lerman", "1970/02/02",
				"4465-4567-456", 45791.2);
		Employee e14 = new Employee(2, "Samrat", "", "Bhusal", "1989/07/24",
				"7894-4567-7895", 7894.3);
		Employee e15 = new Employee(3, "Nagendra", "Jung", "Limu",
				"1985/04/05", "4561-7895-6321", 8965.3);
		Employee e16 = new Employee(4, "Shree", "Raj", "Karki", "1993/05/05",
				"8594-4567-7895", 4523.3);
		Employee e17 = new Employee(5, "Govinda", "Prasad", "Basnet",
				"1991/02/14", "7412-8563-3695", 5632.2);
		Employee e18 = new Employee(6, "Gunjan", "", "Shakya", "1992/05/09",
				"3256-8956-7845", 2316.0);
		p3.addEmp(e13);
		p3.addEmp(e14);
		p3.addEmp(e15);
		p3.addEmp(e16);
		p3.addEmp(e17);
		p3.addEmp(e18);

		// addemployee in p4

		Employee ee1 = new Employee(1, "Joseph", "", "Lerman", "1970/02/02",
				"4465-4567-456", 45791.2);
		Employee ee2 = new Employee(2, "Samrat", "", "Bhusal", "1989/07/24",
				"7894-4567-7895", 7894.3);
		Employee ee3 = new Employee(3, "Nagendra", "Jung", "Limu",
				"1985/04/05", "4561-7895-6321", 8965.3);
		Employee ee4 = new Employee(4, "Shree", "Raj", "Karki", "1993/05/05",
				"8594-4567-7895", 4523.3);
		Employee ee5 = new Employee(5, "Govinda", "Prasad", "Basnet",
				"1991/02/14", "7412-8563-3695", 5632.2);
		Employee ee6 = new Employee(6, "Gunjan", "", "Shakya", "1992/05/09",
				"3256-8956-7845", 2316.0);
		p4.addEmp(ee1);
		p4.addEmp(ee2);
		p4.addEmp(ee3);
		p4.addEmp(ee4);
		p4.addEmp(ee5);
		p4.addEmp(ee6);

		// addemployee in p5

		Employee ee7 = new Employee(1, "Joseph", "", "Lerman", "1970/02/02",
				"4465-4567-456", 45791.2);
		Employee ee8 = new Employee(2, "Samrat", "", "Bhusal", "1989/07/24",
				"7894-4567-7895", 7894.3);
		Employee ee9 = new Employee(3, "Nagendra", "Jung", "Limu",
				"1985/04/05", "4561-7895-6321", 8965.3);
		Employee ee10 = new Employee(4, "Shree", "Raj", "Karki", "1993/05/05",
				"8594-4567-7895", 4523.3);
		Employee ee11 = new Employee(5, "Govinda", "Prasad", "Basnet",
				"1991/02/14", "7412-8563-3695", 5632.2);
		Employee ee12 = new Employee(6, "Gunjan", "", "Shakya", "1992/05/09",
				"3256-8956-7845", 2316.0);
		p5.addEmp(ee7);
		p5.addEmp(ee8);
		p5.addEmp(ee9);
		p5.addEmp(ee10);
		p5.addEmp(ee11);
		p5.addEmp(ee12);

		// addemployee in p6

		Employee ee13 = new Employee(1, "Joseph", "", "Lerman", "1970/02/02",
				"4465-4567-456", 45791.2);
		Employee ee14 = new Employee(2, "Samrat", "", "Bhusal", "1989/07/24",
				"7894-4567-7895", 7894.3);
		Employee ee15 = new Employee(3, "Nagendra", "Jung", "Limu",
				"1985/04/05", "4561-7895-6321", 8965.3);
		Employee ee16 = new Employee(4, "Shree", "Raj", "Karki", "1993/05/05",
				"8594-4567-7895", 4523.3);
		Employee ee17 = new Employee(5, "Govinda", "Prasad", "Basnet",
				"1991/02/14", "7412-8563-3695", 5632.2);
		Employee ee18 = new Employee(6, "Gunjan", "", "Shakya", "1992/05/09",
				"3256-8956-7845", 2316.0);
		p6.addEmp(ee13);
		p6.addEmp(ee14);
		p6.addEmp(ee15);
		p6.addEmp(ee16);
		p6.addEmp(ee17);
		p6.addEmp(ee18);

		// company.print();
		// System.out.println("Salary :");
		// company.getSalary();
		// System.out.println(company );
		System.out.println(company);
		company.print();
		// System.out.println(p1 );
		//
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());

		System.out.println(e1.equals(e1));

	}

}
