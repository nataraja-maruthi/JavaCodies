package com.nats.google.dependency.injection;

import javax.inject.Singleton;

@Singleton
public class SMSService implements MessageService {

	@Override
	public void sendMessage(String message, String rec) {
		System.out.println("Send SMS message");
		
	}

}
