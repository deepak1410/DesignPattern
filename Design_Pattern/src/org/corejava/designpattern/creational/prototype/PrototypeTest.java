package org.corejava.designpattern.creational.prototype;

public class PrototypeTest {

	public static void main(String[] args) {
		EmployeeCache empCache = new EmployeeCache();

		Employee permEmp1 = empCache.getEmployee("permanent");
		System.out.println(permEmp1);
		
		Employee contractEmp1 = empCache.getEmployee("contract");
		System.out.println(contractEmp1);
		
		Employee contractEmp2 = empCache.getEmployee("contract");
		System.out.println(contractEmp2);
	}

}
