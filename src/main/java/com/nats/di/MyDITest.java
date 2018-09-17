package com.nats.di;

public class MyDITest {
	
	public static void main(String[] args) {
		
		MessageServiceInjector injector = null;
		
		injector = new EmailServiceInjector();
		injector.getConsumer().processMessage("", "");
		
		injector = new SMSServiceInjector();
		injector.getConsumer().processMessage("", "");
	}

}
