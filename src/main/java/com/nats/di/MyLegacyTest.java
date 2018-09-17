package com.nats.di;

public class MyLegacyTest {
	
	public static void main(String[] args) {
		
		MyMailerApplication app = new MyMailerApplication(new SMSService());
		app.processMessage("Hi", "mydest@gmail.com");
	}

}
