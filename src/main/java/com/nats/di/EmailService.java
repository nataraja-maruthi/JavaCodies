package com.nats.di;

public class EmailService implements Service{

	@Override
	public void send(String message, String rec) {
		System.out.println("EMail Sent");
		
	}
}
