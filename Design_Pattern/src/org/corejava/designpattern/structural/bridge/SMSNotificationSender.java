package org.corejava.designpattern.structural.bridge;

public class SMSNotificationSender implements NotificationSender {

	@Override
	public void sendNotification(String msg) {
		System.out.println("Sending notification using SMS Channel.\n" + msg);
		
	}

}
