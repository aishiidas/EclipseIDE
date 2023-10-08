package org.anudip.application;
public class MyMathApp {
	 public int addition(int x, int y) {
		 return x+y;
	 }
	 public int multiply(int a,int b,String op) {
		 if(op.equals("*"))
			 return a*b;
		 else
			 throw new OperatorException();
		
	 }
	 public int division(String a,String b) {
		int x =Integer.parseInt(a);
		int y=Integer.parseInt(b);
		return x/y;
	 }
	}