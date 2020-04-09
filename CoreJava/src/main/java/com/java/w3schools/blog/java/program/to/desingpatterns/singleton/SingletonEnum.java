package com.java.w3schools.blog.java.program.to.desingpatterns.singleton;

public enum SingletonEnum {

	INSTANCE("enum singleton");

	private String state;

	private SingletonEnum(String state) {
        this.state = state;
    }

	public SingletonEnum getInstance() {
		return INSTANCE;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
