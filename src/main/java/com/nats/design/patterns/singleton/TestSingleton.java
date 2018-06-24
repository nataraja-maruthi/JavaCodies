package com.nats.design.patterns.singleton;

public class TestSingleton {
	
	public static void main(String[] args) {
		SingletonClass instance1 = SingletonClass.getInstance();
		SingletonClass instance2 = SingletonClass.getInstance();
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
	}

}
