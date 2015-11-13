package org.corejava.designpattern.behavioral.command;

public class SaveCommand implements Command {

	WordDocument doc;
	
	public SaveCommand(WordDocument doc) {
		this.doc=doc;
	}

	@Override
	public void execute() {
		doc.save();
	}

}
