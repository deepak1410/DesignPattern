package org.corejava.designpattern.structural.filter;

import java.util.List;

public interface Criteria {
	public List<Person> applyCriteria(List<Person> persons);
}
