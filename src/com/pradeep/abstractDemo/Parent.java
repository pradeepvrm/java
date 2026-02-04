package com.pradeep.abstractDemo;

public abstract class Parent {

	int age;
	
	public Parent(int age) {
		this.age = age;
	}

	static void hello() {
		System.out.println("hello");
	}

	void normal() {
		System.out.println("this is a normal method.");
	}

	
    abstract void career();
    abstract void partner();
    
}
