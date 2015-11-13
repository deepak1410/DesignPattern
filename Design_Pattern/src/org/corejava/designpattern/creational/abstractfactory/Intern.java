package org.corejava.designpattern.creational.abstractfactory;

public class Intern implements Employee{

	@Override
	public int getSalary() {
		int salary = 15000;
		System.out.println(">>>>>>Calculating Intern salary.");
		return salary;
	}

}
