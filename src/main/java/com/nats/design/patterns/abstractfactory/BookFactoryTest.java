package com.nats.design.patterns.abstractfactory;

public class BookFactoryTest {
	
	public static void main(String[] args) {
		BookFactory bookFactory = new BookFactory();
		Book book = bookFactory.getBook(new KannadaBookFactory("Dara", "Nats", Language.KANNADA));
		book.displayData();
	}

}
