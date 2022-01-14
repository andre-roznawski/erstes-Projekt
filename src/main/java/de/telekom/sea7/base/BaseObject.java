package de.telekom.sea7.base;

class BaseObject /* extends Object */ {

	public BaseObject(int id) {
		this.id = id;
	}
	public BaseObject(Object parent, int id) {
		this.id = id; //BaseObject(id);
		this.parent = parent;
		

	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String toString() {
	String b = "Hallo BaseObject " + super.toString();
		return b;
	}

	private int id;
	private Object parent;
	
	public Object getParent() {
		return parent;
	}
	public void setParent(Object parent) {
		this.parent = parent;
	} 

}
