package com.nats.design.patterns.factory;

public class ScienceBook implements Book {
	
	String name;
	String author;
	Language lang;
	
	public ScienceBook(String name, String author, Language lang) {
		this.name = name;
		this.author = author;
		this.lang = lang;		
	}

	@Override
	public void displayData() {
		System.out.println("Name : " + name + " Author : " + author + " : Language : " + lang);
		
	}
}
