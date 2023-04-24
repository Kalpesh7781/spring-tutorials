package spring.com.autowireannot;

public class B {
int x;
int y;
public B() {
	super();
	// TODO Auto-generated constructor stub
}
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}
@Override
public String toString() {
	return "B [x=" + x + ", y=" + y + "]";
}

}
