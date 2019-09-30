package com;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
@Entity
public class Trainer {
@Id
private int tid;
private String tname;
private String tech;
@OneToMany(mappedBy = "tsid",fetch = FetchType.EAGER)		//refer to FK
//@Cascade(CascadeType.SAVE_UPDATE)			//Can save student object through Trainer 
																			//can't delete 
private List<Student> listOfStd;
public Trainer() {
	// TODO Auto-generated constructor stub
	System.out.println("Trainer object");
}
public int getTid() {
	return tid;
}
public void setTid(int tid) {
	this.tid = tid;
}
public String getTname() {
	return tname;
}
public void setTname(String tname) {
	this.tname = tname;
}
public String getTech() {
	return tech;
}
public void setTech(String tech) {
	this.tech = tech;
}
public List<Student> getListOfStd() {
	return listOfStd;
}
public void setListOfStd(List<Student> listOfStd) {
	this.listOfStd = listOfStd;
}

}
