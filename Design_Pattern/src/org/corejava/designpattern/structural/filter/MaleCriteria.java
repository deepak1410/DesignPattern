package org.corejava.designpattern.structural.filter;

import java.util.ArrayList;
import java.util.List;

public class MaleCriteria implements Criteria{

	@Override
	public List<Person> applyCriteria(List<Person> personList) {
		List<Person> filteredPersons = new ArrayList<Person>();
		for(Person person : personList) {
			if(person.getGender().equalsIgnoreCase(Person.MALE))
			filteredPersons.add(person);
		}
		
		return filteredPersons;
	}

}
