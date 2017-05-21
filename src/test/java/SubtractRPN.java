package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.RPNCalculator;

public class SubtractRPN {
	
	@Test	
	public void testCase100(){
		String s = "2,2,-";
		RPNCalculator r = new RPNCalculator();
		assertEquals(0,r.rpnCalculator(s),0.001);
	}
	
	@Test	
	public void testCase101(){
		String s = "2,1,-";
		RPNCalculator r = new RPNCalculator();
		assertEquals(1,r.rpnCalculator(s),0.001);
	}
	@Test	
	public void testCase102(){
		String s = "1,2,-";
		RPNCalculator r = new RPNCalculator();
		assertEquals(-1,r.rpnCalculator(s),0.001);
	}
	@Test	
	public void testCase103(){
		String s = "0,0,-";
		RPNCalculator r = new RPNCalculator();
		assertEquals(0,r.rpnCalculator(s),0.001);
	}

	@Test	
	public void testCase104(){
		String s = "3,1,2,-,-";
		RPNCalculator r = new RPNCalculator();
		assertEquals(4,r.rpnCalculator(s),0.001);
	}

	@Test	
	public void testCase105(){
		String s = "-1,-2,-";
		RPNCalculator r = new RPNCalculator();
		assertEquals(1,r.rpnCalculator(s),0.001);
	}
	
	@Test	
	public void testCase106(){
		String s = "2,3,-,4,5,-,-";
		RPNCalculator r = new RPNCalculator();
		assertEquals(0,r.rpnCalculator(s),0.001);
		}	
		
}
