package com;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;

@Entity
public class Employees {
@Id
private int empid;
private String empname;
private float salary;

public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
/*private int peid;				//FK

public int getPeid() {
	return peid;
}
public void setPeid(int peid) {
	this.peid = peid;
}*/
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}

}
