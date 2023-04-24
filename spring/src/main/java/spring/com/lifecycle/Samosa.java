package spring.com.lifecycle;

public class Samosa {
double price;

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public Samosa(double price) {
	super();
	this.price = price;
}

public Samosa() {
	super();
}

@Override
public String toString() {
	return "Samosa [price=" + price + "]";
}
public void init()
{
	System.out.println("init called");}
public void destroy()
{
	System.out.println("destroy called");
}
}
