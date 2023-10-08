package org.anudip.application;

public class MyAdditionApp {

	public static void main(String[] args) {
		int p =4;
		int q= 5;
		int r = 6;
		double d1=3.75;
		double d2=7.26;
		MyAddition md=new MyAddition();
		md.addition(p,d1);
		int ss=md.addition(p, q,r);
		md.addition(d1, d2);
        md.addition(q, r);
        md.addition(d2,r);

	}

}
