package org.anudip.application;
import org.anudip.bean.Demo;
public class DemoMain {

	public static void main(String[] args) {
		Demo d1=new Demo();
		d1.display();
		Demo d2=new Demo();
		d2.display();
		
		int x=20;
		double y=27.56;
		Demo d3 = new Demo(x,y);
		d3.display();
		Demo d4 = new Demo(d3);
		d4.display();
		//d1 and d2 and d3 and d4 are two different instance of Demo class
		//4 types of constructor==default,non parameterized,parameterized,copy
		
		
		
	}

}
