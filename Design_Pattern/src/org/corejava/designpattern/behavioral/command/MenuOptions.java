package org.corejava.designpattern.behavioral.command;

public class MenuOptions {

	Command openCmd;
	Command editCmd;
	Command saveCmd;
	
	public MenuOptions(Command openCmd, Command editCmd, Command saveCmd) {
		this.openCmd=openCmd;
		this.editCmd=editCmd;
		this.saveCmd=saveCmd;
	}
	
	public void open() {
		openCmd.execute();
	}
	
	public void edit() {
		editCmd.execute();
	}
	
	public void save() {
		saveCmd.execute();
	}

}
