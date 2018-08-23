package com.dpk;

import java.io.Serializable;

class Singleton implements Serializable{
	
	private static Singleton instance = null;
	private String name;
	private Singleton(){}
	
	public static Singleton getInstance() {
		
		if(instance == null) {
			synchronized(Singleton.class) {
				if(instance == null){
					instance = new Singleton();
				}
			}
		}
		
		return instance;
		
	}
	
	public Object readResolve() {
		return getInstance();
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
}



public class SingletonDemo {

	public static void main(String[] args) {
		
		Singleton s = Singleton.getInstance();
		s.setName("abc");
		
		System.out.println(s.getName());
		
		Singleton s1 = Singleton.getInstance();
		System.out.println(s1.getName());

	}

}
