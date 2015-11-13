package org.corejava.designpattern.structural.bridge;

public abstract class Notification {
	protected NotificationSender notificationSender;

	public abstract void sendNotification(String msg);

	public NotificationSender getNotificationSender() {
		return notificationSender;
	}

	public void setNotificationSender(NotificationSender notificationSender) {
		this.notificationSender = notificationSender;
	}

}
