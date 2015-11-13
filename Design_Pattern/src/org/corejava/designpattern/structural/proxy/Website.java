package org.corejava.designpattern.structural.proxy;

public class Website implements IWebsite {

	@Override
	public void visitWebsite(String website, User user) {
		System.out.println("Displaying the content of " + website + " to the user " + user);
	}

}
