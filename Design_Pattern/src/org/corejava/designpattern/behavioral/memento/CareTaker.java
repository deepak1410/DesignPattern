package org.corejava.designpattern.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

	private List<Memento> mementoList = new ArrayList<Memento>();
	
	public void addMemento(Memento memento) {
		mementoList.add(memento);
	} 
	
	public Memento getMemento(int index) {
		return mementoList.get(index);
	}
}
