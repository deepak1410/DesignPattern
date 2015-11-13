package org.corejava.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class SeniorEmployee implements IEmployee {

	private String name;
	private String designation;
	private int salary;
	private List<IEmployee> reporters = new ArrayList<IEmployee>();

	public SeniorEmployee(String name, String designation, int salary) {
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

	public List<IEmployee> getReporters() {
		return reporters;
	}

	public void setReporters(List<IEmployee> reporters) {
		this.reporters = reporters;
	}
	
	/* Methods to add remove reporters only applied for Senior Employees */
	
	public void addReporters(IEmployee employee) {
		reporters.add(employee);
	}
	
	public void removeReporters(IEmployee employee) {
		reporters.remove(employee);
	}

	@Override
	public int calculateTotalSalary() {
		int maxVariablePay = 0;
		int netVariablePay = 0;
		if(getDesignation().contains("CEO")) {
			maxVariablePay = (int) (salary * CEO_VARIABLE_PAY);
			netVariablePay = (int) (maxVariablePay * VARIABLE_PAY_PERCENTAGE_THIS_YEAR);
			return (int) (salary - maxVariablePay + netVariablePay);
		} else if(getDesignation().contains("Manager")) {
			maxVariablePay = (int) (salary * MANAGER_VARIABLE_PAY);
			netVariablePay = (int) (maxVariablePay * VARIABLE_PAY_PERCENTAGE_THIS_YEAR);
			return (int) (salary - maxVariablePay + netVariablePay);
		} else if(getDesignation().contains("Lead")) {
			maxVariablePay = (int) (salary * LEAD_VARIABLE_PAY);
			netVariablePay = (int) (maxVariablePay * VARIABLE_PAY_PERCENTAGE_THIS_YEAR);
			return (int) (salary - maxVariablePay + netVariablePay);
		} else if(getDesignation().contains("Engineer")) {
			maxVariablePay = (int) (salary * SE_VARIABLE_PAY);
			netVariablePay = (int) (maxVariablePay * VARIABLE_PAY_PERCENTAGE_THIS_YEAR);
			return (int) (salary - maxVariablePay + netVariablePay);
		}
		return salary;
	}

	@Override
	public String toString() {
		return "SeniorEmployee [name=" + name + ", designation=" + designation + ", salary=" + salary + "]";
	}
	
	
	
}
