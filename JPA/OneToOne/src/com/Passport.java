package com;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Passport {
@Id
private int ppId;
private String passportDesc;
@OneToOne(cascade = CascadeType.ALL)
private Person pp;

public Person getPp() {
	return pp;
}
public void setPp(Person pp) {
	this.pp = pp;
}
public int getPpId() {
	return ppId;
}
public void setPpId(int ppId) {
	this.ppId = ppId;
}
public String getPassportDesc() {
	return passportDesc;
}
public void setPassportDesc(String passportDesc) {
	this.passportDesc = passportDesc;
}

}
