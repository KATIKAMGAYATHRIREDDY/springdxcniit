package aop.model;

public class Circle {
	String name;
	/*public Circle() {
		System.out.println("in circle constructor");
	}*/
	public String getName() {
		throw new RuntimeException();

		//return name;
	}

	public void setName(String name) {
		this.name = name;
		throw new RuntimeException();

	}
	public int getDia() {
		return 5;
	}
	
	
}
