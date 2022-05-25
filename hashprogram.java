package generics;

import java.util.HashSet;
import java.util.Set;


public class hashprogram {
	
private int empId;

	private String empName;

	private int empSalary;

	private String empdepartment;

	public hashprogram(int empId, String empName, int empSalary, String empdepartment ) {

	super();

	this.empId = empId;

	this.empName = empName;

	this.empSalary = empSalary;

	this.empdepartment = empdepartment;

	}

	public final int getEmpId() {

	return empId;

	}

	public final void setEmpId(int empId) {

	this.empId = empId;

	}

	public final String getEmpName() {

	return empName;

	}

	public final int getempSalary() {

	return empSalary;

	}

	public final void setempSalary(int empSalary) {

	this.empSalary = empSalary;

	}

	public final String getEmpdepartment() {

	return empdepartment;

	}

	public final void setEmpName(String empName) {

	this.empName = empName;
	}
	public static void main(String[] args) {

		Set<hashprogram> employees = new HashSet<>();

		employees.add(new hashprogram(1, "Raj", 10000, "Science"));

		employees.add(new hashprogram(1, "Pradeep", 20000, "Social"));

		employees.add(new hashprogram(1, "Kumar", 30000,"maths"));

		employees.add(new hashprogram(2, "Chandan", 40000,"hindi"));

		employees.add(new hashprogram(2, "Amitava", 50000,"english"));

		System.out.println(employees);
	}
}
