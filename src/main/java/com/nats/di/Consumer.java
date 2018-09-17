package com.nats.di;

public interface Consumer {

	void processMessage(String message, String rec);
}
