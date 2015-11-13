package org.corejava.designpattern.structural.filter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilterClient {

	public static void display(List<Person> persons) {
		for(Person person : persons) {
			System.out.println(person);
		}
	}
	
	public static void main(String[] args) {
		  List<Person> persons = new ArrayList<Person>();
		  List<Person> filteredPerson = null;

	      persons.add(new Person("Robert",Person.MALE, Person.UNMARRIED));
	      persons.add(new Person("John", Person.MALE, Person.MARRIED));
	      persons.add(new Person("Laura", Person.FEMALE, Person.MARRIED));
	      persons.add(new Person("Diana", Person.FEMALE, Person.UNMARRIED));
	      persons.add(new Person("Mike", Person.MALE, Person.UNMARRIED));
	      persons.add(new Person("Bobby", Person.MALE, Person.UNMARRIED));
	      
	      System.out.println(">>>>>>>>>Filtering and printing only Male persons.");
	      Criteria maleCriteria = new MaleCriteria();
	      filteredPerson = maleCriteria.applyCriteria(persons);
	      if(filteredPerson != null) {
	    	  display(filteredPerson);
	      }
	      
	      System.out.println(">>>>>>>>>>>>printing only Female persons.");
	      Criteria femaleCriteria = new FemaleCriteria();
	      filteredPerson = femaleCriteria.applyCriteria(persons);
	      if(filteredPerson != null) {
	    	  display(filteredPerson);
	      }
	      
	      System.out.println(">>>>>>>>>>>>printing only married persons.");
	      Criteria marriedCriteria = new MarriedCriteria();
	      filteredPerson = marriedCriteria.applyCriteria(persons);
	      if(filteredPerson != null) {
	    	  display(filteredPerson);
	      }
	      
	      System.out.println(">>>>>>>>>>>>printing only unmarried persons.");
	      Criteria unmarriedCriteria = new UnmarriedCriteria();
	      filteredPerson = unmarriedCriteria.applyCriteria(persons);
	      if(filteredPerson != null) {
	    	  display(filteredPerson);
	      }
	      
	      System.out.println(">>>>>>>>>>>>printing Either Male OR Married persons.");
	      Criteria maleOrMarriedCriteria = new ORCriteria(maleCriteria, marriedCriteria);
	      filteredPerson = maleOrMarriedCriteria.applyCriteria(persons);
	      if(filteredPerson != null) {
	    	  display(filteredPerson);
	      }
	      
	      System.out.println(">>>>>>>>>>>>printing FeMale AND UnMarried persons.");
	      Criteria femaleAndUnmarriedCriteria = new ANDCriteria(femaleCriteria, unmarriedCriteria);
	      filteredPerson = femaleAndUnmarriedCriteria.applyCriteria(persons);
	      if(filteredPerson != null) {
	    	  display(filteredPerson);
	      }

	}

}
