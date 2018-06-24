package com.nats.design.patterns.abstractfactory;

public class ScienceBookFactory implements BookAbstractFactory {

	String name;
	String author;
	Language lang;
	
	@Override
	public Book getBook() {
		return new ScienceBook(name, author, lang);
	}
	
	public ScienceBookFactory(String name, String author, Language lang) {
		this.author = author;
		this.name = name;
		this.lang = lang;
				
	}
}
