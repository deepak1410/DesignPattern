package org.corejava.features;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExTest {

	public int countOccurances(String source, String substring) {
		Pattern pattern = Pattern.compile(substring);
		Matcher matcher = pattern.matcher(source);
		int occurances = 0;
		while(matcher.find()) {
			occurances++;
		}
		
		return occurances;
	}
	
	
	public static void main(String[] args) {
		RegExTest regExTest = new RegExTest();
		int occurances = regExTest.countOccurances("Hello java, marjava mitjava", "java");
		System.out.println("Occurances=" + occurances);
	}

}
