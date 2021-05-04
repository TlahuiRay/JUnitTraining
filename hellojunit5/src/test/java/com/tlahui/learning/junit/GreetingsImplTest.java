package com.tlahui.learning.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GreetingsImplTest {
	private GreetingsImpl greetings;
	
	@BeforeEach public void setup() {
		System.out.println("Setup");
		greetings = new GreetingsImpl();
	}
	
	@Test
	public void greetShouldReturnAValidOutput() {
		System.out.println("greetShouldReturnAValidOutput");
		String output = greetings.greet("Tlahui");
		assertNotNull(output);
		assertEquals("Hello Tlahui", output);
	}
	
	@Test
	public void greetShouldThrowExcpecionWhen_NameIsNullLenghtZero() {	
		System.out.println("greetShouldThrowExcpecionWhen_NameIsNullLenghtZero");
		Assertions.assertThrows(IllegalArgumentException.class, 
				() -> { greetings.greet(""); });		
	}
	
	@Test
	public void greetShouldThrowExcpecionWhen_LenghtZero() {	
		System.out.println("greetShouldThrowExcpecionWhen_LenghtZero");
		Assertions.assertThrows(IllegalArgumentException.class, 
				() -> { greetings.greet(null); });
	}
	
	@AfterEach public void tearDown() {
		System.out.println("Tear Down");
		greetings = null;
		
	}
	
}
