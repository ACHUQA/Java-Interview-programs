package sample;

public class Child extends Parent {

	public void c1() {
		System.out.println("Child class method...");
	}

	@Override
	public void p1() {
		System.out.println("Child class overriden method...");
	}

}
