package spring.com.collectionusingcomponent;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Student {
	@Value("Mayur")
String name;
	@Value("Mumbai")
String city;
	@Value("#{phone}")
List <String> phones;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public List<String> getPhones() {
	return phones;
}
public void setPhones(List<String> phones) {
	this.phones = phones;
}
@Override
public String toString() {
	return "Student [name=" + name + ", city=" + city + ", phones=" + phones + "]";
}

}
