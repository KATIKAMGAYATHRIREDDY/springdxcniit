package aop.model;

public class Triangle {
String name;
public Triangle() {
	System.out.println("in triangle constructor");
}
	//public Triangle() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
