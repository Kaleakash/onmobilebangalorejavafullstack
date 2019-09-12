import java.io.*;
class Employee implements Serializable{
	private int id;
	private String name;
	private float salary;
	Employee() {}
	Employee(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public String toString() {
return "Id is "+id+" Name is "+name+" Salary is "+salary;
	}
}
class EmployeeService {
	static Employee emp[];
	static {
	try{
	FileInputStream fis = new FileInputStream("emp.ser");
	ObjectInputStream ois = new ObjectInputStream(fis);
	emp = (Employee[])ois.readObject();
	}catch(Exception e){
	System.out.println(e);
	}
		if(emp==null){
			emp=new Employee[100];
		}
		
	}	
	public void storeObjectInFile() throws Exception{
	FileOutputStream fos = new FileOutputStream("emp.ser");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp);	
	}
}
class IoDemo {
	public static void main(String args[]) throws Exception{
	EmployeeService es = new EmployeeService();


	

	es.storeObjectInFile();	
	}
}



