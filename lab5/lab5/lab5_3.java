package lab5;

import com.cg.eis.exception.EmployeeException;

class Employee{
	String name;
	int id;
	double salary;
	Employee(int id,String nm) {
		this.id=id;
		this.name=nm;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) throws EmployeeException {
		
		if(salary<3000) {
			throw new EmployeeException("Salary is below 3000");
		}
		else {
		this.salary = salary;
		}
	}
	
}
public class lab5_3 {
public static void main(String[] args) {
	Employee emp=new Employee(1, "Harsh");
	try {
	
	emp.setSalary(2000);

	}catch(Exception e) {
		System.out.println("Exception: "+e);
	}
}
}
