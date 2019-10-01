package com;

import java.util.List;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity

public class Projects {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int pid;
private String typeOfProject;
@OneToMany(cascade = CascadeType.ALL)				// Hibernate @OneToMany(mappedBy="tsid")
@JoinColumn(name = "peid")			// Refer to the FK 
private List<Employees> listOfEmp;
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getTypeOfProject() {
	return typeOfProject;
}
public void setTypeOfProject(String typeOfProject) {
	this.typeOfProject = typeOfProject;
}
public List<Employees> getListOfEmp() {
	return listOfEmp;
}
public void setListOfEmp(List<Employees> listOfEmp) {
	this.listOfEmp = listOfEmp;
}

}
