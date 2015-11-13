package org.corejava.designpattern.behavioral.iterator;

public class IteratorImpl implements Iterator{

	//Container aggregate = null;
	Object obj[];
	int index=0;
	
	public Object[] getObj() {
		return obj;
	}

	public void setObj(Object[] obj) {
		this.obj = obj;
	}


	@Override
	public Boolean hasNext() {
		if(index < obj.length) {
			return true;
		}
		return false;
	}

	@Override
	public Object next() {
		return obj[index++];
	}

}
