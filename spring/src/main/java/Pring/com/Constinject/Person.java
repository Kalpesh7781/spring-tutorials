package Pring.com.Constinject;

public class Person {
	String name;
	int id;
	public Person(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "]";
	}
	

}
