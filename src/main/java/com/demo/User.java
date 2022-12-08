package com.demo;

public class User {
private int id;
private String name;
private String city;


/*public void setId(int id) {
	this.id = id;
}


public void setName(String name) {
	this.name = name;
}


public void setCity(String city) {
	this.city = city;
}

*/



@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", city=" + city + "]";
}


public User(int id, String name, String city) {
	super();
	this.id = id;
	this.name = name;
	this.city = city;
}
	
	
	
	
	
	
}
