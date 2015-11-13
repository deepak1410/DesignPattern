package org.corejava.features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Person {
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return "Person{Name=" + this.name + ", Age=" + this.age + "}";
	}
	
}

final class Immutable {
	private static String name;
	private int id;
	
}


public class CollectionTest {

	public static void displayPerson() {
		List<Person1> personList = new ArrayList<Person1>();
	}
	
	public static void main(String[] args) {
		//displayPerson();
		//Immutable immutable = new Immutable();
		//System.out.println(immutable);
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "One");
		map.put(1, "Two");
		
		
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("key:" + entry.getKey() + " Value:" + entry.getValue());
		}
		
		
	}

}
