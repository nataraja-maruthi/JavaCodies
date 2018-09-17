package com.nats.google.dependency.injection;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class ClientApplication {
	
	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new AppInjector());
		MyApplication app = injector.getInstance(MyApplication.class);
		app.processMessage("","");
	}
}
