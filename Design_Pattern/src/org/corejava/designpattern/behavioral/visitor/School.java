package org.corejava.designpattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class School {

	private static List<Child> children = new ArrayList<Child>();
	private Visitor visitor;
	
	static {
		children.add(new Child("Tom"));
		children.add(new Child("John"));
		children.add(new Child("Matt"));
		children.add(new Child("David"));
	}
	
	public void doHealthCheckup() {
		visitor = new ChildSpecialistDoctor("Dr. Johnson");
		for(Child child : children) {
			child.accept(visitor);
		}
	}
}
