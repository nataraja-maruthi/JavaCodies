package com.nats.google.dependency.injection;

import com.google.inject.AbstractModule;

public class AppInjector extends AbstractModule {

	@Override
	protected void configure() {
		bind(MessageService.class).to(EmailService.class);
//		bind(MessageService.class).to(SMSService.class);
		
	}

}
