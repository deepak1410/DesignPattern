package org.corejava.designpattern.structural.filter;

public class Person {
	private String name;
	private String gender;
	private String maritalstatus;
	
	public static final String MALE = "Male";
	public static final String FEMALE = "Female";
	public static final String MARRIED = "Married";
	public static final String UNMARRIED = "Unmarried";
	
	public Person(String name, String gender, String maritalstatus) {
		this.name=name;
		this.gender=gender;
		this.maritalstatus=maritalstatus;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMaritalstatus() {
		return maritalstatus;
	}
	public void setMaritalstatus(String maritalstatus) {
		this.maritalstatus = maritalstatus;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", maritalstatus=" + maritalstatus + "]";
	}
	
	
	
	
}
