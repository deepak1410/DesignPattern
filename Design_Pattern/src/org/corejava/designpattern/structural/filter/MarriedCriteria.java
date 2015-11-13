package org.corejava.designpattern.structural.filter;

import java.util.ArrayList;
import java.util.List;

public class MarriedCriteria implements Criteria{

	@Override
	public List<Person> applyCriteria(List<Person> personList) {
		List<Person> filteredPersons = new ArrayList<Person>();
		for(Person person : personList) {
			if(person.getMaritalstatus().equalsIgnoreCase(Person.MARRIED))
			filteredPersons.add(person);
		}
		
		return filteredPersons;
	}

}
