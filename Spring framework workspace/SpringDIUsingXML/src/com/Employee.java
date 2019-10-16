package com;

import java.util.Arrays;
import java.util.List;

public class Employee {
private int id;
private String name;
private float salary;
private Address add;
private List<String> skillSet;
private int num[];


	public int[] getNum() {
	return num;
}

public void setNum(int[] num) {
	this.num = num;
}

	public List<String> getSkillSet() {
	return skillSet;
}

public void setSkillSet(List<String> skillSet) {
	this.skillSet = skillSet;
}

	public Address getAdd() {
	return add;
}

public void setAdd(Address add) {
	this.add = add;
}





	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", add=" + add + ", skillSet="
				+ skillSet + ", num=" + Arrays.toString(num) + "]";
	}

	public Employee() {
		super();
		id = 100;
		name = "Ravi";
		salary = 12000;
		System.out.println("object created...");
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Employee(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void display() {
		System.out.println("business method");
	}
}
