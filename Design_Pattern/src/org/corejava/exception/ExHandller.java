package org.corejava.exception;

import java.io.IOException;

class Employee extends Exception{
	
	public void doWork() throws Exception {
		throw new Exception();
	}
	
	public void getSalary() throws IOException{
		throw new IOException();
	}
}



public class ExHandller {

	public static void main(String[] args) throws Exception {
		
		Employee emp = new Employee();
		try {
			emp.doWork();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
