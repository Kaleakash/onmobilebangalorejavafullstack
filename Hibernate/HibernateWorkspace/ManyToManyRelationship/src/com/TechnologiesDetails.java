package com;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="tech")
public class TechnologiesDetails {
@Id
private int techId;
private String techName;
@ManyToMany
private List<EmployeeDetails> listOfEmployees;
public int getTechId() {
	return techId;
}
public void setTechId(int techId) {
	this.techId = techId;
}
public String getTechName() {
	return techName;
}
public void setTechName(String techName) {
	this.techName = techName;
}
public List<EmployeeDetails> getListOfEmployees() {
	return listOfEmployees;
}
public void setListOfEmployees(List<EmployeeDetails> listOfEmployees) {
	this.listOfEmployees = listOfEmployees;
}

}
