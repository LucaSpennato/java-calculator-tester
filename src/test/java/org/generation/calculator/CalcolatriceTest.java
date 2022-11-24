package org.generation.calculator;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalcolatriceTest {

	private Calcolatrice calc = null;
	
	@BeforeEach
	void init(){
		
		calc = new Calcolatrice();
		
		calc.add(2.3f, 3.5f);
		calc.divide(1.2f, 2.2f);
		calc.subtract(1.2f,2.4f);
		calc.multiply(3.2f,5.3f);
	}
	
	@Test
	@DisplayName("Add testing")
	void addTest() {
		float add = calc.add(2.0f, 3.0f);
		assertEquals(5f, add);
	}
	
	@Test
	@DisplayName("sub testing")
	void subTest() {
		float sub = calc.subtract(5f, 10f);
		assertEquals(-5f, sub);
	}
	
	@Test
	@DisplayName("multiply testing")
	void mulTest() {
		float mul = calc.multiply(2f, 3f);
		assertEquals(6f, mul);
	}
	
	@Test
	@DisplayName("divide test with throw")
	void divTest() {
		Calcolatrice div = new Calcolatrice();
		assertThrows(
				IllegalArgumentException.class, 
				() -> div.divide(3f, 0f));
		assertDoesNotThrow(() -> div.divide(5f, 2f) );
	}
}
