package com.nats.google.dependency.injection;

import javax.inject.Singleton;

@Singleton
public class EmailService implements MessageService{

	@Override
	public void sendMessage(String message, String rec) {
		System.out.println("Sent Email");
		
	}

}
