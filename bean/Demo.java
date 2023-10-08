package org.anudip.bean;

public class Demo {
	private int i;
    private double j;
    public Demo(){
   	 i=0;
   	 j=0.0;
   	 System.out.println("Non arg Constractor");
    }
    public Demo(int p, double q){
   	 i=p;
   	 j=q;
   	 System.out.println("Para Constractor");
    }
    public Demo(Demo d) {
   	 this.i=d.i;
   	 this.j=d.j;
   	 System.out.println("Copy constructor");
    }
    public void display() {
   	 System.out.println("The value of i: "+i);
   	 System.out.println("The value of i: "+j);
    }

}
