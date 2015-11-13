package org.corejava.collections;

import java.util.HashMap;
import java.util.Map;

public class CollectionTest {
	
	public CollectionTest(){}
	public CollectionTest(String s){}
	
	public void testHashMap() {

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		/*String str1 = "abcdef";
		String str2 = "abcdfG";
		String str3 = "abcdfH";
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		
		map.put(str1, 1);
		map.put(str2, 2);
		map.put(str3, 3);
		
		for(int i=0; i<25; i++) {
			map.put("a" + i, 10+i);
		}*/
		
		HashMap<CollectionTest, Integer> amap = new HashMap<CollectionTest, Integer>();
		
		CollectionTest c1 = new CollectionTest() {
			public int hashCode() {
				return 10;
			}
			
		};
		
		CollectionTest c2 = new CollectionTest() {
			public int hashCode() {
				return 20;
			}
			
		};
		
		CollectionTest c3 = new CollectionTest() {
			public int hashCode() {
				return 30;
			}
			
		};
		
		amap.put(c1, 1);
		amap.put(c2, 1);
		amap.put(c3, 3);
		
		System.out.println("...");

		
	}
	
	/*public int hashCode() {
		return 10;
	}*/
	
	/*public boolean equals(Object o) {
		return true;
	}*/
	
	

	public static void main(String[] args) {
		CollectionTest collectionTest = new CollectionTest();
		collectionTest.testHashMap();
	}

}
