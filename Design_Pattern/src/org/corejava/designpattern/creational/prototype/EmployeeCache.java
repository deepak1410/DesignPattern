package org.corejava.designpattern.creational.prototype;

import java.util.Hashtable;

public class EmployeeCache {

	static Hashtable <String, Employee> empCache = new Hashtable<String, Employee>();
	
	public Employee getEmployee(String type) {
		Employee emp = empCache.get(type);
		if(emp == null) {
			if(type.equalsIgnoreCase("permanent")) {
				emp = new PermanentEmployee("permanent", 50000);
				empCache.put("permanent", emp);
			} else if(type.equalsIgnoreCase("contract")) {
				emp = new ContractEmployee("contract", 40000);
				empCache.put("contract", emp);
			}

		}

		return emp.makeCopy();
	}


}
