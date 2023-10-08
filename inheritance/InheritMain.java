package org.anudip.inheritance;

public class InheritMain {

	public static void main(String[] args) {
		/*Child ch = new Child();
		ch.display();
		ch.show();*/
		Parent p = new Child();
		p.show();
		System.out.println("The hash code of p: "+p.hashCode());
		Child cc = (Child)p;
		cc.display();
		System.out.println("The hash code of p: "+cc.hashCode());

	}

}

