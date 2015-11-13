package org.corejava.designpattern.creational.abstractfactory;

public class SoftwareEngineer implements Employee{

	@Override
	public int getSalary() {
		int salary = 30000;
		System.out.println(">>>>>>Calculating SoftwareEngineer salary");
		return salary;
	}

}
