package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy(value = false)
@Scope("prototype")
public class Employee {
private int id;
private String name;
@Autowired
private Location ll;
public int getId() {
	return id;
}
dpublic void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Location getLl() {
	return ll;
}
public void setLl(Location ll) {
	this.ll = ll;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", ll=" + ll + "]";
}
public Employee() {
	// TODO Auto-generated constructor stub
	System.out.println("employee object created...");
}
}
