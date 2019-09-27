package com;

import javax.persistence.Entity;

@Entity	
public class Manager extends Employee{
private int numberOfEmp;

public int getNumberOfEmp() {
	return numberOfEmp;
}

public void setNumberOfEmp(int numberOfEmp) {
	this.numberOfEmp = numberOfEmp;
}

}
