package comm.example.unt_testing;

import javax.swing.plaf.TextUI;

import org.junit.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

public class TestCalculator extends TestCase {
	
	int x, y;
	
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		System.out.println("Initialize method");
		x = 20;
		y = 10;
	}

	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
		System.out.println("Clear method");
		x = 0;
		y = 0;
	}

	@Test
	public void testAddMethod() {
		System.out.println("testAddMethod");
		int result = new Calculator(x,y).addMethod();
		assertEquals(30, result);
	}

	@Test
	public void testSubMethod() {
		System.out.println("testSubMethod");
		int result = new Calculator(x,y).subMethod();
		assertEquals(10, result);
	}
	
	@Test
	public void testcompareMethod() {
		int result = new Calculator(x,y).compareMethod();
		assertEquals(1, result);
	}
	
	
	public static void main(String args[]) {
		
	}

}
