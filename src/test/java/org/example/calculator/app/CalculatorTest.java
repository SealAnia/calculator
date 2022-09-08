package org.example.calculator.app;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariuszgromada.math.mxparser.Expression;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase{
	
	@BeforeEach
	protected void setUp() throws Exception {
		System.out.println("Test started: ");
	}
	
	@AfterEach
	protected void tearDown() throws Exception {
		System.out.println("Test ended: ");
	}

	@Test
	void testGenerateExercise() {
		assertEquals("3+8/6", Calculator.generateExercise("resources/test_file.txt"));
	}
	
	@Test
	void testCount() {
		Expression expression = new Expression();
        expression.setExpressionString(Calculator.generateExercise("resources/test_file.txt"));
        assertEquals(4, (int) expression.calculate());
	}
	
}
