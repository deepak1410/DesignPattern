package org.corejava.designpattern.structural.bridge;

import java.util.Scanner;

public class BridgeDemo {

	public static void main(String[] args) {
		System.out.println(">>>>>>>>Please enter the message to send:");
		Scanner scanner = new Scanner(System.in);
		String msg = scanner.nextLine();
		
		System.out.println(">>>>>>Please choose the channel: SMS, Email");
		Scanner scanner1 = new Scanner(System.in);
		String channel = scanner1.nextLine();
		
		Notification notification = null;
		if(channel.equalsIgnoreCase("SMS")) {
			notification = new ShortMessageNotification();
			notification.setNotificationSender(new SMSNotificationSender());
			notification.sendNotification(msg);
		} else if(channel.equalsIgnoreCase("Email")) {
			notification = new LongMessageNotification();
			notification.setNotificationSender(new EmailNotificationSender());
			notification.sendNotification(msg);
		} else {
			System.out.println("Unidentified channel:" + channel);
		}

	}

}
