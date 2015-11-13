package org.corejava.features;

class Sample {
	int i;
	public void doSomething() {
		System.out.println("Entering doSomething()");
		
		try{
			i = 1;
			i = 10/0;
		}finally {
			i = 3;
			System.out.println("Finally of Sample" + i);
		}
		
		
	}
}


public class FinallyTest extends Sample{

	public void display(){
		
		try {
			(new Sample()).doSomething();
			i = 4;
		} catch(Exception ex) {
			i = 5;
		} finally {
			i = 6;
		}
		
		
		System.out.println(i);
	}
	
	
	public static void main(String[] args) {
		
		FinallyTest st = new FinallyTest();
		st.display();
		
		//System.out.println(num);
		
	}

}
