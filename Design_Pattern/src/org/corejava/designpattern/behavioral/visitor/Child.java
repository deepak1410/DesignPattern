package org.corejava.designpattern.behavioral.visitor;

public class Child implements Visitable {
	String name;
	String healthStatus;
	
	public Child(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHealthStatus() {
		return healthStatus;
	}

	public void setHealthStatus(String healthStatus) {
		this.healthStatus = healthStatus;
	}

	@Override
	public void accept(Visitor visitor) {
		System.out.println(visitor + " appointed for inspecting " + this.getName());
		visitor.visit(this);
	}

	@Override
	public String toString() {
		return this.getName();
	}
	
	

}
