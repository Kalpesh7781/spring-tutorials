package spring.com.beanannot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

 
public class Car {
	@Value("innova")
String name;
	@Value("toyota")
String brand;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public Car() {
	super();
	// TODO Auto-generated constructor stub
}
public Car(String name, String brand) {
	super();
	this.name = name;
	this.brand = brand;
}
@Override
public String toString() {
	return "Car [name=" + name + ", brand=" + brand + "]";
}

}
