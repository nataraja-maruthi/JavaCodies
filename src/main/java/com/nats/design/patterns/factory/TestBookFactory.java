package com.nats.design.patterns.factory;

public class TestBookFactory {
	public static void main(String[] args) {
		BookFactory bookFactory = new BookFactory();
		Book kannada = bookFactory.getBook(BookType.Kannada, "Bendre", "Nats", Language.KANNADA);
		kannada.displayData();
		Book science = bookFactory.getBook(BookType.Science, "science", "Nats", Language.ENGLISH);
		science.displayData();
		
	}

}
