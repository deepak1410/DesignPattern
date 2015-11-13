package org.corejava.features;

import java.util.Stack;

public class Sample1 {

	public static void main(String[] args) {
		Stack s = new Stack();
		
		s.push("1");
		s.push("2");
		s.push("3");
		
		s.pop();
		
		
		for(Object o : s) {
			System.out.println(o);
		}
		
		
	}

}
