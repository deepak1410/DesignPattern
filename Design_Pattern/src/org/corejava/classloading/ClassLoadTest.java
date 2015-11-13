package org.corejava.classloading;

class Parent {
	
	Parent(String s){
		System.out.println("Default Parent");
	}
	
	// SIB
	static {
		System.out.println("SIB called");
	}
	
	//IIB
	{
		System.out.println("IIB called");
	}
	
}


public class ClassLoadTest extends Parent{

	ClassLoadTest(String s){
		super("");
	}
	public static void main(String[] args) {
		
		ClassLoadTest classLoadTest = new ClassLoadTest("test");
		System.out.println("In main");
	}

}
