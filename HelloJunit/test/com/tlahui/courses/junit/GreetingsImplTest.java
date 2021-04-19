package com.tlahui.courses.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GreetingsImplTest {

	@Test
	void greetShouldReturnAValidOutput() {
		GreetingsImpl greet = new GreetingsImpl();
		String output = greet.greet("Tlahui");
		assertNotNull(output);
		assertEquals("Hello", output);
	}
}
