package org.corejava.designpattern.behavioral.visitor;

public class ChildSpecialistDoctor implements Visitor {

	private String name;

	public ChildSpecialistDoctor(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.getName();
	}

	@Override
	public void visit(Visitable visitable) {
		((Child)visitable).setHealthStatus("Bad");
		System.out.println(this + " has checked health of " + visitable + " and found the health condition Not Good hence updated condition as: " + ((Child)visitable).getHealthStatus());
	}

}
