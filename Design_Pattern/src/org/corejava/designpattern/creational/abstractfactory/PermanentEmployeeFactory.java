package org.corejava.designpattern.creational.abstractfactory;

public class PermanentEmployeeFactory extends EmployeeFactory {

	@Override
	public Employee getEmployee(String emp) {
		if("SoftwareEngineer".equalsIgnoreCase(emp)) {
			return new SoftwareEngineer();
		} else if("TechLead".equalsIgnoreCase(emp)) {
			return new TechnicalLead();
		}

		return null;
	}

}
