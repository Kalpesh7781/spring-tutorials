package spring.com;

public class Student {
String name;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRoll() {
	return roll;
}
public void setRoll(int roll) {
	this.roll = roll;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
int roll;
String city;
public Student(String name, int roll, String city) {
	super();
	this.name = name;
	this.roll = roll;
	this.city = city;
}

public Student() {
	super();
}
@Override
public String toString() {
	return "Student [name=" + name + ", roll=" + roll + ", city=" + city + "]";
}

}
