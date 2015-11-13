package org.corejava.designpattern.creational.objectpool;

public class ObjectPoolTest {

	public static void main(String[] args) {
		// Set-up
		ReusableObjPool reusableObjPool = ReusableObjPool.getInstance();
		reusableObjPool.setMaxSize(3);
		
		ReusableObj reusableObj = reusableObjPool.acquireReusable();
		//reusableObjPool.releaseReusable(reusableObj);
		
		ReusableObj reusableObj1 = reusableObjPool.acquireReusable();
		//reusableObjPool.releaseReusable(reusableObj1);
		
		ReusableObj reusableObj2 = reusableObjPool.acquireReusable();
		reusableObjPool.releaseReusable(reusableObj2);
		
		ReusableObj reusableObj3 = reusableObjPool.acquireReusable();
		//reusableObjPool.releaseReusable(reusableObj3);
		
		ReusableObj reusableObj4 = reusableObjPool.acquireReusable();

		/* reusableObj2 is now releasing the lock*/
		reusableObjPool.releaseReusable(reusableObj2);
		
		ReusableObj reusableObj5 = reusableObjPool.acquireReusable();
		//reusableObjPool.releaseReusable(reusableObj5);

	}

}
