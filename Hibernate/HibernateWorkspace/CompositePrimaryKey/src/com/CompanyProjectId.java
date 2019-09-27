package com;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class CompanyProjectId implements Serializable{
private int cmpId;
private int projectid;
public int getCmpId() {
	return cmpId;
}
public void setCmpId(int cmpId) {
	this.cmpId = cmpId;
}
public int getProjectid() {
	return projectid;
}
public void setProjectid(int projectid) {
	this.projectid = projectid;
}

}
