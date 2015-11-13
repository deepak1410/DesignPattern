package org.corejava.designpattern.structural.bridge;

public class ShortMessageNotification extends Notification {

	@Override
	public void sendNotification(String msg) {
		notificationSender.sendNotification(msg);
	}

}
