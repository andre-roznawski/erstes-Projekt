package de.telekom.sea7.base;

//public class Application extends BaseObject extends Object 
public class Application extends BaseObject {
	public Application() {                          //Construktor
		super(null, 1);

	}

	public void run(String[] args) {

		Auto auto = new Auto(this, 2);
		System.out.println(auto.toString());
		System.out.println(auto.getParent());
	}

}
