package com;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Customer {
@Id	
private int custId;
private String name;
@Temporal(TemporalType.TIMESTAMP)
private LocalDateTime dob;
public int getCustId() {
	return custId;
}
public void setCustId(int custId) {
	this.custId = custId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public LocalDateTime getDob() {
	return dob;
}
public void setDob(LocalDateTime dob) {
	this.dob = dob;
}

}
