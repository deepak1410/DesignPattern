package org.corejava.designpattern.structural.bridge;

public class EmailNotificationSender implements NotificationSender {

	@Override
	public void sendNotification(String msg) {
		System.out.println("Sending notification using Email Channel.\n" + msg);
	}

}
