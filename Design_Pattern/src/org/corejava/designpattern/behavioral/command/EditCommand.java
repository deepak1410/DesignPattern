package org.corejava.designpattern.behavioral.command;

public class EditCommand implements Command {

	WordDocument doc;
	
	public EditCommand(WordDocument doc) {
		this.doc=doc;
	}

	@Override
	public void execute() {
		doc.edit();
	}

}
