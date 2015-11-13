package org.corejava.designpattern.creational.objectpool;

public class ReusableObj {
	private String objName;

	public String getObjName() {
		return objName;
	}

	public void setObjName(String objName) {
		this.objName = objName;
	}
	
	public String toString() {
		return "ReusableObj[" + this.getObjName() + "]";
	}

}
