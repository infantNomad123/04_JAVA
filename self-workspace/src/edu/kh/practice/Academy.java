package edu.kh.practice;

public class Academy {

	private String name;
	public Academy() {
		
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}

class Students extends Academy{
	public void name() {
	setName("kh");
	System.out.println(getName());
	}
}

class Main {
	public static void main(String [] args) {
		Students ac = new Students();
		ac.name();
	}
}
