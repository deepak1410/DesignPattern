package org.corejava.designpattern.behavioral.iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		Object[] obj = {"Matt", "Tom", "Brad", "John"};
		Object[] obj1 = {5, 10, 15, 20, 25};
		
		Container container = new ContainerImpl();
		((ContainerImpl)container).setObj(obj);
		Iterator iterator = container.iterator();
		
		System.out.println("*********Printing out 1st array*********");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		((ContainerImpl)container).setObj(obj1);
		Iterator iterator1 = container.iterator();
		System.out.println("*********Printing out 2nd array*********");
		while(iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}

	}

}
