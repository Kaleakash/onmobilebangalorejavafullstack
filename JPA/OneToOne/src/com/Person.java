package com;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Person {
@Id
private int pId;
private String personName;
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "passport_person_id")
private Passport pp;
public int getpId() {
	return pId;
}
public void setpId(int pId) {
	this.pId = pId;
}
public String getPersonName() {
	return personName;
}

public void setPersonName(String personName) {
	this.personName = personName;
}

public Passport getPp() {
	return pp;
}

public void setPp(Passport pp) {
	this.pp = pp;
}

}
