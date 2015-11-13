package org.corejava.designpattern.structural.composite;

public class JuniorEmployee implements IEmployee{
	private String name;
	private String designation;
	private int salary;

	public JuniorEmployee(String name, String designation, int salary) {
		super();
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "JuniorEmployee [name=" + name + ", designation=" + designation + ", salary=" + salary + "]";
	}

	@Override
	public int calculateTotalSalary() {
		if(getDesignation().contains("CEO")) {
			return (int) (salary + salary * CEO_VARIABLE_PAY);
		} else if(getDesignation().contains("Manager")) {
			return (int) (salary + salary * MANAGER_VARIABLE_PAY);
		} else if(getDesignation().contains("Lead")) {
			return (int) (salary + salary * LEAD_VARIABLE_PAY);
		} else if(getDesignation().contains("Engineer")) {
			return (int) (salary + salary * SE_VARIABLE_PAY);
		}
		return salary;
	}

	@Override
	public void addReporters(IEmployee employee) {
		// TODO Auto-generated method stub
	}

	@Override
	public void removeReporters(IEmployee employee) {
		// TODO Auto-generated method stub
	}
}
