package com.capgemini.assesments.day3;

public class EmployeeTest {
	static void printEmployeeDetails(Employee[] emp){
		for (int i = 0; i < emp.length; i++) {
			System.out.println("Name = "+emp[i].name);
			System.out.println("Id = "+emp[i].id);
			System.out.println("Percentage = "+emp[i].salary);
			System.out.println("*********************");
		}
	}
		static Employee[] getEmployeeDetails(){
		Employee[] employees = new Employee[4];
		Employee s1 = new Employee(101, "Swarupa", 10000);
		Employee s2 = new Employee(102, "Sakshi", 20000);
		Employee s3 = new Employee(103, "Disha", 30000);
		Employee s4 = new Employee(104, "Anupama",15000);

		employees[0] = s1;
		employees[1] = s2;
		employees[2] = s3;
		employees[3] = s4;
		return employees;

	}
	public static void main(Employee[] args) {
		Employee[] employees = new Employee[4];
		Employee s1 = new Employee(201, "suyash", 11000);
		Employee s2 = new Employee(202, "nikhil", 21000);
		Employee s3 = new Employee(203, "rupesh", 31000);
		Employee s4 = new Employee(204, "surya", 41000);

		employees[0] = s1;
		employees[1] = s2;
		employees[2] = s3;
		employees[3] = s4;


		printEmployeeDetails(employees);
		Employee[] emp1 = getEmployeeDetails();
		printEmployeeDetails(emp1);		

	}
}
