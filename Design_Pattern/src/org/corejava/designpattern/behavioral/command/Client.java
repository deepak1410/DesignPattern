package org.corejava.designpattern.behavioral.command;

public class Client {

	public static void main(String[] args) {
		
		WordDocument doc = new WordDocument();
		
		// Create command objects
		Command openCommand = new OpenCommand(doc);
		Command editCommand = new EditCommand(doc);
		Command saveComamnd = new SaveCommand(doc);
		
		// Create Menu
		MenuOptions menu = new MenuOptions(openCommand, editCommand, saveComamnd);
		
		// Open the document
		menu.open();
		
		// Edit Document
		menu.edit();
		
		//Save Document
		menu.save();

	}

}
