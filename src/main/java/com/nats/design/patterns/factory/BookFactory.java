package com.nats.design.patterns.factory;

public class BookFactory {
	
	public Book getBook(BookType type, String name, String author, Language lang) {
		Book book = null ;
		switch (type) {
		case Kannada:
			book = new KannadaBook(name, author, lang);	
			break;
		case Science:
		     book = new ScienceBook(name, author, lang);
		     break;
		case Social:     
		     book = new SocialBook(name, author, lang);
		     break;
		default:		 
			break;
		}
		return book;
	}
}
