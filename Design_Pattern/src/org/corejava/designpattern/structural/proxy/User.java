package org.corejava.designpattern.structural.proxy;

public class User {
	private String name;
	private int id;
	private String department;
	
	public User(String name, int id, String department) {
		this.name=name;
		this.id=id;
		this.department=department;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", department=" + department + "]";
	}
	
	
	
}
