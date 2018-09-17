package com.nats.google.dependency.injection;

public interface MessageService {
	
	public void sendMessage(String message, String rec);

}
