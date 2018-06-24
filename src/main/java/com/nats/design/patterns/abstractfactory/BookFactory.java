package com.nats.design.patterns.abstractfactory;

public class BookFactory {
	public Book getBook(BookAbstractFactory factory) {
		return factory.getBook();
	}
}
