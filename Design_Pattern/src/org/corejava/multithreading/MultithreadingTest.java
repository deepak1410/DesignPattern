package org.corejava.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Employee extends Thread {

	public void run() {
		for(int i=0; i<5;i++) {
			
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(i);
		}
	}
}

class Student implements Runnable {

	@Override
	public void run() {
		
		
	}
	
}



public class MultithreadingTest {

	public static void main(String[] args) throws InterruptedException {
		
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();
		
		//Student st = new Student();
		//Thread threadSt1 = new Thread(st);
		
		ExecutorService executor = Executors.newFixedThreadPool(5);
		
		emp1.start();
		emp2.setDaemon(true);
		emp2.start();
		emp3.start();
		
	}

}
