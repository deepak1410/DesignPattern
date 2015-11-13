package org.corejava.designpattern.structural.proxy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WebsiteProxy implements IWebsite {
	
	private static List<String> blockedWebsites = new ArrayList<String>();
	private IWebsite web = new Website();
	
	static {
		blockedWebsites.add("facebook");
		blockedWebsites.add("twitter");
		blockedWebsites.add("youtube");
	}
	
	

	@Override
	public void visitWebsite(String website, User user) {
		boolean isAccess = true;
		if(user.getDepartment().equalsIgnoreCase("sales") || user.getDepartment().equalsIgnoreCase("Marketting")) {
			web.visitWebsite(website, user);
		} else {
			for(String site : blockedWebsites) {
				if(website.indexOf(site) != -1) {
					isAccess = false;
				} else {
					continue;
				}
			}
			
			if(isAccess) {
				web.visitWebsite(website, user);
			} else {
				System.out.println("Unauthorized access: Sorry you do not have access to " + website);
			}
			
		}

	}

}
