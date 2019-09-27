package com;

import javax.persistence.Entity;

@Entity
public class Programmer extends Employee {
private String projectName;

public String getProjectName() {
	return projectName;
}

public void setProjectName(String projectName) {
	this.projectName = projectName;
}

}
