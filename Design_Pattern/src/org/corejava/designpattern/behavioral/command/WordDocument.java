package org.corejava.designpattern.behavioral.command;

/**
 * 
 * @author Deepak
 * This is a Receiver class
 */
public class WordDocument {

	public void open() {
		System.out.println("The word document is opened.");
	}
	
	public void edit() {
		System.out.println("The word document has been edited.");
	}
	
	public void save() {
		System.out.println("The document has been saved.");
	}
}
