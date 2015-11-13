package org.corejava.designpattern.structural.bridge;

public class LongMessageNotification extends Notification {
	
	@Override
	public void sendNotification(String msg) {
		notificationSender.sendNotification(msg);
	}

}
