package com.nats.di;

public class EmailServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {		
		return new MyMailerApplication(new EmailService());
	}

}
