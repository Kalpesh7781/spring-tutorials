package spring.com.collect;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
String name;
List <String> phones;
Set <String> Address;
Map <String,String> course;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<String> getPhones() {
	return phones;
}
public void setPhones(List<String> phones) {
	this.phones = phones;
}
public Set<String> getAddress() {
	return Address;
}
public void setAddress(Set<String> address) {
	Address = address;
}
public Map<String, String> getCourse() {
	return course;
}
public void setCourse(Map<String, String> course) {
	this.course = course;
}
public Employee(String name, List<String> phones, Set<String> address, Map<String, String> course) {
	super();
	this.name = name;
	this.phones = phones;
	Address = address;
	this.course = course;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

}
