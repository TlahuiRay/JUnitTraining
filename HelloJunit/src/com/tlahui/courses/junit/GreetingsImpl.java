package com.tlahui.courses.junit;

public class GreetingsImpl implements Greetings {

	@Override
	public String greet(String name) {
		return "Hello " + name;
	}
}
