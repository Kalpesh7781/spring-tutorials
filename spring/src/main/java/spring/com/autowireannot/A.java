package spring.com.autowireannot;

import org.springframework.beans.factory.annotation.Autowired;

public class A {
@Autowired
B b;

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
	return "A [b=" + b + "]";
}

 

}
