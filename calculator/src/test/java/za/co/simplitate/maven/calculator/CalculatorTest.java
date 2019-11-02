package za.co.simplitate.maven.calculator;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculatorTest {
	
	private int num1;
	private int num2;
	private int expectedResult;
	
	public CalculatorTest(int num1, int num2, int result) {
		this.num1 = num1;
		this.num2 = num2;
		this.expectedResult = result;
	}

	@Test
	public void test() {
		Calculator c = new Calculator();
		int result = c.add(num1, num2);
		assertEquals(expectedResult, result);
	}
	
	@Parameters
	public static Collection<Integer[]> data() {
		return Arrays.asList(new Integer[][] { {-1, 2, 1}, {1, 2, 3}, {6, 7, 13} });
	}

}
