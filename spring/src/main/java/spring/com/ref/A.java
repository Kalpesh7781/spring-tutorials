package spring.com.ref;

public class A {
	int x;
	B b;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public B getB() {
		return b;
	}
	public void setB(B b) {
		this.b = b;
	}
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "A [x=" + x + ", b=" + b + "]";
	}
	

}
