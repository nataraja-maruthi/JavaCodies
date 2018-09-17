package com.nats.di;

public class SMSServiceInjector implements MessageServiceInjector{

	@Override
	public Consumer getConsumer() {
		// TODO Auto-generated method stub
		return new MyMailerApplication(new SMSService());
	}

}
