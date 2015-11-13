package org.corejava.designpattern.creational.abstractfactory;

public class ContractEmployeeFactory extends EmployeeFactory{

	@Override
	public Employee getEmployee(String emp) {
		if("intern".equalsIgnoreCase(emp)) {
			return new Intern();
		} else if("trainer".equalsIgnoreCase(emp)) {
			return new Trainer();
		}

		return null;
	}
}
