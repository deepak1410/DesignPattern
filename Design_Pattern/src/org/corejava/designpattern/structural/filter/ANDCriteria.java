package org.corejava.designpattern.structural.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ANDCriteria implements Criteria{

	Criteria criteria1;
	Criteria criteria2;
	
	public ANDCriteria(Criteria criteria1, Criteria criteria2) {
		this.criteria1=criteria1;
		this.criteria2=criteria2;
	}
	
	@Override
	public List<Person> applyCriteria(List<Person> personList) {
		List<Person> filteredPersonsList1 = criteria1.applyCriteria(personList);
		List<Person> filteredPersonsList2 = criteria2.applyCriteria(filteredPersonsList1);
		return filteredPersonsList2;
	}
}
