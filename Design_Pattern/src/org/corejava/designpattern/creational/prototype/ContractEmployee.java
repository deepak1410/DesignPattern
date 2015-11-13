package org.corejava.designpattern.creational.prototype;

public class ContractEmployee extends Employee{

	String type;
	int salary;
	
	
	public ContractEmployee(String type, int salary) {
		this.type = type;
		this.salary = salary;
		System.out.println("Contract Employee created.");
	}

	
	@Override
	public String toString() {
		return "ContractEmployee [type=" + type + ", salary=" + salary + "]";
	}
	

}
