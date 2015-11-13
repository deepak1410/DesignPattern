package org.corejava.designpattern.creational.abstractfactory;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		EmployeeFactory permanentEmpFactory = EmployeeFactory.getEmployeeType("permanent");
		EmployeeFactory contractEmpFactory = EmployeeFactory.getEmployeeType("contract");
		
		int softEnggSalary = permanentEmpFactory.getEmployee("softwareEngineer").getSalary();
		System.out.println("Software Engineer Salary=" + softEnggSalary + "\n");
		
		int internSalary = contractEmpFactory.getEmployee("intern").getSalary();
		System.out.println("Intern Salary=" + internSalary);

	}

}
