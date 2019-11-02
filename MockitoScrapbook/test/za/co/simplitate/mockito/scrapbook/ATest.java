package za.co.simplitate.mockito.scrapbook;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class ATest {
	
	@Mock
	B b;
	
	private A a;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		a = new A(b);
	}
	

	@Test
	public void usesVoidMethodShouldCallVoidMethod() throws Exception {
		doNothing().when(b).voidMethod();
		assertEquals(1, a.usesVoidMethod());
		verify(b,atLeastOnce()).voidMethod();
	}
	
	@Test(expected = RuntimeException.class)
	public void whenVoidMethodCalled_thenThrowException() throws Exception {
		doThrow(Exception.class).when(b).voidMethod();
		a.usesVoidMethod();
	}
	
	@Test(expected = RuntimeException.class)
	public void whenVoidMethodCalledTwice_thenDoNothingAndThrowException() throws Exception {
		doNothing().doThrow(Exception.class).when(b).voidMethod();
		a.usesVoidMethod();
		verify(b, atLeastOnce()).voidMethod();
		a.usesVoidMethod();
	}

}
