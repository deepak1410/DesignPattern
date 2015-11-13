package org.corejava.designpattern.behavioral.iterator;

public class ContainerImpl implements Container{

	Object[] obj;

	@Override
	public Iterator iterator() {
		Iterator iterator = new IteratorImpl();
		((IteratorImpl) iterator).setObj(obj);
		return iterator;
	}

	public Object[] getObj() {
		return obj;
	}

	public void setObj(Object[] obj) {
		this.obj = obj;
	}
	
}
