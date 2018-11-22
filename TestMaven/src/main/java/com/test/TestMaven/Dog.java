package com.test.TestMaven;

public abstract class Dog {
	
	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void work();

}
