package com;

import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity
@Cacheable
public class Students {
@Id
private int sid;
private String studentName;
@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
@JoinTable(name = "std_crs",
joinColumns = {@JoinColumn(name="sid")},
inverseJoinColumns = {@JoinColumn(name="cid")})
private List<Courses> listOfCrs;
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public List<Courses> getListOfCrs() {
	return listOfCrs;
}
public void setListOfCrs(List<Courses> listOfCrs) {
	this.listOfCrs = listOfCrs;
}

}
