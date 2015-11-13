package org.corejava.designpattern.creational.prototype;

public abstract class Employee implements Cloneable{
	

	public Employee makeCopy() {
		Employee emp = null;
		
		try {
			emp = (Employee) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Exception occurred:" + e);
			e.printStackTrace();
		}
		return emp;
	}

}
