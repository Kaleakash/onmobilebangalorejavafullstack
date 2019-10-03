package com;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity
public class Courses {
@Id
private int cid;
private String courseName;
@ManyToMany(cascade = CascadeType.REMOVE)
@JoinTable(name = "std_crs",
joinColumns = {@JoinColumn(name="cid")},
inverseJoinColumns = {@JoinColumn(name="sid")})
private List<Students> listOfStd;
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}
public List<Students> getListOfStd() {
	return listOfStd;
}
public void setListOfStd(List<Students> listOfStd) {
	this.listOfStd = listOfStd;
}

}
