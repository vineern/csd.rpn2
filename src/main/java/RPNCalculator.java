package main.java;

import java.util.Stack;

public class RPNCalculator {
String rpnStr="";
Stack st = new Stack();

public double rpnCalculator(String str){
	String[] strArr =  str.split(",");
	for(String s: strArr){
		if(s.matches("^-?\\d*\\.{0,1}\\d+$")){
			st.push(s.trim());
		}else{
			int r = operatorCall(s.trim());
			if(r!=0){
				return -1111;
			}
		}
	}
	if(st.size()!=1){
		//some error
		return -1111;
	}
	return Double.parseDouble(st.pop().toString());	
}

public int operatorCall(String opr){
	if(st.size()<2){
		//some error
		return -1111;
	}
	double b = Double.parseDouble(st.pop().toString());
	if("!".equals(opr)){
		int c=(int)b;
		st.push(UnaryOperations.factorial(c));
	}
	double a = Double.parseDouble(st.pop().toString());
	if("+".equals(opr))
		st.push(Addition.add(a,b));
	
	if("-".equals(opr))
		st.push(Subtraction.subtract(a,b));
	
	if("*".equals(opr))
		st.push(Multiplication.multiply(a,b));
	
	if("/".equals(opr))
		st.push(Division.divide(a,b));
	
	
	
	return 0;
}
}
