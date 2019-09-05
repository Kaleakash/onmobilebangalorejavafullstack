import java.util.Scanner;
class Address {
	String city;
	String state;
	
}
class Employee {
	int id;
	String name;
	float salary;
	
	Scanner obj =new Scanner(System.in);
	Address add = new Address();	
	void read() {
		
		System.out.println("Enter the id");
		id = obj.nextInt();
		System.out.println("Enter the name");
		name= obj.next();
		System.out.println("Enter the salary");
		salary = obj.nextFloat();
	}
	
	void calSalary() {
		float hra, da,pf;
		hra = salary*0.10f;
		da = salary *0.05f;
		pf = salary *0.07f;
		salary = salary+hra+da-pf;
	}
	
	void display() {
	System.out.println("Id is "+id+" name is "+name+" salary is "+salary);
	}
}

class Manager extends Employee {
	Address add = new Address();		
	int numberOfEmp;
	void readMgr() {
		System.out.println("Enter the number of employee working undere him");
		numberOfEmp = obj.nextInt();
		add.readAddress();
	}
	void disMgr() {
		System.out.println("Number of Employee "+numberOfEmp);
		add.disAddress();
	}
}

class Programmer extends Employee {
	String projectName;
	void readPrg() {
		System.out.println("Enter the project Name");
		projectName = obj.next();
	}
	void disPrg() {
		System.out.println("Project Name "+projectName);
	}
}

class EmployeeTest {
	public static void main(String args[]) {
	Manager mgr = new Manager();
	mgr.read();
	mgr.readMgr();
	mgr.calSalary();
	mgr.display();
	mgr.disMgr();	
	}
}