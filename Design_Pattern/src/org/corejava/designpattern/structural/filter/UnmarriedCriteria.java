package org.corejava.designpattern.structural.filter;

import java.util.ArrayList;
import java.util.List;

public class UnmarriedCriteria implements Criteria{

	@Override
	public List<Person> applyCriteria(List<Person> personList) {
		List<Person> filteredPersons = new ArrayList<Person>();
		for(Person person : personList) {
			if(person.getMaritalstatus().equalsIgnoreCase(Person.UNMARRIED))
			filteredPersons.add(person);
		}
		
		return filteredPersons;
	}

}
