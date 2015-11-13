package org.corejava.designpattern.behavioral.command;

public class OpenCommand implements Command {

	WordDocument doc;
	
	public OpenCommand(WordDocument doc) {
		this.doc=doc;
	}

	@Override
	public void execute() {
		doc.open();
	}

}
