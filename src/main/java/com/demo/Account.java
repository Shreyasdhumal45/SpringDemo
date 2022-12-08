package com.demo;

public class Account {
private int id;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

@Override
public String toString() {
	return "Account [id=" + id + "]";
}


}
