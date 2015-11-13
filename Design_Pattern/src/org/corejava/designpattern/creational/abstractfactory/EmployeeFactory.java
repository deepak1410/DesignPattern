package org.corejava.designpattern.creational.abstractfactory;

public abstract class EmployeeFactory {

	public abstract Employee getEmployee(String emp); 
	
	public static EmployeeFactory getEmployeeType(String type) {
		if("contract".equalsIgnoreCase(type)) {
			return new ContractEmployeeFactory();
		} else if("permanent".equalsIgnoreCase(type)) {
			return new PermanentEmployeeFactory();
		} else {
			return null;
		}
	}
}
