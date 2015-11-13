package org.corejava.designpattern.structural.composite;

import java.util.List;

public class CompositeTest {
	
	public static void main(String[] args) {
		IEmployee dave = new SeniorEmployee("Deve", "CEO", 300000);
		IEmployee peter = new SeniorEmployee("Peter", "Dev Manager", 200000);
		IEmployee john = new SeniorEmployee("John", "QA Manager", 200000);
		IEmployee rohan = new SeniorEmployee("Roahn", "Dev Tech Lead", 100000);
		IEmployee vijay = new SeniorEmployee("Vijay", "QA Tech Lead", 100000);
		
		/* Creating Junior Employees */
		IEmployee raj = new JuniorEmployee("Raj", "Dev Software Engineer", 50000);
		IEmployee hema = new JuniorEmployee("Hema", "Dev Software Engineer", 50000);
		IEmployee mohan = new JuniorEmployee("Mohan", "Dev Software Engineer", 50000);
		IEmployee saran = new JuniorEmployee("Saran", "QA Software Engineer", 50000);
		IEmployee ria = new JuniorEmployee("Ria", "QA Software Engineer", 50000);
		
		dave.addReporters(peter);
		dave.addReporters(john);
		peter.addReporters(rohan);
		rohan.addReporters(raj);
		rohan.addReporters(hema);
		rohan.addReporters(mohan);
		john.addReporters(saran);
		vijay.addReporters(saran);
		vijay.addReporters(ria);
		
		System.out.println(">>>>>>>>Who report(s) to Vijay");
		displayReporters(((SeniorEmployee) vijay).getReporters());
		
		System.out.println("\n>>>>>>>>Who report(s) to Dave");
		displayReporters(((SeniorEmployee) dave).getReporters());
		
		System.out.println("\n>>>>>>>>How much is Peter's CTC");
		System.out.println(((SeniorEmployee) peter).calculateTotalSalary());
		
		System.out.println("\n>>>>>>>>How much is Dave's CTC");
		System.out.println(((SeniorEmployee) dave).calculateTotalSalary());

	}
	
	
	public static void displayReporters(List<IEmployee> employees) {
		for(IEmployee employee : employees) {
			System.out.println(employee);
		}
	}


}
