package com;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class CompanyProjectInfo {
@EmbeddedId
private CompanyProjectId cpid;
	private float price;
	public CompanyProjectId getCpid() {
		return cpid;
	}
	public void setCpid(CompanyProjectId cpid) {
		this.cpid = cpid;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
}
