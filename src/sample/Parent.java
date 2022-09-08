package sample;

public class Parent {

	public void p1() {
		System.out.println("Parent class method ..");
	}

	public void p2() {
		System.out.println("Parent class not overriden method ...");
	}

	public static void main(String[] args) {

		Parent c = new Parent();

		c.p1();
		c.p2();

	}

}
