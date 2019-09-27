package com;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="emps")
public class EmployeeDetails {
@Id
private int empId;
private String name;
@ManyToMany(cascade = CascadeType.ALL)

@JoinTable(name="emp_tech",
joinColumns={@JoinColumn(name="empId")},
inverseJoinColumns={@JoinColumn(name="techId")})

private List<TechnologiesDetails> listOfTech;
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<TechnologiesDetails> getListOfTech() {
	return listOfTech;
}
public void setListOfTech(List<TechnologiesDetails> listOfTech) {
	this.listOfTech = listOfTech;
}

}
