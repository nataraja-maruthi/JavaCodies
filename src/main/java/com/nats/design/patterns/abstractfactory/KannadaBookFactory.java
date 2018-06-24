package com.nats.design.patterns.abstractfactory;

import com.nats.design.patterns.abstractfactory.Language;

public class KannadaBookFactory implements BookAbstractFactory{

	String name;
	String author;
	Language lang;
	
	@Override
	public Book getBook() {
		return new KannadaBook(name, author, lang);
	}
	
	public KannadaBookFactory(String name, String author, Language lang) {
		this.author = author;
		this.name = name;
		this.lang = lang;
				
	}

}
