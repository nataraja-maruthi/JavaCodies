package com.nats.google.dependency.injection;

import javax.inject.Inject;

public class MyApplication {

	private MessageService service = null;
	
	
	@Inject
	public void setService(MessageService service) {
		this.service = service;
	}
	
	public void processMessage (String message, String rec) {
		service.sendMessage(message, rec);
	}
}
