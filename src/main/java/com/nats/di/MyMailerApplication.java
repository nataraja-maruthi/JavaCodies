package com.nats.di;

public class MyMailerApplication implements Consumer{

	private Service service = null;
	public MyMailerApplication(Service serv) {
		this.service = serv;
	}
	
	public void processMessage (String msg, String rec) {
		this.service.send(rec, msg);
	}
}
