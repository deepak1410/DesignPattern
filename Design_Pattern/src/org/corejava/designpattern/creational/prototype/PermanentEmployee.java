package org.corejava.designpattern.creational.prototype;

public class PermanentEmployee extends Employee{

	String type;
	int salary;

	public PermanentEmployee(String type, int salary) {
		this.type = type;
		this.salary = salary;
		System.out.println("Permanent Employee created.");
	}


	@Override
	public String toString() {
		return "PermanentEmployee [type=" + type + ", salary=" + salary + "]";
	}

	

}
