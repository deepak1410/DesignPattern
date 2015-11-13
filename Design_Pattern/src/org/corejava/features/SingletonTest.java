package org.corejava.features;

class Singleton {
	private static Singleton instance = new Singleton();
	private Singleton(){};
	
	public static Singleton getInstance() {
		return instance;
	}
}


public class SingletonTest {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println("Compare the Hash Code=" + (s1.hashCode() == s2.hashCode()) + " :" + (s1 ==s2));

	}

}
