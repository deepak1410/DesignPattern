package org.corejava.designpattern.creational.objectpool;

import java.util.ArrayList;
import java.util.List;

public class ReusableObjPool {

	private static ReusableObjPool instance = null;
	private ReusableObjPool() {};
	private int maxSize;
	private static int currentPoolSize;
	private List<ReusableObj> objList = new ArrayList<ReusableObj>();

	public void setMaxSize(int maxSize) {
		this.maxSize = maxSize;
	}
	
	public ReusableObj acquireReusable() {
		System.out.println("Entering acquireReusable");
		System.out.println("In acquireReusable: currentPoolSize=" +currentPoolSize + ", maxSize=" +maxSize);
		
		if(objList.size() > 0){
			ReusableObj obj1 = objList.get(0);
			objList.remove(0);
			System.out.println("Returning the existing object...");
			return obj1;
		} else if(currentPoolSize < maxSize && objList.size() == 0) {
				currentPoolSize++;
				System.out.println("Creating new instance and returning. currentPoolSize=" + currentPoolSize);
				return new ReusableObj();
		}

		System.out.println("Number of existing instances have reached max pool size. Waiting for other thread to release the lock");
		return null;
	}
	
	public void releaseReusable(ReusableObj reusableObj) {
		System.out.println("Entering releaseReusable: reusableObj=" + reusableObj);
		if(reusableObj != null && objList.size() < maxSize) {
			objList.add(reusableObj);
			System.out.println("Releasing Object: " + " CurrentPoolSize=" + currentPoolSize + ", Total Objects in Pool=" + objList.size());
		}
	}
	
	public static ReusableObjPool getInstance() {
		if(instance == null) {
			instance = new ReusableObjPool();
		}
		return instance;
	}
}
