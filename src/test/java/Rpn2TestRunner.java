package test.java;


import static org.junit.Assert.*;

import org.junit.Test;

import main.java.RPNCalculator;

public class Rpn2TestRunner {
	
	@Test	
	public void testCase1(){
		String s = "2,2,+";
		RPNCalculator r = new RPNCalculator();
		assertEquals(4.00,r.rpnCalculator(s),0.001);
		
	}
	
	@Test	
	public void testCase2(){
		String s = "2,1,-";
		RPNCalculator r = new RPNCalculator();
		assertEquals(1.00,r.rpnCalculator(s),0.001);
		
	}
	
	@Test	
	public void testCase3(){
		String s = "2,1,*";
		RPNCalculator r = new RPNCalculator();
		assertEquals(2.00,r.rpnCalculator(s),0.001);
		
	}
	
	@Test	
	public void testCase4(){
		String s = "2,1,/";
		RPNCalculator r = new RPNCalculator();
		assertEquals(2.00,r.rpnCalculator(s),0.001);
		
	}
	
	@Test	
	public void testCase200(){
		String s = "2,2,*";
		RPNCalculator r = new RPNCalculator();
		assertEquals(4,r.rpnCalculator(s),0.001);
	}
	
	@Test	
	public void testCase201(){
		String s = "2,2,*,2,*";
		RPNCalculator r = new RPNCalculator();
		assertEquals(8,r.rpnCalculator(s),0.001);
	}
	
	@Test	
	public void testCase202(){
		String s = "2,2,*,2,*,3,*";
		RPNCalculator r = new RPNCalculator();
		assertEquals(24,r.rpnCalculator(s),0.001);
	}
	
	@Test	
	public void testCase203(){
		String s = "2,2,*,1,3,*,*";
		RPNCalculator r = new RPNCalculator();
		assertEquals(12,r.rpnCalculator(s),0.001);
	}
	
	@Test	
	public void testCase204(){
		String s = "2,2,*,2,1,*,*";
		RPNCalculator r = new RPNCalculator();
		assertEquals(8,r.rpnCalculator(s),0.001);
	}
	
	@Test	
	public void testCase5(){
		//Operator mismatch
		String s = "2,2";
		RPNCalculator r = new RPNCalculator();
		assertEquals(-1111,r.rpnCalculator(s),0.001);
		
	}
	
	@Test	
	public void testCase6(){
		//Empty String
		String s = " ";
		RPNCalculator r = new RPNCalculator();
		assertEquals(-1111,r.rpnCalculator(s),0.001);
		
	}
	
	

}
