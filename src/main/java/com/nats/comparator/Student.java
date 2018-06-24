package com.nats.comparator;

public class Student {
	int age;
	String name;
	int roolNum;
	
	public Student(int age, String name, int roolNum) {
		this.age = age;
		this.name = name;
		this.roolNum = roolNum;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoolNum() {
		return roolNum;
	}
	public void setRoolNum(int roolNum) {
		this.roolNum = roolNum;
	}
	
}
