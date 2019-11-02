package za.co.simplitate.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GreetingImplTest {
	
	private Greeting greeting;
	
	@Before
	public void setup() {
		System.out.println("setup");
		greeting = new GreetingImpl();
	}

	@Test
	public void greetShouldReturnValidOutput() {
		System.out.println("greetShouldReturnValidOutput");
		String result = greeting.greet("Junit");
		assertNotNull(result);
		assertEquals("Hello Junit", result);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void whenNameIsNull_thenGreetShouldThrowException() {
		System.out.println("whenNameIsNull_thenGreetShouldThrowException");
		greeting.greet(null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void whenNameIsBlank_thenGreetShouldThrowException() {
		System.out.println("whenNameIsBlank_thenGreetShouldThrowException");
		greeting.greet(null);
	}
	
	@After
	public void teardown() {
		System.out.println("teardown");
		greeting = null;
	}

}
