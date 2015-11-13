package org.corejava.designpattern.structural.proxy;

public class ProxyDemo {

	public static void main(String[] args) {
		
		User user1 = new User("John", 100, "Sales");
		User user2 = new User("David", 200, "Development");
		User user3 = new User("Matt", 310, "Marketting");
		
		IWebsite web = new WebsiteProxy();
		web.visitWebsite("http://www.facebook.com", user1);
		web.visitWebsite("http://www.google.com", user2);
		web.visitWebsite("http://www.twitter.com", user2);
		web.visitWebsite("http://www.facebook.com", user3);

	}

}
