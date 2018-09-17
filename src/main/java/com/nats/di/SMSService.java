package com.nats.di;

public class SMSService implements Service {

	@Override
	public void send(String message, String rec) {
		System.out.println("Sent SMS");
		
	}

}
